package com.developer.SpringMySQL.models;

import javax.persistence.*;

/**
 * Created by Pukar on 6/25/2017.
 */
@Entity
@Table(name = "appusers")
public class AppUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name = "cpf")
    public String cpf;
    @Column(name = "nome")
    public String nome;
    @Column(name = "endereco")
    public String endereco;
    @Column(name = "telefone")
    public String telefone;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public AppUsers() {

    }

    public AppUsers(String cpf, String nome, String endereco, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
