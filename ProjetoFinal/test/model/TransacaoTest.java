package model;

import java.time.LocalDate;
import java.util.Collections;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class TransacaoTest {
    
    Transacao t;

    @Before
    public void inicializarTeste(){
        t = new Transacao();
    }
    
    /**
    * Caso de teste 1
    */
    @Test
    public void testIncluirReceita() {
        t.incluirReceita(new Receita(1500, LocalDate.parse("2023-12-12"), TipoReceita.Outras));
        
        assertEquals(1500, t.getReceitas().get(0).getValorTransacao(), 0.01);
    }
    
    /**
    * Caso de teste 2
    */
    @Test
    public void testIncluirDespesa() {
        t.incluirDespesa(new Despesa(250, LocalDate.parse("2023-12-12"), TipoDespesa.Outras));
        
        assertEquals(250, t.getDespesas().get(0).getValorTransacao(), 0.01);
    }
    
    /**
    * Caso de teste 3
    */
    @Test
    public void testProcessarArquivo() {
        t.processarArquivo();
        
        assertEquals(LocalDate.parse("2023-11-28"), t.getExtrato().get(0).getDataTransacao());
    }
    
    /**
    * Caso de teste 4
    */
    @Test
    public void testOrdenacaoPorData() {
        t.processarArquivo();
        
        Collections.sort(t.getExtrato(), new OrdenacaoPorData());
        
        assertEquals(LocalDate.parse("2000-01-01"), t.getExtrato().get(0).getDataTransacao());
    }
}