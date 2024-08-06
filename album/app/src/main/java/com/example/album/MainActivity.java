package com.example.album;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button instbtnAnt, instbtnProx, instbtnEfeito, instbtnEfeito2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.aluno);
        instbtnAnt = findViewById(R.id.btnAnt);
        instbtnProx= findViewById(R.id.btnProx);
        instbtnEfeito = findViewById(R.id.btnEfeito);
        instbtnEfeito2 = findViewById(R.id.btnEfeito2);

        img.setImageResource(R.drawable.aluno);

        instbtnProx.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               if (img.getDrawable().getConstantState() ==
                                                       getResources().getDrawable(R.drawable.aluno).getConstantState()) {
                                                   img.setImageResource(R.drawable.pessoa);
                                               } else {
                                                   img.setImageResource(R.drawable.pessoa2);



                                                   }

                                               }
                                           }


        );
        {
            instbtnAnt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (img.getDrawable().getConstantState() ==
                            getResources().getDrawable(R.drawable.pessoa2).getConstantState()) {
                        img.setImageResource(R.drawable.pessoa);
                    } else {
                        img.setImageResource(R.drawable.aluno);
                    }
                }
            });
            instbtnEfeito.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    img.animate().setDuration(2000);
                    img.animate().rotationX(360).start();
                }
            });
            instbtnEfeito2.setOnClickListener(new View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View v) {
                                                      img.animate().setDuration(5000);
                                                      img.animate().alpha(0.0f).start();
                                                  }
                                              });


        }
    }
}