package br.ind.seat.testeemissao.control;

import javax.ejb.Singleton;

/**
 * Responsável por contar o número das senhas.
 * Ele é @Singleton para que só haja uma instância contando.
 *
 * @author matheus
 */
@Singleton
public class ContadorDeSenha {

    private int ultimaSenhaGeral;
    private int ultimaSenhaPreferencial;

    public int getUltimaSenhaGeral() {
        ultimaSenhaGeral++;
        return ultimaSenhaGeral;
    }

    public int getUltimaSenhaPreferencial() {
        ultimaSenhaPreferencial++;
        return ultimaSenhaPreferencial;
    }
}
