package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import model.Administrador;
import model.Funcionario;
import model.Produto;
import model.Usuario;

class UsuarioTeste {

	@Test
	public void testNiveisDeAcesso() {
	    Usuario admin = new Administrador("Admin", "admin", "1234");
	    Usuario funcionario = new Funcionario("Funcionario", "func", "1234");
	    assertEquals("Administrador", admin.nivelDeAcesso());  
	    assertEquals("Funcionario", funcionario.nivelDeAcesso());
	}
	
	@Test
	public void permissoesAdministrador() {
		Administrador admin = new Administrador("Admin", "admin", "123");
		Produto produto = new Produto("Produto1", "Descricao", 100, 250.0, java.time.LocalDate.of(2024, 8, 31));
		
		admin.cadastrarProduto(produto);
		assertTrue(admin.getProdutos().contains(produto));
		
		admin.excluirProduto(produto);
		assertFalse(admin.getProdutos().contains(produto));
		
		admin.atualizarEstoque(produto, 150);
	}
	
	@Test
	public void testPermissoesFuncionario() {
	    Funcionario funcionario = new Funcionario("Funcionario", "func", "1234");
	    Produto produto = new Produto("Produto1", "Descricao", 10, 50.0, java.time.LocalDate.of(2024, 12, 31));
	    
	    // Testar permissões do funcionario
	    funcionario.consultarEstoque(produto);
	    
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	    	funcionario.cadastrarProduto(produto);
	    });
	    
	    String expectedMessage = "Somente administradores podem cadastrar produtos.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
	}
	@Test
    	public void testExportarRelatorioTexto() {
        	String relatorioEsperado = "Relatório de Estoque:\n" +
                	"Nome: Produto1\n" +
                	"Descrição: Descricao1\n" +
                	"Quantidade: 10\n" +
                	"Preço: 50.0\n" +
                	"Validade: 2024-12-31\n" +
                	"-----------------------\n" +
                	"Nome: Produto2\n" +
                	"Descrição: Descricao2\n" +
                	"Quantidade: 20\n" +
                	"Preço: 30.0\n" +
                	"Validade: 2025-01-15\n" +
                	"-----------------------\n";

        	String relatorioGerado = admin.exportarRelatorio();
        	assertEquals(relatorioEsperado, relatorioGerado);
    	}
}
