package com.app.e_label;

import com.app.e_label.Model.Post;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {

    @GET("/api/pk/{id}/")
    Call <Post> getPosts(@Path(value= "id", encoded = true) String id);

    //@GET("/api/pk/{id}/")
    //Call <Post1> getPosts(@Path(value= "id", encoded = true) String id);
}
