package com.example.tareamapa;

import androidx.fragment.app.FragmentActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.tareamapa.databinding.ActivityMapsModernasBinding;

public class MapsModernas extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsModernasBinding binding;
    Button b1,b2,b3,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsModernasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        b1=findViewById(R.id.btnmo1);
        b2=findViewById(R.id.btnmo2);
        b3=findViewById(R.id.btnmo3);
        b4=findViewById(R.id.btnmo4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng uno = new LatLng(-13.164422,-72.5450851);
                mMap.addMarker(new MarkerOptions().position(uno).draggable(true).title("Machu Picchu").snippet
                        ("Situada en la cresta de una montaña a 2.430 metros sobre el nivel del mar").icon
                        (BitmapDescriptorFactory.fromResource(R.drawable.modernauno)));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(uno,15));
                //alert dialogo
                AlertDialog.Builder alerta = new AlertDialog.Builder(MapsModernas.this);
                alerta.setMessage("Latitud: -13.164422" +
                        "                                                  Longitud: -72.5450851")
                        .setCancelable(false)
                        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("Coordenadas");
                titulo.show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng uno = new LatLng(35.000074,104.999927);
                mMap.addMarker(new MarkerOptions().position(uno).draggable(true).title("La gran muralla China").snippet
                        ("Sirvió como protección para el imperio chino en la histórica frontera del norte del país").icon
                        (BitmapDescriptorFactory.fromResource(R.drawable.modernados)));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(uno,15));
                //alert dialogo
                AlertDialog.Builder alerta = new AlertDialog.Builder(MapsModernas.this);
                alerta.setMessage("Latitud: 35.000074" +
                        "                                                  Longitud: 104.999927")
                        .setCancelable(false)
                        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("Coordenadas");
                titulo.show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng uno = new LatLng(-22.9519173,-43.2104585);
                mMap.addMarker(new MarkerOptions().position(uno).draggable(true).title("Cristo Redentor").snippet
                        ("Se trata de una estatua de 30 metros de altura y representando el cuerpo de Jesús de Nazaret").icon
                        (BitmapDescriptorFactory.fromResource(R.drawable.modernatres)));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(uno,15));
                //alert dialogo
                AlertDialog.Builder alerta = new AlertDialog.Builder(MapsModernas.this);
                alerta.setMessage("Latitud: -22.9519173" +
                        "                                                  Longitud: -43.2104585")
                        .setCancelable(false)
                        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("Coordenadas");
                titulo.show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng uno = new LatLng(27.1750123,78.0420968);
                mMap.addMarker(new MarkerOptions().position(uno).draggable(true).title("Taj Mahal").snippet
                        ("Una construcción funeraria levantada en el siglo XVII bajo encargo del emperador Shah Jahan").icon
                        (BitmapDescriptorFactory.fromResource(R.drawable.modernacuatro)));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(uno,15));
                //alert dialogo
                AlertDialog.Builder alerta = new AlertDialog.Builder(MapsModernas.this);
                alerta.setMessage("Latitud: -22.9519173" +
                        "                                                  Longitud: -43.2104585")
                        .setCancelable(false)
                        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("Coordenadas");
                titulo.show();
            }
        });
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
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}