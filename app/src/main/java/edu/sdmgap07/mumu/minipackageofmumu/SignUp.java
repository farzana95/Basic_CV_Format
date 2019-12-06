package edu.sdmgap07.mumu.minipackageofmumu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    public static String show_result = "data_something";
    public static String show_result1 = "data_something1";
    public static String show_result2 = "data_something2";
    public static String show_result3 = "data_something3";

    private EditText name, email, phone, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        name = findViewById(R.id.input1);
        email = findViewById(R.id.input2);
        phone = findViewById(R.id.input3);
        password = findViewById(R.id.input4);
    }

    public void sendData(View view){
        Intent intent = new Intent(SignUp.this, Profile.class);

        // data sending
        String result = name.getText().toString();
        intent.putExtra(show_result, result);

        String result1 = email.getText().toString();
        intent.putExtra(show_result1, result1);

        String result2 = phone.getText().toString();
        intent.putExtra(show_result2, result2);

        String result3 = password.getText().toString();
        intent.putExtra(show_result3, result3);

        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
