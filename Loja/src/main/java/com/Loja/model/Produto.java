package com.Loja.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ProdutoModel {

    @Id
    @GeneratedValue 

    private long id;

    private String nome;
    private double preco;
    private int quantidade;
}
