package com.formationkilo.helloworld;

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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button buttonRegistration=findViewById(R.id.idBtnRegister);
        buttonRegistration.setOnClickListener(view -> {
            EditText editTextName=findViewById(R.id.idEdtUserName);
            EditText editTextFirstName=findViewById(R.id.idEdtFirstName);
            EditText editTextEmail=findViewById(R.id.idEdtUserEmail);

            TextView textViewName=findViewById(R.id.textViewName);
            textViewName.setText(editTextName.getText().toString());

            TextView textViewFirstName=findViewById((R.id.textViewFirstName));
            textViewFirstName.setText(editTextFirstName.getText().toString());

            TextView textViewEmail=findViewById(R.id.textViewEmail);
            textViewEmail.setText(editTextEmail.getText().toString());

            editTextName.getText().clear();
            editTextFirstName.getText().clear();
            editTextEmail.getText().clear();
        });



    }


 /*   public void btnRegisterClick(View view) {
        EditText editTextName=findViewById(R.id.idEdtUserName);
        EditText editTextFirstName=findViewById(R.id.idEdtFirstName);
        EditText editTextEmail=findViewById(R.id.idEdtUserEmail);

        TextView textViewName=findViewById(R.id.textViewName);
        textViewName.setText(editTextName.getText().toString());

        TextView textViewFirstName=findViewById((R.id.textViewFirstName));
        textViewFirstName.setText(editTextFirstName.getText().toString());

        TextView textViewEmail=findViewById(R.id.textViewEmail);
        textViewEmail.setText(editTextEmail.getText().toString());

        editTextName.getText().clear();
        editTextFirstName.getText().clear();
        editTextEmail.getText().clear();
    }*/


}