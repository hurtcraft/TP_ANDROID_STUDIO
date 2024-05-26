package com.example.tp_dev_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    private String mailTest = "julienWeng@gmail.com";
    private String mdpTest = "1234AZERTY";
    private String mailInput;
    private String mdp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button b = (Button) findViewById(R.id.btnCo);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView MsgMail;
                MsgMail = (TextView) findViewById(R.id.email);
                mailInput = MsgMail.getText().toString();
                MsgMail = (TextView) findViewById(R.id.mdp);
                mdp = MsgMail.getText().toString();

                Toast t;
                if (mailInput.equals(mailTest) && mdp.equals(mdpTest)){
                    Intent intent = new Intent(v.getContext(), ProfilActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("email", mailInput);
                    bundle.putString("mdp", mdp);
                    intent.putExtras(bundle);
                    startActivity(intent);
                    t = Toast.makeText(v.getContext(), mailInput + " " + mdp, Toast.LENGTH_SHORT);
                }
                else{
                    t = Toast.makeText(v.getContext(), "identifiant incorrect", Toast.LENGTH_SHORT);
                }
                t.show();


            }
        });

        TextView creeCompte = findViewById(R.id.CreeCompte);
        creeCompte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CreerCompteActivity.class);
                startActivity(intent);

            }
        });





    }



}