package com.example.aluno.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }
}
