package com.example.recyclerview_tpm3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    private ImageView cover;
    private TextView judul, author, year, synopsis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        cover = findViewById(R.id.image_detail);
        judul = findViewById(R.id.judul);
        author = findViewById(R.id.author);
        year = findViewById(R.id.year);
        synopsis = findViewById(R.id.synopsis);

    }
}
