package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Button instbtniniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*instbtniniciar = findViewById(R.id.btniniciar);
        instbtniniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent te;
                        te =new Intent(getApplicationContext(),pergunta2.class);
                startActivity(te);
            }
        });*/




    }

    public void chamar(View view){
        try{
            Intent te = new Intent(getApplicationContext(), maria.class);
            startActivity(te);
        }catch (Exception erro){
            Toast.makeText(this, erro.toString(), Toast.LENGTH_LONG).show();
            Log.w("texto", erro.toString());

        }

    }

}


