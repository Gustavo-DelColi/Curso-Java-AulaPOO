import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Modulo Orienta��o Objeto");
		produto1.setValor(BigDecimal.valueOf(100));

		Produto produto2 = new Produto();
		produto2.setNome("M�dulo de Spring Boot API Rest");
		produto2.setId(2L);
		produto2.setValor(BigDecimal.valueOf(300));
		
		
		Venda venda = new Venda();
			venda.setDescricaoVenda("Venda Curso Forma��o Java");
			venda.setEnderecoEntrega("Entrega pelo E-mail");
			venda.setId(10L);
			venda.setNomecliente("Gustavo");
			venda.setValorTotal(BigDecimal.valueOf(197.00));
			
			venda.getListaProdutos().add(produto1);
			venda.getListaProdutos().add(produto2);
			
			System.out.println("Descri��o Venda : " + venda);

	}

}
