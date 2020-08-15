package com.example.gauravcv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EducationInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_info);

        Button next3 = findViewById(R.id.bt3);
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNext3();
            }
        });
    }

    private void moveNext3(){
        Intent intent = new Intent(EducationInfo.this, TechnicalSkill.class);
        startActivity(intent);
    }
}