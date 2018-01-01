package com.igorr.homework_3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Igorr on 01.01.2018.
 */
public class PersonAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<Person> personArrayList;

    //Конструктор
    PersonAdapter(Context context, ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
        this.inflater = LayoutInflater.from(context);
    }

    //возвращает объект ViewHolder, который будет хранить данные по одному объекту personArrayList.
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        holder.
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
