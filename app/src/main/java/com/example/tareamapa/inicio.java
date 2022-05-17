package com.example.tareamapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class inicio extends AppCompatActivity {
    Button btnmaravilla1, btnmaravilla2, btnmaravilla3, btntrayectoria;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        btnmaravilla1=(Button) findViewById(R.id.btnCusco);
        btnmaravilla2=(Button) findViewById(R.id.btnAntiguas);
        btnmaravilla3=(Button) findViewById(R.id.btnModernas);
        btntrayectoria=(Button) findViewById(R.id.btnTrayecto);

        btnmaravilla1.setOnClickListener((view) -> {
            Intent intent = new Intent(getApplicationContext(), MapsCusco.class);
            startActivity(intent);
        });
        btnmaravilla2.setOnClickListener((view) -> {
            Intent intent = new Intent(getApplicationContext(), MapsAntiguas.class);
            startActivity(intent);
        } );
        btnmaravilla3.setOnClickListener((view) -> {
            Intent intent = new Intent(getApplicationContext(), MapsModernas.class);
            startActivity(intent);
        } );
        btntrayectoria.setOnClickListener((view) -> {
            Intent intent = new Intent(getApplicationContext(), MapsRuta.class);
            startActivity(intent);
        } );

    }
}