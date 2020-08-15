package com.example.gauravcv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NameEduActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_edu);

        Button next2 = findViewById(R.id.bt2);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveNext2();
            }
        });
    }

    private void moveNext2(){
        Intent intent = new Intent(NameEduActivity.this, EducationInfo.class);
        startActivity(intent);
    }
}