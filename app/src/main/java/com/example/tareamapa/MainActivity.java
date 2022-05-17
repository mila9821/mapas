package com.example.tareamapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private  static final long SPLASH_SCREEN_DELAY = 5000;
    Animation topAnim, bottomAnim;
    ImageView image, texto1, texto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Animacion
        topAnim = AnimationUtils.loadAnimation(this, R.anim.anim_logo);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.anim_texto);

        //Logica y disenio
        image = findViewById(R.id.maravilla);
        texto1 = findViewById(R.id.text1);
        texto2 = findViewById(R.id.text2);

        image.setAnimation(topAnim);
        texto1.setAnimation(bottomAnim);
        texto2.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, inicio.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_DELAY);
    }
}