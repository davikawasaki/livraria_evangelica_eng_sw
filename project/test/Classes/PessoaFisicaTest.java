/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Date;
import java.util.Calendar;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @author davikawasaki
 */
public class PessoaFisicaTest {
    // Testes de caixa preta
    @Test
    public void ContatoInsereCPF() {
        PessoaFisica pf = new PessoaFisica();
        pf.setCPF("72083497384");
        String valorRecebido = pf.getCPF();
        assertEquals(valorRecebido, "72083497384");
    }
    @Test
    public void ContatoInsereNome() {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Joao");
        String valorRecebido = pf.getNome();
        assertEquals(valorRecebido, "Joao");
    }
    @Test
    public void ContatoInsereSobrenome() {
        PessoaFisica pf = new PessoaFisica();
        pf.setSobrenome("Silva");
        String valorRecebido = pf.getSobrenome();
        assertEquals(valorRecebido, "Silva");
    }
    @Test
    public void ContatoInsereRG() {
        PessoaFisica pf = new PessoaFisica();
        pf.setRG("380539603");
        String valorRecebido = pf.getRG();
        assertEquals(valorRecebido, "380539603");
    }
    @Test
    public void ContatoInsereSexo() {
        PessoaFisica pf = new PessoaFisica();
        pf.setSexo("Masculino");
        String valorRecebido = pf.getSexo();
        assertEquals(valorRecebido, "Masculino");
    }
    @Test
    public void ContatoInsereDataNascimento() {
        PessoaFisica pf = new PessoaFisica();
//        Date dataNasc = new Date(Calendar.getInstance().getTimeInMillis());
        pf.setDataNascimento("12/12/1990");
        String valorRecebido = pf.getDataNascimento();
        assertEquals(valorRecebido, "12/12/1990");
    }
    @Test
    public void ContatoInserePessoaFisica() {
        // Verificar se classe foi instanciada
    }
    @Test
    public void ContatoAlteraDadosPessoaFisica() {
        // Testa se os dados foram alterados com sucesso
    }
    
    @Test
    public void ContatoRemoveDadosPessoaFisica() {
        // Testa se os dados foram removidos com sucesso
    }
    
    @Test
    public void ContatoConsultaDadosPessoaFisica() {
        // Testa se os dados foram consultados com sucesso
    }
}
