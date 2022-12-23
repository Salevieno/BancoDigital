package main;

/**
 * Made with love by Salevieno
 * @author Salevieno
 * @version 1.0
 * @since December 22, 2022
 */
public class Main
{	
	public static void main(String[] args)
	{
		// criando banco
		Banco banco = new Banco("Banco do exemplo");
		
		// criando clientes com contas bancárias
		ContaBancaria contaCorrenteJose = new ContaCorrente();
		ContaBancaria contaPoupancaJose = new ContaPoupanca();
		Cliente Jose = new Cliente("Jose", contaCorrenteJose, contaPoupancaJose);
		
		ContaBancaria contaCorrenteCleison = new ContaCorrente();
		Cliente Cleison = new Cliente("Cleison", contaCorrenteCleison);
		
		// adicionando clientes ao banco
		banco.addCliente(Jose);
		banco.addCliente(Cleison);
		
		// José deposita 100 reais na conta corrente e 200 na conta poupança
		Jose.getContaCorrente().depositar(100);
		Jose.getContaPoupanca().depositar(200);
		
		// Cleison tenta sacar 100 reais da conta corrente, porém ela está zerada
		Cleison.getContaCorrente().sacar(100);
		
		// José deposita mais 300 reais na conta poupança e transfere para Cleison
		Jose.getContaPoupanca().depositar(300);
		Jose.getContaPoupanca().transferir(Cleison.getContaCorrente(), 300);
		
		// Cleison agora consegue sacar os 100 reais da conta corrente
		Cleison.getContaCorrente().sacar(100);
		
		// conta poupança de josé rende
		((ContaPoupanca) Jose.getContaPoupanca()).renderSaldo();
		
		// mostra todos os clientes do banco
		System.out.println("Clientes do banco");
		banco.imprimirListaDeClientes();
		System.out.println();
		
		// mostra as informações das contas de todos os clientes
		for (int i = 0 ; i <= banco.getClientes().size() - 1 ; i += 1)
		{
			Cliente cliente = banco.getClientes().get(i);
			System.out.println("Informações de " + cliente.getNome());
			cliente.getContaCorrente().imprimirExtrato();
			if (cliente.getContaPoupanca() != null)
			{
				System.out.println();
				cliente.getContaPoupanca().imprimirExtrato();
			}
			System.out.println();
		}
	}
}
