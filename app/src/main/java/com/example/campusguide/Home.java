package com.example.campusguide;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Home extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //click event for Goto
        FloatingActionButton Goto = findViewById(R.id.Goto);
        Goto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Toast.makeText(getApplicationContext(), "Going to Goto", Toast.LENGTH_LONG).show();
               // Intent gotoAccount = new Intent(getApplicationContext(), Account.class);
                //startActivity(gotoAccount);
            }
        });

        //click event for notification
        FloatingActionButton notification = findViewById(R.id.notification);
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getApplicationContext(), "Message sent, will be in touch", Toast.LENGTH_LONG).show();
                Intent gotoNotification = new Intent(getApplicationContext(), Notifications.class);
                startActivity(gotoNotification);
            }
        });

        //click event for history
        FloatingActionButton history = findViewById(R.id.history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Toast.makeText(getApplicationContext(), "Going to history", Toast.LENGTH_LONG).show();
               // Intent gotoSettings = new Intent(getApplicationContext(), Setting.class);
               // startActivity(gotoSettings);
            }
        });

        ImageView appsetting = findViewById(R.id.appsetting);
        appsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getApplicationContext(), "Message sent, will be in touch", Toast.LENGTH_LONG).show();
                Intent gotoSettings = new Intent(getApplicationContext(), Setting.class);
                startActivity(gotoSettings);
            }
        });


//        Button found_button = findViewById(R.id.found_button);
//        found_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Toast.makeText(getApplicationContext(), "Message sent, will be in touch", Toast.LENGTH_LONG).show();
//                Intent gotoRandevouz = new Intent(getApplicationContext(), dmVerifyUser.class);
//                startActivity(gotoRandevouz);
//            }
//        });
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Ublock = new LatLng(4.149979,9.2814663);
        mMap.addMarker(new MarkerOptions().position(Ublock).title("Ublock"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Ublock, 15));
    }
}


