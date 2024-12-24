package com.example.zakharnev_v_2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PersonalAreaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);

        String username = getIntent().getStringExtra("USERNAME");


        // Кнопка "Купить билет"
        Button buyTicketButton = findViewById(R.id.buy_ticket_button);
        buyTicketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Открыть браузер с сайтом Кинопоиска
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kinopoisk.ru"));
                startActivity(browserIntent);
            }
        });

    }
}
