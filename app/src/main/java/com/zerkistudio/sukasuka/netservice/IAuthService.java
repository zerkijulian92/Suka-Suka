package com.zerkistudio.sukasuka.netservice;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface IAuthService {
    @FormUrlEncoded
    @POST("auth_login.php")
    Call<String> login(@FieldMap Map<String, String> fields);
}
