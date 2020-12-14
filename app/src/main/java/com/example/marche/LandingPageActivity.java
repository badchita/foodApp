package com.example.marche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class LandingPageActivity extends AppCompatActivity {
    private Button signUpButton;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_landing_page);

//        gotoLogin Page
        signInButton = (Button) findViewById(R.id.signInButton);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignInPage();


                signUpButton = (Button) findViewById(R.id.signUpButton);

                signUpButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openSignUpPage();
                    }

                });
            }

            public void openSignInPage() {
                Intent intent = new Intent(LandingPageActivity.this, SignIn.class);
                startActivity(intent);
            }

            public void openSignUpPage() {
                Intent intent = new Intent(LandingPageActivity.this, SignUp.class);
                startActivity(intent);

            }
        });
    }
}