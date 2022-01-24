package com.infocarsapp.vo;

public class Autos {
    private Integer id;
    private String marca;
    private String modelo;
    private String nombre;
    private String fechaFabricacion;
    private String imagen;

    public Autos() {
    }

    public Autos(Integer id, String marca, String modelo, String nombre, String fechaFabricacion, String image) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.nombre = nombre;
        this.fechaFabricacion = fechaFabricacion;
        this.imagen = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}