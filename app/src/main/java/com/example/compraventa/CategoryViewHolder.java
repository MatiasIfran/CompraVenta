package com.example.compraventa;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryViewHolder extends RecyclerView.Adapter<CategoryViewHolder.ViewHolderDatos>{

    ArrayList<String> listDatos;

    public CategoryViewHolder(ArrayList<String> listDatos) {
        this.listDatos = listDatos;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fila_cat,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder.ViewHolderDatos holder, int position) {
        holder.asignarDatos(listDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        private ListView lv;
        public ViewHolderDatos(View itemView) {
            super(itemView);
            lv=itemView.findViewById(R.id.lv);
        }
        public void asignarDatos(String s) {
          //  lv.setText(s);
        }

        Intent intent = new Intent();


    }
}
