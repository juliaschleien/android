package com.example.recuperacao.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.recuperacao.R;

public class FinalActivity extends AppCompatActivity {

    TextView textViewHi, textViewConta, textViewPhoneNumber, tvName, tvPhone, tvEmail;
    Button buttonBack;

    private void criarObjetos() {
        textViewHi = findViewById(R.id.textViewHi);
        textViewConta = findViewById(R.id.textViewConta);
        textViewPhoneNumber = findViewById(R.id.textViewPhoneNumber);
        tvName = findViewById(R.id.textName);
        tvPhone = findViewById(R.id.textPhone);
        tvEmail = findViewById(R.id.textEmail);
        buttonBack = findViewById(R.id.buttonBack);
    }

    private void popularDados() {
        Bundle b = getIntent().getExtras();
        tvName.setText(tvName.getText() + b.getString("nome"));
        Integer phone = b.getInt("Phone");
        tvPhone.setText(tvPhone.getText() + " " + phone.toString());
        tvEmail.setText(tvEmail.getText() + b.getString("email"));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        criarObjetos();
        popularDados();

        buttonBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                backLogin();
            }
        });
    }

    private void backLogin() {
        Intent janelag = new Intent(this, LoginActivity.class);
        startActivity(janelag);
    }
}