package com.example.navigationdrawerpractise;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Consultancyy extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consult);

        listView = (ListView) findViewById(R.id.mainList);

        final ArrayList<String> Dr_name = new ArrayList<>();
        final ArrayList<String> Specification = new ArrayList<>();
        final ArrayList<String> Contact = new ArrayList<>();
        final ArrayList<String> Address = new ArrayList<>();
        final ArrayList<Integer> Location = new ArrayList<>();

        Dr_name.add("Shivani");
        Specification.add("Dentist");
        Contact.add("98150-....");
        Address.add("Jalandhar");
        Location.add(R.drawable.ic_perm_identity_black_24dp);

        Dr_name.add("Alisha");
        Specification.add("MBBS");
        Contact.add("98150-....");
        Address.add("Ludhiana");
        Location.add(R.drawable.ic_perm_identity_black_24dp);

        Doctor dr = new Doctor(Dr_name, Specification, Contact, Address, Location);
        listView.setAdapter(dr);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Object listitm = listView.getItemAtPosition(position);
                // Toast.makeText(Consultancyy.this, "list item click", Toast.LENGTH_SHORT).show();


                    Intent intent = new Intent(Consultancyy.this, Show_Consultancy.class);

                    intent.putExtra("1", Dr_name.get(position));
                    intent.putExtra("2", Specification.get(position));
                    intent.putExtra("3", Contact.get(position));
                    intent.putExtra("4", Address.get(position));
                    intent.putExtra("5", Location.get(position));
                    startActivity(intent);


            }
        });
    }

    class Doctor extends BaseAdapter {
        ArrayList<String> Dr_name = new ArrayList<>();
        ArrayList<String> Specification = new ArrayList<>();
        ArrayList<String> Contact = new ArrayList<>();
        ArrayList<String> Address = new ArrayList<>();
        ArrayList<Integer> Location = new ArrayList<>();

        Doctor(ArrayList<String> Dr_name,
               ArrayList<String> Specification,
               ArrayList<String> Contact,
               ArrayList<String> Address,
               ArrayList<Integer> Location) {

            this.Dr_name = Dr_name;
            this.Specification = Specification;
            this.Contact = Contact;
            this.Address = Address;
            this.Location = Location;

        }

        @Override
        public int getCount() {
            return Dr_name.size();
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.consultancy, viewGroup, false);

            ImageView stud_image = (ImageView) row.findViewById(R.id.stud_image);
            TextView stud_name = (TextView) row.findViewById(R.id.stud_name);
            TextView stud_roll = (TextView) row.findViewById(R.id.stud_roll);


            stud_image.setBackgroundResource(Location.get(i));
            stud_name.setText(Dr_name.get(i));
            stud_roll.setText(Contact.get(i));


            return row;


        }


    }
}

