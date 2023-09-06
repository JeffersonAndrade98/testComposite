package br.com.packaging.group.model;

import br.com.packaging.group.Encomenda;
import lombok.Data;

@Data
public class Pacote implements Encomenda{

	private Integer id;
	private String codigo;
	private String nomeCliente;
	private String valor;
	private String cidadeDestino;
	
	@Override
	public void printEncomendaCodigo() {
		System.out.println(getNomeCliente() + " - " + getCidadeDestino());
	}

	public Pacote(Integer id, String codigo, String nomeCliente, String valor, String cidadeDestino) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nomeCliente = nomeCliente;
		this.valor = valor;
		this.cidadeDestino = cidadeDestino;
	}

	
	
	

}
