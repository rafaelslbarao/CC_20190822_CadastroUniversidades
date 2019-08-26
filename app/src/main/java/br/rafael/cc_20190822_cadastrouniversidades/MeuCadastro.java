package br.rafael.cc_20190822_cadastrouniversidades;

import java.io.Serializable;

public class MeuCadastro implements Serializable {
    private Integer codigo;
    private String nome;

    public MeuCadastro() {
    }

    public MeuCadastro(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
