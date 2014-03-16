package ar.com.baufest.temperature.ws;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

/**
 * Utility class to invoke rest services.
 */
public class RestWebService {

    //~ Constructors .............................................................................................................

    private RestWebService() {}

    //~ Methods ..................................................................................................................

    /**
     * REST post invocation.
     *
     * @param   address:   rest uri
     * @param   jsonBody:  json file inside body
     *
     * @return  invocation result
     *
     * @throws  Exception
     */
    public static String callJsonPostRestfulWebService(final String address, final String jsonBody)
        throws Exception
    {
        final Header[] headers = {
            new BasicHeader(ACCEPT_ENCODING, "gzip"),
            new BasicHeader("Content-Type", "application/json")
        };

        final HttpPost post = new HttpPost(address);
        post.setHeaders(headers);
        post.setEntity(new StringEntity(jsonBody));

        return buildContent(post);
    }

    /**
     * REST post invocation.
     *
     * @param   address:     rest uri
     * @param   parameters:  name value parameters
     *
     * @return  invocation result
     *
     * @throws  Exception
     */
    public static String callPostRestfulWebService(final String address, final Map<String, String> parameters)
        throws Exception
    {
        final Header[] headers = { new BasicHeader(ACCEPT_ENCODING, "gzip") };
        return callPostRestfulWebService(address, parameters, headers);
    }

    /**
     * REST post invocation.
     *
     * @param   address:     rest uri
     * @param   parameters:  name value parameters
     * @param   headers:     request headers
     *
     * @return  invocation result
     *
     * @throws  Exception
     */
    public static String callPostRestfulWebService(final String address, final Map<String, String> parameters,
                                                   final Header[] headers)
        throws Exception
    {
        final HttpPost post = new HttpPost(address);

        if (headers != null) post.setHeaders(headers);
        final List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();

        final Set<Map.Entry<String, String>> entries = parameters.entrySet();
        for (Map.Entry<String, String> entry : entries)
            nameValuePairs.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));

        post.setEntity(new UrlEncodedFormEntity(nameValuePairs));

        return buildContent(post);
    }

    /**
     * REST get invocation.
     *
     * @param   address:  rest uri
     *
     * @return  invocation result
     *
     * @throws  Exception
     */
    public static String callRestfulWebService(final String address)
        throws Exception { return buildContent(new HttpGet(address)); }

    /**
     * REST get invocation.
     *
     * @param   address:     rest uri
     * @param   parameters:  name value parameters
     *
     * @return  invocation result
     *
     * @throws  Exception
     */
    public static String callRestfulWebService(final String address, final Map<String, String> parameters)
        throws Exception
    {
        final HttpGet get = new HttpGet(parameters.isEmpty() ? address : address + "?" + buildWebQuery(parameters));
        return buildContent(get);
    }

    private static String buildContent(HttpRequestBase requestBase)
        throws IOException
    {
    	HttpClient httpclient = new DefaultHttpClient();
        HttpResponse response = null;
        String responseString = null;
        try {
            response = httpclient.execute(requestBase);
            StatusLine statusLine = response.getStatusLine();
            if(statusLine.getStatusCode() == HttpStatus.SC_OK){
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                response.getEntity().writeTo(out);
                out.close();
                responseString = out.toString();
            } else{
                //Closes the connection.
                response.getEntity().getContent().close();
                throw new IOException(statusLine.getReasonPhrase());
            }
        } catch (ClientProtocolException e) {
        	response.getEntity().getContent().close();
        } catch (IOException e) {
        	response.getEntity().getContent().close();
        }
        return responseString;
    	
        /*final CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        final HttpResponse httpResponse = httpClient.execute(requestBase);
        final HttpEntity   entity       = httpResponse.getEntity();
        final Header       firstHeader  = httpResponse.getFirstHeader("Content-Encoding");
        String             content      = "";
        if (entity != null) {
            if (firstHeader != null && "gzip".equals(firstHeader.getValue())) {
                OutputStream out = null;
                InputStream  in  = null;
                try {
                    out = new ByteArrayOutputStream();
                    in  = new GZIPInputStream(entity.getContent());
                    final byte[] buffer = new byte[BUFFER];
                    int          c;
                    while ((c = in.read(buffer, 0, BUFFER)) > 0)
                        out.write(buffer, 0, c);
                    content = out.toString();
                }
                finally {
                    if (in != null) in.close();
                    if (out != null) out.close();
                }
            }
            else {
                final StringBuilder sb;
                BufferedReader      br = null;
                try {
                    br = new BufferedReader(new InputStreamReader(entity.getContent(), "UTF-8"));
                    sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        sb.append(line);
                        sb.append("\n");
                    }
                }
                finally {
                    if (br != null) br.close();
                }
                content = sb.toString();
            }
        }
        httpClient.close();
        return content;
        */
    }  // end method buildContent

    private static String buildWebQuery(final Map<String, String> parameters)
        throws Exception
    {
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<String, String> entry : parameters.entrySet()) {
            final String key   = URLEncoder.encode(entry.getKey(), UTF_8);
            final String value = URLEncoder.encode(entry.getValue(), UTF_8);
            sb.append(key).append("=").append(value).append("&");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    //~ Static Fields ............................................................................................................

    private static final String ACCEPT_ENCODING = "Accept-Encoding";
    private static final String UTF_8           = "UTF-8";
    public static final int     BUFFER          = 4096;
}  // end class RestWebService
