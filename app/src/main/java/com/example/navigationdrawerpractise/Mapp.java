package com.example.navigationdrawerpractise;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapp extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mapa;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapp);

        SupportMapFragment mapFragment=(SupportMapFragment)getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapa=googleMap;

        LatLng Maharashtra=new LatLng(18.658281, 72.652612);
        mapa.addMarker(new MarkerOptions().position(Maharashtra).title("Maharastra"));
        mapa.moveCamera(CameraUpdateFactory.newLatLng(Maharashtra));
    }
}
