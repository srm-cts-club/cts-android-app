package com.example.android.check;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import com.example.android.check.R;
//import android.R;
public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login;
    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.editText_username);
        password = (EditText) findViewById(R.id.editText_password);
        login = (Button) findViewById(R.id.button_login);
        //adminlogin = (Button) findViewById(R.id.button_loginadmin);
        register = (TextView) findViewById(R.id.text_register);
    }

}
