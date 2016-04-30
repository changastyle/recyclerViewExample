package com.example.nico.turista.modelo;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nico.turista.R;

import static android.support.v7.widget.RecyclerView.*;

/**
 * Created by nico on 30/04/16.
 */
public class Categoria
{
    private int id;
    private String nombre;
    private int idFoto;

    public Categoria(String nombre, int idFoto) {
        this.nombre = nombre;
        this.idFoto = idFoto;

    }
    //*GYS:*//

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdFoto() {
        return this.idFoto;
    }

    public void setIdFoto(String urlFoto) {
        this.idFoto = idFoto;
    }

    @Override
    public String toString()
    {
        return "Categoria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", urlFoto=" + idFoto +
                '}';
    }
}
