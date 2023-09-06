package br.com.packaging.group;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.packaging.group.model.Fardo;
import br.com.packaging.group.model.Pacote;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		
		Encomenda pacote1 = new Pacote(1, "Pacote_1", "Maria", "35,00", "Santa Luzia - MA");
		Encomenda pacote2 = new Pacote(2, "Pacote_2", "Maria", "40,00", "Santa Luzia - MA");
		Encomenda pacote3 = new Pacote(3, "Pacote_3", "Joana Silva", "35,00", "Santa Ines - MA");
		Encomenda pacote4 = new Pacote(4, "Pacote_4", "Clarice Almeida", "25,00", "Pindare - MA");
		Encomenda pacote5 = new Pacote(5, "Pacote_5", "Raimunda Almeida", "50,00", "Santa Ines - MA");
		Encomenda pacote6 = new Pacote(6, "Pacote_6", "Nadja Campos", "35,00", "Pindare - MA");
		
		Fardo fardo = new Fardo(1, "3767", "Santa Luzia - MA", "R$ 220,00");
		
		fardo.addEncomenda(pacote1);
		fardo.addEncomenda(pacote2);
		fardo.addEncomenda(pacote3);
		fardo.addEncomenda(pacote4);
		fardo.addEncomenda(pacote5);
		fardo.addEncomenda(pacote6);
		
		fardo.printEncomendaCodigo();
	}

}
