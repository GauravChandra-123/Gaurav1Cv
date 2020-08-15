package com.example.gauravcv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TechnicalSkill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_skill);

        Button next4 = findViewById(R.id.bt4);
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNext4();
            }
        });
    }

    private void moveNext4(){
        Intent intent = new Intent(TechnicalSkill.this, Achievements.class);
        startActivity(intent);
    }
}