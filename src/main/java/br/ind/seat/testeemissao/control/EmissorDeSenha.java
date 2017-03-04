package br.ind.seat.testeemissao.control;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author matheus
 */
@Stateless
public class EmissorDeSenha {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmissorDeSenha.class);
    
    @PersistenceContext(unitName = "teste-emissao")
    private EntityManager em;
    
    @Inject
    protected ContadorDeSenha contadorDeSenha;
    
    
}
