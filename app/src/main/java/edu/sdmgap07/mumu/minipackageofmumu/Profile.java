package edu.sdmgap07.mumu.minipackageofmumu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    Intent intent;
    private Button homepage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        homepage = findViewById(R.id.homepage);

        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this,Home_Page.class);
                startActivity(intent);
            }
        });

        // data recieving
        intent = getIntent();

        String result = intent.getStringExtra(SignUp.show_result);
        String result1 = intent.getStringExtra(SignUp.show_result1);
        String result2 = intent.getStringExtra(SignUp.show_result2);
        String result3 = intent.getStringExtra(SignUp.show_result3);

        // data processing
        TextView textView = findViewById(R.id.textView);
        textView.setText(result);

        TextView textView1 = findViewById(R.id.textView1);
        textView1.setText(result1);

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(result2);

        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(result3);
    }
}
