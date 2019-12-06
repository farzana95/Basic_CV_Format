package edu.sdmgap07.mumu.minipackageofmumu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CV extends AppCompatActivity implements View.OnClickListener{

    private Button personal, career, education, experience, skill, activity, achievement, project, participation, reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Find
        personal = findViewById(R.id.personal);
        career = findViewById(R.id.career);
        education = findViewById(R.id.education);
        experience = findViewById(R.id.experience);
        skill = findViewById(R.id.skill);
        activity = findViewById(R.id.activity);
        achievement = findViewById(R.id.achievement);
        project = findViewById(R.id.project);
        participation = findViewById(R.id.participation);
        reference = findViewById(R.id.reference);

        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CV.this,Personal.class);
                startActivity(intent);
            }
        });
        career.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CV.this,Career.class);
                startActivity(intent);
            }
        });
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CV.this,Education.class);
                startActivity(intent);
            }
        });
        experience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CV.this,Experience.class);
                startActivity(intent);
            }
        });
        skill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CV.this,Skill.class);
                startActivity(intent);
            }
        });
        activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CV.this,Activity.class);
                startActivity(intent);
            }
        });
        achievement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CV.this,Achievement.class);
                startActivity(intent);
            }
        });
        project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CV.this,Project.class);
                startActivity(intent);
            }
        });
        participation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CV.this,Participation.class);
                startActivity(intent);
            }
        });
        reference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CV.this,Reference.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

    }
}
