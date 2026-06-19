package com.example.appjobappli;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView applicant,qualification,experience;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.second_activity);
        applicant=findViewById(R.id.applicant);
        qualification=findViewById(R.id.qualification);
        experience=findViewById(R.id.experience);

        String name=getIntent().getStringExtra("Applicant Number");
        applicant.setText("Applicant Number :-"+name);
        String quali=getIntent().getStringExtra("Qualification");
        qualification.setText("Qualification :-"+quali);
        String exper=getIntent().getStringExtra("Experience");
        experience.setText("Experience :-"+exper);




    }
}
