package br.edu.ifpb.pos.entity;

/**
 * Created by natarajan on 18/10/16.
 */
public class Pessoa {

    private String name;

    public Pessoa() {
    }

    public Pessoa(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
