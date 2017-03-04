package br.ind.seat.testeemissao.boundary;

import br.ind.seat.testeemissao.control.EmissorDeSenha;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author matheus
 */
public class EmissaoBean {
    @Inject
    protected EmissorDeSenha emissorDeSenha;
    
    public void emiteGeral() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_WARN, "Não implementado", "Função não implementada."));
    }
}
