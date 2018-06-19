package android.retrofitdemo;


import android.retrofitdemo.model.ResponseEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Vsourz
 * The interface Inter face api.
 */
public interface InterFaceAPI {


  @GET("/answers?order=desc&sort=activity&site=stackoverflow")
  Call<ResponseEntity> getAnswers();

  @GET("/answers?order=desc&sort=activity&site=stackoverflow")
  Call<ResponseEntity> getAnswers(@Query("tagged") String tags);


}
