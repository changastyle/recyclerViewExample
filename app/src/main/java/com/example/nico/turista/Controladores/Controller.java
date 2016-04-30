package com.example.nico.turista.Controladores;

import com.example.nico.turista.R;
import com.example.nico.turista.modelo.Categoria;

import java.util.List;

/**
 * Created by nico on 30/04/16.
 */
public class Controller
{
    private static List<Categoria> listaCategorias;

    public static List<Categoria> getListaCategorias()
    {
        if(listaCategorias == null)
        {
            listaCategorias = new java.util.ArrayList<Categoria>();
            listaCategorias.add(new Categoria("Chocolate", R.drawable.choco));
            listaCategorias.add(new Categoria("Helado", R.drawable.choco));
        }
        return listaCategorias;
    }
}
