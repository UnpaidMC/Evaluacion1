package com.evaluacion1.models;

import javax.persistence.*;

@Entity
@Table(name="registroGuitarra")


public class Guitarra {

//Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private Integer precioCLP;
    private String maderatipo;

//Constructores

    public Guitarra() {
        super();
    }


    public Guitarra(Long id, String marca, String modelo, Integer precioCLP, String maderatipo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precioCLP = precioCLP;
        this.maderatipo = maderatipo;
    }


//Getters y Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getPrecioCLP() {
        return precioCLP;
    }

    public void setPrecioCLP(Integer precioCLP) {
        this.precioCLP = precioCLP;
    }

    public String getMaderatipo() {
        return maderatipo;
    }

    public void setMaderatipo(String maderatipo) {
        this.maderatipo = maderatipo;
    }
}
