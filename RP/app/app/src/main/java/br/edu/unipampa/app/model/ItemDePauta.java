package br.edu.unipampa.app.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ItemDePauta {

    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("relator")
    @Expose
    private String relator;
    @SerializedName("descricao")
    @Expose
    private String descricao;
    @SerializedName("encaminhamentos")
    @Expose
    private List<Encaminhamento> encaminhamentos = null;
    @SerializedName("segundoTurno")
    @Expose
    private boolean segundoTurno;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public ItemDePauta withId(Object id) {
        this.id = id;
        return this;
    }

    public String getRelator() {
        return relator;
    }

    public void setRelator(String relator) {
        this.relator = relator;
    }

    public ItemDePauta withRelator(String relator) {
        this.relator = relator;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ItemDePauta withDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public List<Encaminhamento> getEncaminhamentos() {
        return encaminhamentos;
    }

    public void setEncaminhamentos(List<Encaminhamento> encaminhamentos) {
        this.encaminhamentos = encaminhamentos;
    }

    public ItemDePauta withEncaminhamentos(List<Encaminhamento> encaminhamentos) {
        this.encaminhamentos = encaminhamentos;
        return this;
    }

    public boolean isSegundoTurno() {
        return segundoTurno;
    }

    public void setSegundoTurno(boolean segundoTurno) {
        this.segundoTurno = segundoTurno;
    }

    public ItemDePauta withSegundoTurno(boolean segundoTurno) {
        this.segundoTurno = segundoTurno;
        return this;
    }
}
