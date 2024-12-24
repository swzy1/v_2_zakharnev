package com.example.zakharnev_v_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        Intent intent = new Intent(LoginActivity.this, PersonalAreaActivity.class);
        intent.putExtra("USERNAME", "User"); // Замените "User" на значение из текстового поля
        startActivity(intent);

        // Обработчик нажатия на кнопку входа
        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на экран персональной зоны
                Intent intent = new Intent(LoginActivity.this, PersonalAreaActivity.class);
                startActivity(intent);
            }
        });
    }
}
