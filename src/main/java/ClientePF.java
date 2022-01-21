package main.java;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
public class ClientePF extends Cliente {

	private String cpf;

	@Override
	public String toString() {
		return "ClientePF{" +
				"nome='" + nome + '\'' +
				", cpf='" + cpf + '\'' +
				'}';
	}
}
