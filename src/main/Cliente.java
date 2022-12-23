package main;

public class Cliente
{
	private String nome;	
	private ContaBancaria contaCorrente;
	private ContaBancaria contaPoupanca;
	
	public Cliente(String nome, ContaBancaria contaCorrente)
	{
		this.nome = nome;
		this.contaCorrente = contaCorrente;
	}

	public Cliente(String nome, ContaBancaria contaCorrente, ContaBancaria contaPoupanca)
	{
		this.nome = nome;
		this.contaCorrente = contaCorrente;
		this.contaPoupanca = contaPoupanca;
	}
	
	public String getNome()
	{
		return nome;
	}

	public ContaBancaria getContaCorrente()
	{
		return contaCorrente;
	}

	public ContaBancaria getContaPoupanca()
	{
		return contaPoupanca;
	}
}