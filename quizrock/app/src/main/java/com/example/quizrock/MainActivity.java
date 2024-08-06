package com.example.quizrock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button instbtniniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instbtniniciar = findViewById(R.id.btniniciar);
        instbtniniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent te;
                        te =new Intent(getApplicationContext(),pergunta1.class);
                startActivity(te);
            }
        });
    }
}


