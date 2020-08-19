package com.zerkistudio.sukasuka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.zerkistudio.sukasuka.core.Constant;
import com.zerkistudio.sukasuka.netservice.IAuthService;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLogin(View view) {
        EditText etIDPel    = (EditText) findViewById(R.id.et_idpel);
        EditText etPassword = (EditText) findViewById(R.id.et_password);

        Toast.makeText(this, "Username: " + etIDPel.getText() + "\n" +"Password: " +etPassword.getText(), Toast.LENGTH_SHORT).show();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.JSONURL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        IAuthService authAPIService = retrofit.create(IAuthService.class);

        Map<String, String> mapAuth = new HashMap<String, String>();
        mapAuth.put("id", etIDPel.getText().toString());
        mapAuth.put("pass", etPassword.getText().toString());

    }
}