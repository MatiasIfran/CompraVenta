package com.example.compraventa;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class activity2 extends Activity {
    private ListView lv;
    private String[] categoria;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fila_cat);

        Resources res = getResources();
        categoria = res.getStringArray(R.array.spinnerCategoria);

        lv= (ListView) findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,cargarListView());
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String cad= (String) lv.getAdapter().getItem(i);
                Intent i2= new Intent();
                i2.setData(Uri.parse(cad));
                setResult(RESULT_OK,i2);
                finish();
            }
        });

    }
    private List<String> cargarListView(){
        List<String> listaStrings = new ArrayList<String>();
        for (int i=0; i<categoria.length; i++){
            listaStrings.add(categoria[i]);
        }
        return listaStrings;
    }
}
