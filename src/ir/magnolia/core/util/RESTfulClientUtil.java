package ir.magnolia.core.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;

import java.nio.charset.Charset;

public class RESTfulClientUtil {

    public String restFullService(String url, String jsonString, String credentials) {
        CloseableHttpResponse response = null;
        try {
            SSLContextBuilder sslContextBuilder = new SSLContextBuilder();
            sslContextBuilder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
            SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContextBuilder.build(), SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(sslConnectionSocketFactory).build();

            if (!credentials.isEmpty()) {
                byte[] encodedAuth = Base64.encodeBase64(credentials.getBytes(Charset.forName("UTF-8")));
                String authHeader = "Basic " + new String(encodedAuth);
                HttpPost postRequest = new HttpPost(url);
                postRequest.setHeader("Accept", "application/json");
                postRequest.setHeader("Content-type", "application/json");
                postRequest.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
                postRequest.setEntity(new StringEntity(jsonString, "UTF-8"));
                response = httpclient.execute(postRequest);
            } else {
                HttpPost postRequest = new HttpPost(url);
                postRequest.setHeader("Accept", "application/json");
                postRequest.setHeader("Content-type", "application/json");
                postRequest.setEntity(new StringEntity(jsonString, "UTF-8"));
                response = httpclient.execute(postRequest);
            }
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }
            return IOUtils.toString(response.getEntity().getContent(), "UTF-8");

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String restFullService(String url, String jsonString) {
        try {
            HttpClient client = new DefaultHttpClient();
            HttpPost postRequest = new HttpPost(url);
            postRequest.setHeader("Accept", "application/json");
            postRequest.setHeader("Content-type", "application/json");
            postRequest.setEntity(new StringEntity(jsonString, "UTF-8"));
            HttpResponse response = client.execute(postRequest);
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }
            return IOUtils.toString(response.getEntity().getContent(), "UTF-8");

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}