import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Modulo Orientação Objeto");
		produto1.setValor(BigDecimal.valueOf(100));

		Produto produto2 = new Produto();
		produto2.setNome("Módulo de Spring Boot API Rest");
		produto2.setId(2L);
		produto2.setValor(BigDecimal.valueOf(300));

		Produto produto3 = new Produto();
		produto3.setNome("Módulo de Angular 8");
		produto3.setId(3L);
		produto3.setValor(BigDecimal.valueOf(100));

		Produto produto4 = new Produto();
		produto4.setNome("Módulo de Hibernate");
		produto4.setId(3L);
		produto4.setValor(BigDecimal.valueOf(300));

		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Formação Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomecliente("Gustavo");

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.getListaProdutos().add(produto3);
		venda.getListaProdutos().add(produto4);

		/*
		 * System.out.println("Descrição da Venda : " + venda.getDescricaoVenda() +
		 * " e o total: " + venda.totalVenda());
		 */
		System.out.println("Valor da variável total: " + venda.getValorTotal());
	}

}
