package br.ind.seat.testeemissao.boundary;

import br.ind.seat.testeemissao.control.EmissorDeSenha;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

/**
 * @author matheus
 */
@ManagedBean
@RequestScoped
public class EmissaoBean {

    protected EmissorDeSenha emissorDeSenha;

    private String senhaEmitida;

    public void emiteGeral() {
        senhaEmitida = emissorDeSenha.geraSenhaGeral();
    }

    public void emitePreferencial() {
        senhaEmitida = emissorDeSenha.geraSenhaPreferencial();
    }

    public String getSenhaEmitida() {
        return senhaEmitida;
    }

    @Inject
    public void setEmissorDeSenha(EmissorDeSenha emissorDeSenha) {
        this.emissorDeSenha = emissorDeSenha;
    }
}
