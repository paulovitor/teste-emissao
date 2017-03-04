/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ind.seat.testeemissao.boundary;

import br.ind.seat.testeemissao.control.EmissorDeSenha;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author matheus
 */
public class EmissaoBeanTest {

    private EmissaoBean emissaoBean;
    private EmissorDeSenha emissorDeSenha;

    @Before
    public void setUp() {
        emissorDeSenha = mock(EmissorDeSenha.class);

        emissaoBean = new EmissaoBean();

        emissaoBean.setEmissorDeSenha(emissorDeSenha);
    }

    @After
    public void tearDown() {
        emissorDeSenha = null;

        emissaoBean = null;
    }

    /**
     * Test of emiteGeral method, of class EmissaoBean.
     */
    @Test
    public void testEmiteGeral() {
        // dado
        String senha = "GERAL-1";
        when(emissorDeSenha.geraSenhaGeral()).thenReturn(senha);

        // quando
        emissaoBean.emiteGeral();

        // entao
        assertEquals(senha, emissaoBean.getSenhaEmitida());
    }

    /**
     * Test of emitePreferencial method, of class EmissaoBean.
     */
    @Test
    public void testEmitePreferencial() {
        // dado
        String senha = "PREFERENCIAL-1";
        when(emissorDeSenha.geraSenhaPreferencial()).thenReturn(senha);

        // quando
        emissaoBean.emitePreferencial();

        // entao
        assertEquals(senha, emissaoBean.getSenhaEmitida());
    }
}
