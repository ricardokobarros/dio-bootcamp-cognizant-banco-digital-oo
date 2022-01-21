package main.java;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientePJ extends Cliente {

	private String cnpj;

	@Override
	public String toString() {
		return "ClientePJ{" +
				"nome='" + nome + '\'' +
				", cnpj='" + cnpj + '\'' +
				'}';
	}


}
