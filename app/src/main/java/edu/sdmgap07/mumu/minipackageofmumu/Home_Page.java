package edu.sdmgap07.mumu.minipackageofmumu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Home_Page extends AppCompatActivity implements View.OnClickListener{

    private ImageView imageView;
    private Button profile, logout, cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);
        
        //Find
        imageView= findViewById(R.id.myself);
        profile = findViewById(R.id.profile);
        logout = findViewById(R.id.logout);
        cv = findViewById(R.id.cv);

        imageView.setOnClickListener(this);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Page.this,Profile.class);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Page.this,SignIn.class);
                startActivity(intent);
            }
        });

        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Page.this,CV.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.myself){
            Toast.makeText(Home_Page.this,"Hello, I am Farzana Rahman! What's up? You can see my full profile here. Thank You!!!", Toast.LENGTH_LONG).show();
        }
    }
}
