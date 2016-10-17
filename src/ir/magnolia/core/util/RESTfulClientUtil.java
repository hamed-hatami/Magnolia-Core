package ir.magnolia.core.util;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class RESTfulClientUtil {

    public String restFullService(String url, String jsonString) {
        try {
            HttpClient client = new DefaultHttpClient();
            HttpPost postRequest = new HttpPost(url);
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