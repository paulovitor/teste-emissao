package br.ind.seat.testeemissao.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Senha {

    private int valor;

    @Id
    @Enumerated(EnumType.STRING)
    private TipoSenha tipoSenha;

    public Senha() {
    }

    public Senha(int valor, TipoSenha tipoSenha) {
        this.valor = valor;
        this.tipoSenha = tipoSenha;
    }

    public int getValor() {
        return valor;
    }

    public TipoSenha getTipoSenha() {
        return tipoSenha;
    }

    @Override
    public String toString() {
        return tipoSenha + "-" + valor;
    }
}
