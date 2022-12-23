package main;

public class ContaPoupanca extends ContaBancaria
{
	private static double rendimento = 0.01;
	
	public ContaPoupanca()
	{
		super();
	}
	
	public void renderSaldo()
	{
		saldo = saldo * (1.0 + rendimento);
	}
	
	public void imprimirExtrato()
	{
		System.out.println("Extrato da conta poupança");
		imprimirInformacoesDaConta();
	}
}
