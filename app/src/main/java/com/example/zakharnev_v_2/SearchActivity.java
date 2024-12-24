package com.example.zakharnev_v_2;

import android.os.Bundle;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);

        // Пример работы с чекбоксами
        CheckBox hideAdultCheckBox = findViewById(R.id.hide_adult);
        hideAdultCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // Реакция на изменение состояния
        });
    }
}
