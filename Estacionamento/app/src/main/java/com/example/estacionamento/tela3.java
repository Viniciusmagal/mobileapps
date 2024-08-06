package com.example.estacionamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tela3 extends AppCompatActivity {
    Button vaga1;
    Button vaga2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        vaga1 = findViewById(R.id.buttonvaga1);
        vaga2 = findViewById(R.id.buttonvaga2);


        vaga1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), tela4.class);
                startActivity(intent);
            }
        });
        vaga2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), tela5.class);
                startActivity(intent);
            }
        });

    }
}
