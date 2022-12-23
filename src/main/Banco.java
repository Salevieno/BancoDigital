package main;

import java.util.ArrayList;
import java.util.List;

public class Banco
{
	private String nome;
	private List<Cliente> clientes;

	public Banco(String nome)
	{
		this.nome = nome;
		clientes = new ArrayList<>();
	}
	
	public String getNome()
	{
		return nome;
	}

	public List<Cliente> getClientes()
	{
		return clientes;
	}
	
	public void addCliente(Cliente cliente)
	{
		clientes.add(cliente);
	}
	
	public void removerCliente(Cliente cliente)
	{
		if (clientes.contains(cliente))
		{
			clientes.remove(cliente);
		}
		else
		{
			System.out.println("O cliente que está tentando remover não está cadastrado");
		}
	}
	
	public void imprimirListaDeClientes()
	{
		for (Cliente cliente : clientes)
		{
			System.out.println(cliente.getNome());
		}
	}
}