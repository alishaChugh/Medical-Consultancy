package com.example.navigationdrawerpractise.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.navigationdrawerpractise.Contact;
import com.example.navigationdrawerpractise.MainDrawerActivity;
import com.example.navigationdrawerpractise.R;
import com.example.navigationdrawerpractise.Signup_Customer;
import com.example.navigationdrawerpractise.Signup_Dialog;

public class LoginFragment extends Fragment {

    View v;

    Button login_btnn, Sign_upp;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.login_fragment, container, false);

        login_btnn = (Button) v.findViewById(R.id.login_btn);
        login_btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getActivity(), Contact.class);
                startActivity(inte);
            }
        });

        Sign_upp = (Button) v.findViewById(R.id.signup_btn);
        final Context mContext = this.getContext();
        Sign_upp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  v.getContext();
              // AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
                AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                alertDialog.setTitle("Sign_up as-");
                alertDialog.setMessage("MEDICAL ERA Welcomes you here!..");

                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Vendor", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent tent = new Intent(getActivity(), Signup_Dialog.class);
                        startActivity(tent);
                    }
                });

                alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Customer", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getActivity(), Signup_Customer.class);
                        startActivity(intent);
                    }
                });
                alertDialog.show(); }});

        return v;
    }
}

