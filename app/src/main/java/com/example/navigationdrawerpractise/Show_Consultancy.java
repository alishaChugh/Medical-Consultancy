package com.example.navigationdrawerpractise;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Show_Consultancy extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consult_details);

        ImageView st_image=(ImageView) findViewById(R.id.studentpic);

        TextView st_name=(TextView)findViewById(R.id.set_name);
        TextView st_roll=(TextView)findViewById(R.id.set_roll);
        TextView st_class=(TextView)findViewById(R.id.set_class);
        TextView st_address=(TextView)findViewById(R.id.set_address);

        String t1=getIntent().getStringExtra("1");
        String t2=getIntent().getStringExtra("2");
        String t3=getIntent().getStringExtra("3");
        String t4=getIntent().getStringExtra("4");
        Integer t5= getIntent().getIntExtra("5",0);

        st_name.setText(t1);
        st_roll.setText(t2);
        st_class.setText(t3);
        st_address.setText(t4);
        st_image.setImageResource(t5);


    }
}
