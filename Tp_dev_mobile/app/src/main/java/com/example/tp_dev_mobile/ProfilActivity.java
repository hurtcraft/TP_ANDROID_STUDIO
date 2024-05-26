package com.example.tp_dev_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        assert bundle != null;
        String email = bundle.getString("email");
        String mdp = bundle.getString("mdp");
        TextView MsgMail  = (TextView) findViewById(R.id.mail);
        MsgMail.setText("votre email : "+email);
        MsgMail  = (TextView) findViewById(R.id.mdp);
        MsgMail.setText("votre mot de passe : "+mdp);

    }
}