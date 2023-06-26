/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PRAC_EXAMEN.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "arbol")

public class Arbol {
    
    @Id
    @Column(name = "id_arbol")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer id_arbol;
    private String tipo;
    private String tipo_flor;
    private String ruta_imagen;
    private Integer altura;
    private boolean activo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_arbol() {
        return id_arbol;
    }

    public void setId_arbol(Integer id_arbol) {
        this.id_arbol = id_arbol;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo_flor() {
        return tipo_flor;
    }

    public void setTipo_flor(String tipo_flor) {
        this.tipo_flor = tipo_flor;
    }

    public String getRuta_imagen() {
        return ruta_imagen;
    }

    public void setRuta_imagen(String ruta_imagen) {
        this.ruta_imagen = ruta_imagen;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
