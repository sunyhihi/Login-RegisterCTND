package com.duc.bt2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        EditText  uname = findViewById(R.id.uname);
        EditText pass= findViewById(R.id.pass);

        TextView textViewUsername = findViewById(R.id.textViewUserName);
        TextView textViewPass = findViewById(R.id.textViewPass);

        Button bntLogin= findViewById(R.id.button);
        bntLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = uname.getText().toString();
                String password = pass.getText().toString();

                // Setting text to TextViews and making them visible
                textViewUsername.setText("Username: " + username);
                textViewPass.setText("Password: " + password);

                textViewUsername.setVisibility(View.VISIBLE);
                textViewPass.setVisibility(View.VISIBLE);
            }
        });

        TextView btn= findViewById(R.id.textviewSignUp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}