import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private Long id;

	private String descricaoVenda;
	
	private String nomecliente;
	
	private String enderecoEntrega;

	private BigDecimal valorTotal;
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoVenda() {
		return descricaoVenda;
	}

	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricaoVenda=" + descricaoVenda + ", nomecliente=" + nomecliente
				+ ", enderecoEntrega=" + enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProdutos="
				+ listaProdutos + "]";
	}
	
	

}
