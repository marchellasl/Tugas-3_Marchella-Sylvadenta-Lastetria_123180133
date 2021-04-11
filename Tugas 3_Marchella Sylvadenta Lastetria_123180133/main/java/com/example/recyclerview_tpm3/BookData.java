package com.example.recyclerview_tpm3;

import java.util.ArrayList;

public class BookData {
    private static String[] title = new String[]{"Men Are From Mars, Women Are From Venus", "Almond", "1Q48", "Into The Magic Shop"};
    private static int[] thumbnail = new int[]{R.drawable.mars, R.drawable.almond, R.drawable.iq, R.drawable.magicshop};
    public static ArrayList<BookModel> getListData(){
        BookModel bookModel = null;
        ArrayList<BookModel> list = new ArrayList<>();
        for (int i = 0; i < title.length; i++)
        {
            bookModel = new BookModel();
            bookModel.setCover(thumbnail[i]);
            bookModel.setJudulBuku(title[i]);
            list.add(bookModel);
        }
        return list;
    }
}
