/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ind.seat.testeemissao.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author matheus
 */
public class ContadorDeSenhaTest {

    private ContadorDeSenha contadorDeSenha;

    @Before
    public void setUp() {
        contadorDeSenha = new ContadorDeSenha();
        contadorDeSenha.getUltimaSenhaGeral();
        contadorDeSenha.getUltimaSenhaPreferencial();
    }

    @After
    public void tearDown() {
        contadorDeSenha = null;
    }

    @Test
    public void testGetUltimaSenhaGeral() {
        // quando
        int ultimaSenha = contadorDeSenha.getUltimaSenhaGeral();

        // entao
        assertNotNull(ultimaSenha);
        assertEquals(2, ultimaSenha);
    }

    @Test
    public void testGetUltimaSenhaPreferencial() {
        // quando
        int ultimaSenha = contadorDeSenha.getUltimaSenhaPreferencial();

        // entao
        assertNotNull(ultimaSenha);
        assertEquals(2, ultimaSenha);
    }
}
