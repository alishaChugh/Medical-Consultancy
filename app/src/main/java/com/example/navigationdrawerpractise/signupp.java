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

public class signupp extends AppCompatActivity {
    EditText a,b,c,d,e,f,g,h;
    Button bb,tt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        a=(EditText)findViewById(R.id.e1);
        b=(EditText)findViewById(R.id.e2);
        c=(EditText)findViewById(R.id.e3);
        d=(EditText)findViewById(R.id.e4);
        e=(EditText)findViewById(R.id.e5);
        f=(EditText)findViewById(R.id.e6);
        g=(EditText)findViewById(R.id.e7);
        h=(EditText)findViewById(R.id.e8);


        bb = (Button) findViewById(R.id.btnv);
        tt=(Button)findViewById(R.id.btnh);

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String first = a.getText().toString().trim();
                String last = b.getText().toString().trim();
                String mail = c.getText().toString().trim();
                String num = d.getText().toString().trim();
                String add = e.getText().toString().trim();
                String st = f.getText().toString().trim();
                String cty = g.getText().toString().trim();
                String cntr = h.getText().toString().trim();

                if (first.isEmpty())
                    Toast.makeText(signupp.this, "Required Field", Toast.LENGTH_SHORT).show();

                if (last.isEmpty())
                    Toast.makeText(signupp.this, "Required Field", Toast.LENGTH_SHORT).show();

                if (mail.isEmpty())
                    Toast.makeText(signupp.this, "Required Field", Toast.LENGTH_SHORT).show();

                if (num.isEmpty())
                    Toast.makeText(signupp.this, "Required Field", Toast.LENGTH_SHORT).show();

                if (add.isEmpty())
                    Toast.makeText(signupp.this, "Required Field", Toast.LENGTH_SHORT).show();

                if (st.isEmpty())
                    Toast.makeText(signupp.this, "Required Field", Toast.LENGTH_SHORT).show();

                if (cty.isEmpty())
                    Toast.makeText(signupp.this, "Required Field", Toast.LENGTH_SHORT).show();

                if (cntr.isEmpty())
                    Toast.makeText(signupp.this, "Required Field", Toast.LENGTH_SHORT).show();



            }
        });

        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tt = new Intent(signupp.this, LoginFragment.class);
                startActivity(tt);
            }
        });
    }
}
