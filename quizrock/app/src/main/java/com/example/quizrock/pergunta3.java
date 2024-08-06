package com.example.quizrock;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class pergunta3  extends AppCompatActivity {
    RadioButton certa, errada1, errada2;
    Button instBtnProx3;
    TextView instRes;
    float nota3 =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta3);
        certa = findViewById(R.id.certa);
        errada1 = findViewById(R.id.errada1);
        errada2 = findViewById(R.id.errada2);
        instBtnProx3 = findViewById(R.id.instBtnProx3);
        instRes = findViewById(R.id.resultado);
        /*Bundle b = getIntent().getExtras();
        nota3 = Float.parseFloat(b.getString("NT2"));*/
    }
    public void prox3(View view) {

        try {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setMessage("quer finalizar o melhor quiz de todos?");
            alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int wich) {
                    Toast.makeText(getApplicationContext(), "Você cancelou a reposta", Toast.LENGTH_LONG).show();
                }

            });
            alert.setPositiveButton("finalizar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    instBtnProx3.setEnabled(false);
                    passar.getPonto();
                    if (certa.isChecked()){
                        passar.ponto++;
                    }
                    if(errada1.isChecked()){
                        passar.ponto++;
                    }
                    if(errada2.isChecked()){
                        passar.ponto++;
                    }
                    try {

                        if (passar.ponto >=5){
                            instRes.setText(String.valueOf("Parabens, você acertou: " + passar.ponto + " de 9"));
                        }else{
                            instRes.setText(String.valueOf
                                    (" você acertou: " + passar.ponto + " de 9, estude mais da próxima vez"));
                        }
                    }catch (Exception deumerda){
                        Toast.makeText(getApplicationContext(), deumerda.toString(), Toast.LENGTH_LONG).show();
                    }

                }
            });
            alert.show();
                        }catch(Exception deumerda){
            Toast.makeText(this, deumerda.toString(), Toast.LENGTH_LONG).show();
        }
    }
}