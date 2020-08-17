package com.zerkistudio.sukasuka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
    }
}