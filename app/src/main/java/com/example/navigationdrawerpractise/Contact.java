package com.example.navigationdrawerpractise;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Contact extends AppCompatActivity {
    Button aaa,bbb;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        aaa=(Button)findViewById(R.id.btn11);
        bbb=(Button)findViewById(R.id.btn14);

        aaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(Contact.this,ChatBox.class);
                startActivity(ii);
            }
        });
        bbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii=new Intent(Contact.this,Mapp.class);
                startActivity(iii);
            }
        });
    }
}
