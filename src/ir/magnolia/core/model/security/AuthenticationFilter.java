package ir.magnolia.core.model.security;

import ir.magnolia.core.model.dao.MemberDAOImpl;
import ir.magnolia.core.model.entity.Member;
import org.apache.commons.codec.binary.Base64;

import javax.annotation.Priority;
import javax.ejb.EJB;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.nio.charset.Charset;

@Secured
@Provider
@Priority(Priorities.AUTHENTICATION)
public class AuthenticationFilter implements ContainerRequestFilter {

    @EJB
    private MemberDAOImpl memberDAO;

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        String authorizationHeader = containerRequestContext.getHeaderString(HttpHeaders.AUTHORIZATION);

        if (authorizationHeader == null || !authorizationHeader.startsWith("Basic ")) {
            throw new NotAuthorizedException("Authorization header must be provided");
        }

        String token = authorizationHeader.substring("Basic".length()).trim();
        String parameter = new String(Base64.decodeBase64(token.getBytes(Charset.forName("UTF-8"))));
        String[] credential = parameter.split(":");

        Member member = memberDAO.findByCodeAndMobileNumber(credential[0], credential[1]);

        if (member == null) {
            containerRequestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
        }
    }


}
