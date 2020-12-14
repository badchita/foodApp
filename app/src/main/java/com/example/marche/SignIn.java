package com.example.marche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class SignIn extends AppCompatActivity {

    //Button callSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_in);

       // callSignUp = findViewById(R.id.signUpButton);

       // callSignUp.setOnClickListener(new View.OnClickListener() {
         //   @Override
         //   public void onClick(View view) {
          //      Intent intent = new Intent(SignIn.this, SignUp.class);
           //     startActivity(intent);
        //    }
     //   });
    }
}