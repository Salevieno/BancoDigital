package main;

public abstract class ContaBancaria
{
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	private static int ULTIMONUMEROCADASTRADO = 1;

	protected abstract void imprimirExtrato();

	public ContaBancaria()
	{
		this.agencia = 1;
		this.numero = ULTIMONUMEROCADASTRADO;
		this.saldo = 0;
		ULTIMONUMEROCADASTRADO += 1;
	}
	
	public int getAgencia()
	{
		return agencia;
	}

	public int getNumero()
	{
		return numero;
	}

	public double getSaldo()
	{
		return saldo;
	}

	protected void depositar(double quantia)
	{
		saldo += quantia;
	}
	
	protected void sacar(double quantia)
	{
		if (quantia <= saldo)
			saldo += -quantia;
		else
			System.out.println("Saque não realizado. Tentando sacar quantia maior que o saldo\n");
	}
	
	protected void transferir(ContaBancaria contaDestino, double quantia)
	{
		if (quantia <= saldo)
		{
			sacar(quantia);
			contaDestino.depositar(quantia);
		}
		else
			System.out.println("Transferência não realizada. Tentando transferir quantia maior que o saldo\n");
	}
	
	protected void imprimirInformacoesDaConta()
	{
		System.out.println("Agência: " + agencia);
		System.out.println("Número: " + numero);
		System.out.println("Saldo: " + saldo);
	}
}
