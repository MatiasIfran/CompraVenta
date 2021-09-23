package com.example.compraventa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

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
        private Button mName;
        public ViewHolderDatos(View itemView) {
            super(itemView);
            mName=itemView.findViewById(R.id.categoriaCardView);
        }
        public void asignarDatos(String s) {
            mName.setText(s);
        }
    }
}
