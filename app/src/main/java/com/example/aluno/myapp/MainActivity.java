package com.example.aluno.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnC;
    private Button btnS;
    private EditText textLogin;
    private EditText textSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnC = (Button) findViewById(R.id.btnCadastrar);
        btnS = (Button) findViewById(R.id.btnSobre);
        textLogin = (EditText) findViewById(R.id.TextLogin);
        textSenha = (EditText) findViewById(R.id.textSenha);


        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(
                        MainActivity.this,
                        cadastro.class

                ));
            }
        });

        btnS.setOnClickListener((new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(
                        MainActivity.this,
                        sobre.class
                ));
            }
        }
        ));

        }
    }

