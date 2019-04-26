package com.example.navigationdrawerpractise;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.navigationdrawerpractise.fragment.LoginFragment;

public class Signup_Customer extends AppCompatActivity {
    EditText aa,bb,cc,dd,ee,ff;
    Button sign,home;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signupcustomer);

        aa=(EditText)findViewById(R.id.e11);
        bb=(EditText)findViewById(R.id.e22);
        cc=(EditText)findViewById(R.id.e33);
        dd=(EditText)findViewById(R.id.e44);
        ee=(EditText)findViewById(R.id.e55);
        ff=(EditText)findViewById(R.id.e66);

        sign=(Button)findViewById(R.id.btn);
        home=(Button)findViewById(R.id.btnhh);

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstt = aa.getText().toString().trim();
                String lastt = bb.getText().toString().trim();
                String maill = cc.getText().toString().trim();
                String numm = dd.getText().toString().trim();
                String addd = ee.getText().toString().trim();
                String stt = ff.getText().toString().trim();

                if (firstt.isEmpty())
                    Toast.makeText(Signup_Customer.this, "Required Field", Toast.LENGTH_SHORT).show();

                if (lastt.isEmpty())
                    Toast.makeText(Signup_Customer.this, "Required Field", Toast.LENGTH_SHORT).show();

                if (maill.isEmpty())
                    Toast.makeText(Signup_Customer.this, "Required Field", Toast.LENGTH_SHORT).show();

                if (numm.isEmpty())
                    Toast.makeText(Signup_Customer.this, "Required Field", Toast.LENGTH_SHORT).show();

                if (addd.isEmpty())
                    Toast.makeText(Signup_Customer.this, "Required Field", Toast.LENGTH_SHORT).show();

                if (stt.isEmpty())
                    Toast.makeText(Signup_Customer.this, "Required Field", Toast.LENGTH_SHORT).show();

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tt = new Intent(Signup_Customer.this, LoginFragment.class);
                startActivity(tt);
            }
        });
    }
}
