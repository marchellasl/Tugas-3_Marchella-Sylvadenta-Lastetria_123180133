package com.example.recyclerview_tpm3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private ArrayList<BookModel> bookModels = new ArrayList<>();
    private Button btn_detail, btn_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        bookModels.addAll(BookData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rv.setLayoutManager(new LinearLayoutManager(this));
        BookAdapter bookAdapter = new BookAdapter(this);
        bookAdapter.setBookModels(bookModels);
        rv.setAdapter(bookAdapter);
    }

}