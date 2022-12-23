package main;

public class ContaCorrente extends ContaBancaria
{
	public ContaCorrente()
	{
		super();
	}
	
	public void imprimirExtrato()
	{
		System.out.println("Extrato da conta corrente");
		imprimirInformacoesDaConta();
	}
}
