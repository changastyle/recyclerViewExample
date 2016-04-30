package com.example.nico.turista.modelo;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nico.turista.R;
import com.example.nico.turista.ViewHolders.CategoriaViewHolder;

import java.util.List;

/**
 * Created by nico on 30/04/16.
 */
public class AdaptadorCategoria extends RecyclerView.Adapter<CategoriaViewHolder>
{
    private List<Categoria> listaCategorias;

    public AdaptadorCategoria(List<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    @Override
    public CategoriaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categorias_adapter,parent,false);
        CategoriaViewHolder categoriaViewHolder = new CategoriaViewHolder(view);
        return categoriaViewHolder;
    }

    @Override
    public void onBindViewHolder(CategoriaViewHolder holder, int position)
    {
        //MATCHEO EL MODELO DE CATEGORIA CON SU VIEW CORRESPONDIENTE (VIEW HOLDER):
        holder.nombre.setText(listaCategorias.get(position).getNombre());
        holder.foto.setImageResource(listaCategorias.get(position).getIdFoto());
    }

    @Override
    public int getItemCount() {
        return listaCategorias.size();
    }
}
