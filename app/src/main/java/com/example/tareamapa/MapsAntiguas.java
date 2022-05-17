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
import com.example.tareamapa.databinding.ActivityMapsAntiguasBinding;

public class MapsAntiguas extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsAntiguasBinding binding;

    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsAntiguasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        btn1=findViewById(R.id.btnan1);
        btn2=findViewById(R.id.btnan2);
        btn3=findViewById(R.id.btnan3);
        btn4=findViewById(R.id.btnan4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng uno = new LatLng(33.0955793,44.1749775);
                mMap.addMarker(new MarkerOptions().position(uno).draggable(true).title("Jardines Colgantes de Babilonia").snippet
                        ("Pudo haber sido construido hacia el año 600 a.C., en tiempos del rey Nabucodonosor II").icon
                        (BitmapDescriptorFactory.fromResource(R.drawable.antiguauno)));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(uno,15));
                //alert dialogo
                AlertDialog.Builder alerta = new AlertDialog.Builder(MapsAntiguas.this);
                alerta.setMessage("Latitud: 33.0955793" +
                        "                                                  Longitud: 44.1749775")
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
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng dos = new LatLng(29.9870753,31.2118063);
                mMap.addMarker(new MarkerOptions().position(dos).draggable(true).title("La gran piramide de Guiza").snippet
                        ("Es la única maravilla de la antigüedad que ha soportado el paso del tiempo").icon
                        (BitmapDescriptorFactory.fromResource(R.drawable.antiguados)));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dos,15));
                //alert dialogo
                AlertDialog.Builder alerta = new AlertDialog.Builder(MapsAntiguas.this);
                alerta.setMessage("Latitud: 29.9870753" +
                        "                                                  Longitud: 31.2118063")
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
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng dos = new LatLng(38.9597594,34.9249653);
                mMap.addMarker(new MarkerOptions().position(dos).draggable(true).title("Templo de Artemisa").snippet
                        ("Fue el tercero y último intento por dedicar un templo a la diosa de la fertilidad en Éfeso").icon
                        (BitmapDescriptorFactory.fromResource(R.drawable.antiguatres)));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dos,15));
                //alert dialogo
                AlertDialog.Builder alerta = new AlertDialog.Builder(MapsAntiguas.this);
                alerta.setMessage("Latitud: 38.9597594" +
                        "                                                  Longitud: 34.9249653")
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
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng dos = new LatLng(38.9953683,21.9877132);
                mMap.addMarker(new MarkerOptions().position(dos).draggable(true).title("Estatua de Zeus").snippet
                        ("Es probable que la escultura haya sido construida entre los años 438 y 430 a.C").icon
                        (BitmapDescriptorFactory.fromResource(R.drawable.antiguacuatro)));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dos,15));
                //alert dialogo
                AlertDialog.Builder alerta = new AlertDialog.Builder(MapsAntiguas.this);
                alerta.setMessage("Latitud: 38.9953683" +
                        "                                                  Longitud: 21.9877132")
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


    }
}