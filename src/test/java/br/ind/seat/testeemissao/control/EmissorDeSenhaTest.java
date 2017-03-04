/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ind.seat.testeemissao.control;

import br.ind.seat.testeemissao.entity.Senha;
import br.ind.seat.testeemissao.entity.TipoSenha;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author matheus
 */
public class EmissorDeSenhaTest {

    private ContadorDeSenha contadorDeSenha;
    private EntityManager entityManager;

    private EmissorDeSenha emissorDeSenha;

    @Before
    public void setUp() {
        emissorDeSenha = new EmissorDeSenha();

        contadorDeSenha = mock(ContadorDeSenha.class);
        entityManager = mock(EntityManager.class);

        emissorDeSenha.setContadorDeSenha(contadorDeSenha);
        emissorDeSenha.setEntityManager(entityManager);
    }

    @After
    public void tearDown() {
        contadorDeSenha = null;
        entityManager = null;

        emissorDeSenha = null;
    }

    @Test
    public void testGeraSenhaGeral() {
        // dado
        Senha entity = new Senha(2, TipoSenha.GERAL);

        when(contadorDeSenha.getUltimaSenhaGeral()).thenReturn(2);
        when(entityManager.merge(entity)).thenReturn(entity);

        // quando
        String senha = emissorDeSenha.geraSenhaGeral();

        // entao
        assertNotNull(senha);
        assertEquals(entity.toString(), senha);
    }

    @Test
    public void testGeraSenhaPreferencial() {
        // dado
        Senha entity = new Senha(2, TipoSenha.PREFERENCIAL);

        when(contadorDeSenha.getUltimaSenhaPreferencial()).thenReturn(2);
        when(entityManager.merge(entity)).thenReturn(entity);

        // quando
        String senha = emissorDeSenha.geraSenhaPreferencial();

        // entao
        assertNotNull(senha);
        assertEquals(entity.toString(), senha);
    }
}
