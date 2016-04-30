package com.example.nico.turista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nico.turista.Controladores.Controller;
import com.example.nico.turista.modelo.AdaptadorCategoria;

public class CategoriaAct extends AppCompatActivity
{
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);


        mRecyclerView = (RecyclerView) findViewById(R.id.reciclerCategoriaAct);
        mRecyclerView.setHasFixedSize(true);        //MEJORA LA PERFORMANCE
        mRecyclerView.setLayoutManager(new GridLayoutManager(this.getApplicationContext(),2)); //SETEANDO MANAGER PARA RECYCLER.
        AdaptadorCategoria adaptadorCategoria = new AdaptadorCategoria(Controller.getListaCategorias());
        mAdapter = adaptadorCategoria;
        mRecyclerView.setAdapter(mAdapter);
    }
}
