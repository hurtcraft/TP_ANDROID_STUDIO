package com.example.tp_dev_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CreerCompteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creer_compte);

        Spinner spinner = (Spinner) findViewById(R.id.numTel);
        String [] numTel={"+33", "+86", "+23"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        numTel);
        spinner.setAdapter(adapter);


        Button annuler = findViewById(R.id.Annuler);
        annuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        Button insc = findViewById(R.id.btnInsc);
        insc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ProfilActivity.class);
                Bundle bundle = new Bundle();
                TextView MsgMail;
                MsgMail = (TextView) findViewById(R.id.email);
                bundle.putString("email", MsgMail.getText().toString());
                MsgMail = (TextView) findViewById(R.id.mdp);
                bundle.putString("mdp", MsgMail.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }
}