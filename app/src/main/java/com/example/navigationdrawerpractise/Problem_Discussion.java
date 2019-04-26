package com.example.navigationdrawerpractise;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Problem_Discussion extends AppCompatActivity {
    Button p1,p2,p3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.problemdiscussion);

        p1=(Button)findViewById(R.id.btn);
        p2=(Button)findViewById(R.id.btn1);
        p3=(Button)findViewById(R.id.btn2);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ip=new Intent(Problem_Discussion.this,Contact.class);
            startActivity(ip);
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ipa=new Intent(Problem_Discussion.this,Contact.class);
                startActivity(ipa);
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ipb=new Intent(Problem_Discussion.this,Contact.class);
                startActivity(ipb);
            }
        });
    }
}
