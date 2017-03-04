package br.ind.seat.testeemissao.control;

import br.ind.seat.testeemissao.entity.Senha;
import br.ind.seat.testeemissao.entity.TipoSenha;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author matheus
 */
@Stateless
public class EmissorDeSenha {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmissorDeSenha.class);

    protected ContadorDeSenha contadorDeSenha;
    protected EntityManager entityManager;

    public String geraSenhaGeral() {
        int ultimaSenhaGeral = contadorDeSenha.getUltimaSenhaGeral();

        Senha senha = new Senha(ultimaSenhaGeral, TipoSenha.GERAL);
        entityManager.merge(senha);

        LOGGER.info("Senha: " + senha.toString());

        return senha.toString();
    }

    public String geraSenhaPreferencial() {
        int ultimaSenhaPreferencial = contadorDeSenha.getUltimaSenhaPreferencial();

        Senha senha = new Senha(ultimaSenhaPreferencial, TipoSenha.PREFERENCIAL);
        entityManager.merge(senha);

        LOGGER.info("Senha: " + senha.toString());

        return senha.toString();
    }

    @Inject
    public void setContadorDeSenha(ContadorDeSenha contadorDeSenha) {
        this.contadorDeSenha = contadorDeSenha;
    }

    @PersistenceContext(unitName = "teste-emissao")
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
