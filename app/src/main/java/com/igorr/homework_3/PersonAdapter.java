package com.igorr.homework_3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Igorr on 02.01.2018.
 */
public class PersonAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<Person> personArrayList;

    //Конструктор
    PersonAdapter(Context context, ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
        this.inflater = LayoutInflater.from(context);
    }

    //создает объект CustomViewHolder с inflate того layout который будет выводить одну запись из personArrayList
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate the view for this view holder, and return
        View thisItemsView = inflater.inflate(R.layout.list_item, parent, false);
        return new CustomViewHolder(thisItemsView);
    }

    //
    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        // Find out the data, based on this view holder's position
        holder.name.setText(personArrayList.get(position).getName());
        holder.number.setText(personArrayList.get(position).getTelNumber());
    }

    //возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return personArrayList.size();
    }
}

