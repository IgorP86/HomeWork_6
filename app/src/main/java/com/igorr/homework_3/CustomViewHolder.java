package com.igorr.homework_3;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Igorr on 02.01.2018.
 *
 */


public class CustomViewHolder extends RecyclerView.ViewHolder {
    TextView name, number;
    ImageView imageView;

    CustomViewHolder(View thisItemsView) {
        super(thisItemsView);
        this.name = thisItemsView.findViewById(R.id.name);
        this.number = thisItemsView.findViewById(R.id.number);
    }

}
