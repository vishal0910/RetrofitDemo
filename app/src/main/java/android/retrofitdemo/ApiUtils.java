package android.retrofitdemo;

/**
 * Created by Android Developer on 6/19/2018.
 */
public class ApiUtils {
    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static InterFaceAPI getInterFaceClient() {
        return RetrofitClient.getClient(BASE_URL).create(InterFaceAPI.class);
    }
}
