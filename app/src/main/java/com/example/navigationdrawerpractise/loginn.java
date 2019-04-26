package com.example.navigationdrawerpractise;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginn extends AppCompatActivity {
    Button a, b;
    EditText x, y;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_drawer);
        a = (Button) findViewById(R.id.login_btn);
        b = (Button) findViewById(R.id.signup_btn);
        x = (EditText) findViewById(R.id.user_name);
        y = (EditText) findViewById(R.id.pass);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(loginn.this, MainDrawerActivity.class);
                startActivity(inte);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(loginn.this, "sign up", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(loginn.this, Signup_Dialog.class);
                startActivity(intent);
            }
        });
    }

}
