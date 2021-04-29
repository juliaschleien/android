package com.example.recuperacao.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recuperacao.R;

public class LoginActivity extends AppCompatActivity {

    Button buttonLogar;
    TextView textViewEmail, textViewPhone, textViewUsername;
    EditText editEmail, editPhone, editUsername;

    public void criarObjetos() {

        buttonLogar = findViewById(R.id.buttonLogar);
        textViewEmail = findViewById(R.id.textViewEmail);
        textViewPhone = findViewById(R.id.textViewPhone);
        textViewUsername = findViewById(R.id.textViewUsername);
        editEmail = findViewById(R.id.editTextEmail);
        editPhone = findViewById(R.id.editTextPhone);
        editUsername = findViewById(R.id.editTextUsername);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        criarObjetos();

        buttonLogar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("nome", editUsername.getText().toString());
                b.putString("email", editEmail.getText().toString());
                Integer phone = Integer.parseInt(editPhone.getText().toString());
                b.putInt("Phone", phone);

                Intent finish = new Intent(getApplicationContext(), FinalActivity.class);
                finish.putExtras(b);
                startActivity(finish);

            }
        });

    }
}
