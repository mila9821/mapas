package com.example.tareamapa;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.tareamapa.databinding.ActivityMapsCuscoBinding;

public class MapsCusco extends FragmentActivity implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private ActivityMapsCuscoBinding binding;
    public Marker markerPrueba;

    Button btnuno, btndos, btntres, btncuatro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsCuscoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btnuno=findViewById(R.id.btn1);
        btndos=findViewById(R.id.btn2);
        btntres=findViewById(R.id.btn3);
        btncuatro=findViewById(R.id.btn4);

        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng uno = new LatLng(-13.5167684,-71.9788);
                mMap.addMarker(new MarkerOptions().position(uno).draggable(true).title("Plaza de Armas").snippet
                        ("Aquí se encuentran la Catedral  y el Templo de la Compañía de Jesús").icon
                        (BitmapDescriptorFactory.fromResource(R.drawable.cuscounos)));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(uno,15));
                //alert dialogo
               AlertDialog.Builder alerta = new AlertDialog.Builder(MapsCusco.this);
                alerta.setMessage("Latitud: -13.5167684" +
                        "                                                  Longitud: -71.9788")
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
        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng dos = new LatLng(-13.3000819,-72.1562363);
                mMap.addMarker(new MarkerOptions().position(dos).draggable(true).title("Salineras de Maras").snippet
                        ("Se puede observar la sal rosa").icon(BitmapDescriptorFactory.fromResource(R.drawable.cusco2)));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dos,15));
                //alert dialogo
                AlertDialog.Builder alerta = new AlertDialog.Builder(MapsCusco.this);
                alerta.setMessage("Latitud: -13.3000819" +
                        "                                                  Longitud: -72.1562363")
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
        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng tres = new LatLng(-13.7890748,-71.2299013);
                mMap.addMarker(new MarkerOptions().position(tres).draggable(true).title("Ausangate").snippet
                        ("La montaña mas alta de Cusco").icon(BitmapDescriptorFactory.fromResource(R.drawable.cuscotres)));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(tres,15));
                //alert dialogo
                AlertDialog.Builder alerta = new AlertDialog.Builder(MapsCusco.this);
                alerta.setMessage("Latitud: -13.7890748" +
                        "                                                  Longitud: -71.2299013")
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
        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng cuatro = new LatLng(-13.3327923,-72.547169);
                mMap.addMarker(new MarkerOptions().position(cuatro).draggable(true).title("Salkantay").snippet
                        ("Segunda Montaña mas alta de Cusco").icon(BitmapDescriptorFactory.fromResource(R.drawable.cuscocuatro)));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(cuatro,15));
                //alert dialogo
                AlertDialog.Builder alerta = new AlertDialog.Builder(MapsCusco.this);
                alerta.setMessage("Latitud: -13.3327923" +
                        "                                                  Longitud: -72.547169")
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

        googleMap.setOnMarkerClickListener(this);

    }

    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        if(marker.equals(markerPrueba)){
            String lat,lng;
            lat = Double.toString(marker.getPosition().latitude);
            lng = Double.toString(marker.getPosition().longitude);
            Toast.makeText(this,lat+ ""+ lng, Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}