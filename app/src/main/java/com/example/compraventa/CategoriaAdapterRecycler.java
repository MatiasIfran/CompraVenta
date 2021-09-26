package com.example.compraventa;

import static android.app.Activity.RESULT_OK;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.compraventa.model.Categoria;

import java.util.List;

public class CategoriaAdapterRecycler extends RecyclerView.Adapter<CategoriaAdapterRecycler.ViewHolder> {

    private static final String TAG = "CategoriaAdapterRecycler";
    private List<Categoria> mDataSet;
    Activity context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitulo;
        View v;

        public ViewHolder(View fila) {
            super(fila);
            v = fila;
            tvTitulo = fila.findViewById(R.id.rowTitulo);
        }

        public View contenedor(){
            return v;
        }

        public TextView getTvTitulo() {
            return tvTitulo;
        }
    }


    public CategoriaAdapterRecycler(List<Categoria> dataSet, Activity act) {
        context=act;
        mDataSet = dataSet;
    }

    // BEGIN_INCLUDE(recyclerViewOnCreateViewHolder)
    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.fila_cat, viewGroup, false);
        return new ViewHolder(v);
    }
    // END_INCLUDE(recyclerViewOnCreateViewHolder)

    // BEGIN_INCLUDE(recyclerViewOnBindViewHolder)
    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

        Categoria unaCategoria = mDataSet.get(position);
        viewHolder.contenedor().setBackgroundColor(unaCategoria.getColor());

        viewHolder.tvTitulo.setText(unaCategoria.getNombre());

        viewHolder.v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cad= (String) viewHolder.tvTitulo.getText();
                Intent i2= new Intent();
                i2.setData(Uri.parse(cad));
                context.setResult(RESULT_OK,i2);
                context.finish();
            }
        });

    }
    // END_INCLUDE(recyclerViewOnBindViewHolder)

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

}
