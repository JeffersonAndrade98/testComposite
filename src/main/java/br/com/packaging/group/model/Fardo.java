package br.com.packaging.group.model;

import java.util.ArrayList;
import java.util.List;

import br.com.packaging.group.Encomenda;
import lombok.Data;

@Data
public class Fardo implements Encomenda{

	private Integer id;
	private String codigo;
	private String cidadeDestino;
	private String valorTotal;

	public List<Encomenda> listEncomendas;
	
	@Override
	public void printEncomendaCodigo() {
		listEncomendas.forEach(Encomenda::printEncomendaCodigo);
		
	}

	public Fardo(Integer id, String codigo, String cidadeDestino, String valorTotal) {
		this.id = id;
		this.codigo = codigo;
		this.cidadeDestino = cidadeDestino;
		this.valorTotal = valorTotal;
		this.listEncomendas = new ArrayList<>();
	}
	
	public void addEncomenda(Encomenda encomenda) {
		listEncomendas.add(encomenda);
	}
	
	public void removeEncomenda(Encomenda encomenda) {
		listEncomendas.remove(encomenda);
	}

}
