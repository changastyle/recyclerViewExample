package com.example.nico.turista.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nico.turista.R;

/**
 * Created by nico on 30/04/16.
 */
public class CategoriaViewHolder extends RecyclerView.ViewHolder
{
    public View contenedora;
    public TextView nombre;
    public ImageView foto;

    public CategoriaViewHolder(View itemView)
    {
        super(itemView);

        contenedora = (View) itemView.findViewById(R.id.card_view);
        nombre = (TextView) itemView.findViewById(R.id.txtNombreCategoria);
        foto = (ImageView) itemView.findViewById(R.id.fotoCategoria);
    }
}
