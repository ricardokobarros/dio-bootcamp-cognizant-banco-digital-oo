package main.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Banco Digital",new ArrayList<>());
		Cliente venilton = new ClientePF("000.000.000-00");
		venilton.setNome("Venilton");

		Conta cc = new Conta(venilton, TypeEnum.CONTA_CORRENTE );
		Conta poupanca = new Conta(venilton, TypeEnum.CONTA_POUPANCA);

		banco.getContas().add(cc);
		banco.getContas().add(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		banco.printContas();
	}

}
