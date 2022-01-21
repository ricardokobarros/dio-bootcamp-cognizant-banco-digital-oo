package main.java;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Banco {

	private String nome;
	private List<Conta> contas;


	public void printContas() {
		contas.stream()
				.forEach(System.out::println);
	}

}
