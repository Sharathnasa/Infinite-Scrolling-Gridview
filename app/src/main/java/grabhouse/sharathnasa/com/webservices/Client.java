package grabhouse.sharathnasa.com.webservices;

import com.squareup.okhttp.OkHttpClient;
import grabhouse.sharathnasa.com.models.Feed;
import grabhouse.sharathnasa.com.utils.Constants;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Sharathnasa on 14/11/15.
 */
public class Client {
    public interface ClientInterface{
        @GET("/")
        void getQuestions(@Query("nojsoncallback") String nojsoncallback, @Query("format") String format, Callback<Feed> callback);
    }

    public static ClientInterface initRestAdapter()
    {
        OkHttpClient client = new OkHttpClient();

        return (ClientInterface) new RestAdapter.Builder()
                .setClient(new OkClient(client))
                .setEndpoint(Constants.URL)
                .build()
                .create(ClientInterface.class);
    }
}
