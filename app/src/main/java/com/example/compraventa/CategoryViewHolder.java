package com.example.compraventa;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CategoryViewHolder extends RecyclerView.ViewHolder{

    //VER COMO SE HACE ESTO
    public final TextView mName;

    public
    CategoryViewHolder(final View itemView) {
        super(itemView);
        mName = (TextView) itemView.findViewById(R.id.title);
    }
}
