package com.example.quizrock;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import org.w3c.dom.Text;

public class pergunta1 extends AppCompatActivity{

    RadioButton certa, errada1, errada2;
    Button instBtnProx;
    float nota1 =0;
    //String note1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta1);
        certa = findViewById(R.id.certa);
        errada1 = findViewById(R.id.errada1);
        errada2 = findViewById(R.id.errada2);
        instBtnProx = findViewById(R.id.btnproximo);
    }

    public void proximo(View view){
        try {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setMessage("bora continuar??");

            alert.setNegativeButton("quer Cancelar?", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int wich) {
                    Toast.makeText(getApplicationContext(), "ok vc desistiu", Toast.LENGTH_LONG).show();
                }
            });
            alert.setPositiveButton("Confrimar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    passar.getPonto();
                    if (certa.isChecked()){
                        passar.ponto++;
                    }
                    if (errada1.isChecked()){
                        passar.ponto++;
                    }
                    if (errada2.isChecked()){
                        passar.ponto++;
                    }
                    //note1 = String.valueOf(nota1);
                    Intent te = new Intent(getApplicationContext(),pergunta2.class);
                    //te.putExtra("NT1",note1);
                    finish();
                    startActivity(te);
                }
            });

            alert.show();
        }catch (Exception deumerda){
            Toast.makeText(this, deumerda.toString(), Toast.LENGTH_LONG).show();
        }

    }
}