package br.edu.ifs.loja.test;

import br.edu.ifs.loja.model.Item;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ItemTest {

    @Test
    public void testCriarItem() {
        Item item = new Item("Produto 1", 100.0);
        assertEquals("Produto 1", item.getNome());
        assertEquals(100.0,item.getPreco(),0.0001);
    }
    
 
}

