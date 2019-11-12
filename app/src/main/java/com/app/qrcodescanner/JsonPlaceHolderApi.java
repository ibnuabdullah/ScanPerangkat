package com.app.qrcodescanner;

import com.app.qrcodescanner.Model.LabelData;
import com.app.qrcodescanner.Model.Post;
import com.app.qrcodescanner.Model.Post1;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Url;

public interface JsonPlaceHolderApi {

    @GET("/api/pk/{id}/")
    Call <Post> getPosts(@Path(value= "id", encoded = true) String id);

    //@GET("/api/pk/{id}/")
    //Call <Post1> getPosts(@Path(value= "id", encoded = true) String id);
}
