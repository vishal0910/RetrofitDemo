package android.retrofitdemo;

import android.os.Bundle;
import android.retrofitdemo.model.ResponseEntity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnCallAPi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callAPI();
            }
        });


    }

    private void callAPI() {
        Call<ResponseEntity> call = ApiUtils.getInterFaceClient().getAnswers();
        call.enqueue(new Callback<ResponseEntity>() {
            @Override
            public void onResponse(Call<ResponseEntity> call, Response<ResponseEntity> response) {
                ResponseEntity responseEntity = response.body();
                Log.i(MainActivity.class.getSimpleName(), "onCreate: " + responseEntity.getItems().size());
            }

            @Override
            public void onFailure(Call<ResponseEntity> call, Throwable t) {
                Log.i(MainActivity.class.getSimpleName(), "onCreate: " + t.getMessage());
            }
        });
    }
}
