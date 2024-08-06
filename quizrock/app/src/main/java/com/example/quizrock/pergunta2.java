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

public class pergunta2 extends AppCompatActivity {
    RadioButton certa, errada2, errada3;
    Button instBtnProx2;
    float nota2 = 0;

    //String note2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta2);
        certa = findViewById(R.id.certa);
        errada2 = findViewById(R.id.errada2);
        errada3 = findViewById(R.id.errada3);
        instBtnProx2 = findViewById(R.id.btnproximo2);
        /*Bundle b = getIntent().getExtras();

        nota2 = Float.parseFloat(b.getString("NT1"));*/


    }

    public void prox2(View view) {
        try {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setMessage("Quer mesmo continuar?");
            alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int wich) {
                    Toast.makeText(getApplicationContext(), "você cancelou sua resposta", Toast.LENGTH_LONG).show();
                }
            });
            alert.setPositiveButton("confirmar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    passar.getPonto();
                    if (certa.isChecked()) {
                        passar.ponto++;
                    }
                    if (errada2.isChecked()) {
                        passar.ponto++;
                    }
                    if (errada2.isChecked()) {
                        passar.ponto++;
                    }
                    if (errada3.isChecked()) {
                        passar.ponto++;
                    }
                    //note2 = String.valueOf(nota2);

                    Intent te = new Intent(getApplicationContext(), pergunta3.class);
                    //te.putExtra("NT2", note2);
                    finish();

                    startActivity(te);
                }

            });
            alert.show();
        } catch (Exception deumerda) {
            Toast.makeText(this, deumerda.toString(), Toast.LENGTH_LONG).show();
        }
    }
}



