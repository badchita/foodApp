package com.example.marche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    //private Button signInButton;
    //    Animation topAnim, bottomAnim;
    ImageView image;
    private static int SPLASH_SCREEN = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //gotoLogin Page
       // signInButton = (Button) findViewById(R.id.signInButton);
       // signInButton.setOnClickListener(new View.OnClickListener() {
          //  @Override
          //  public void onClick(View view) {
           //     openLoginPage();
          //  }
       // });
//        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
//        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
//
        image = findViewById(R.id.imageView);
//
//        image.setAnimation(topAnim);


    //openLogin function
  new Handler().postDelayed(new Runnable() {
      @Override
      public void run() {
          Intent intent = new Intent(MainActivity.this,SplashScreen.class);
          startActivity(intent);
          finish();
      }
  },SPLASH_SCREEN);
  }
    }