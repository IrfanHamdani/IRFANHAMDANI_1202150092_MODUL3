package com.example.android.rfanhamdani_1202150092_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class menuLogin extends AppCompatActivity {

    EditText user, pass;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_login);

        user = (EditText) findViewById(R.id.editTextusername);
        pass = (EditText) findViewById(R.id.editTextpassword);
        btnlogin = (Button) findViewById(R.id.buttonlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernamekey = user.getText().toString();
                String passwordkey = pass.getText().toString();

                if (usernamekey.equals("EAD") && passwordkey.equals("MOBILE")) {
                    Intent login = new Intent(menuLogin.this, menuList.class);
                    startActivity(login);
                    Toast.makeText(menuLogin.this, "Login Sukses", Toast.LENGTH_LONG).show();


                } else {
                    Toast.makeText(menuLogin.this, "Login gagal", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}