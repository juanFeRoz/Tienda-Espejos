package com.uis.proyectoespejos.Modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name=Espejo.TABLE_NAME)
public class Espejo {
    public static final String TABLE_NAME="espejo";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "precio")
    private double precio;

    public Espejo(){
    }

    public Espejo(long id, String nombre, int cantidad, double precio){
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public long getID(){
        return this.id;
    }

    public void setId(Long Id){
        this.id = Id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

}
