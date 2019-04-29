package com.example.navigationdrawerpractise;


import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class Signup_Dialog extends AppCompatDialogFragment {

    Button a,b;

    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        LayoutInflater inflater=getActivity().getLayoutInflater();
        View view=inflater.inflate(R.layout.signupdialog,null);

        builder.setView(view).setTitle("SignUp").setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })
        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        a=(Button)view.findViewById(R.id.b1);
        b=(Button)view.findViewById(R.id.b2);

        return builder.create();

    }

//AppCompatActivity
   /* Button a,b;
   TextView t;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signupdialog);
        showDialog();
    }

    public void showDialog(){

        Dialog dialog=new Dialog(Signup_Dialog.this);
        dialog.setContentView(R.layout.signupdialog);
        dialog.show();

            a=(Button)dialog.findViewById(R.id.b1);
            b=(Button)dialog.findViewById(R.id.b2);
            t=(TextView)dialog.findViewById(R.id.txt);

            a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Signup_Dialog.this,signupp.class);
                    startActivity(i);
                }
            });

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ia=new Intent(Signup_Dialog.this,Signup_Customer.class);
                    startActivity(ia);
                }
            });
        };*/
    }

