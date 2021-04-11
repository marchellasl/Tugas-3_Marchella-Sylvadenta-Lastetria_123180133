package com.example.recyclerview_tpm3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.viewHolder> {
    private Context context;
    private ArrayList<BookModel> bookModels;
    public BookAdapter(Context context) {this.context = context; }
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<BookModel> getBookModels() {
        return bookModels;
    }

    public void setBookModels(ArrayList<BookModel> bookModels) {
        this.bookModels = bookModels;
    }

    @NonNull
    @Override
    public BookAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item, viewGroup, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookAdapter.viewHolder holder, int i) {
        Glide.with(context).load(getBookModels().get(i).getCover()).into(holder.cover);
        holder.tvJudul.setText(getBookModels().get(i).getJudulBuku());
    }

    @Override
    public int getItemCount() {
        return getBookModels().size();
    }


    public class viewHolder extends RecyclerView.ViewHolder {
        private ImageView cover;
        private TextView tvJudul;
        public viewHolder(@NonNull View itemView)
        {
            super(itemView);
            cover = itemView.findViewById(R.id.cdlogo);
            tvJudul = itemView.findViewById(R.id.tvjudul);

        }
    }
}
