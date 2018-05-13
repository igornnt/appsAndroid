package br.edu.unipampa.app.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Encaminhamento {

    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("descricao")
    @Expose
    private String descricao;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Encaminhamento withId(Object id) {
        this.id = id;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Encaminhamento withDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
}