package main;

import java.util.Locale;
import java.util.Scanner;

import entidades.ClientePF;
import entidades.ClientePJ;
import entidades.Produtos;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		ClientePF cliente = new ClientePF();
		ClientePJ cliente2 = new ClientePJ();
		Produtos produtos = new Produtos();
		
		int opcao = 0;
		
		while(opcao != 13 ) {
		System.out.println(" ");
		System.out.println("------------------------------");
		System.out.println("-------MENU DO MERCADO-------");
		System.out.println("------------------------------");
		System.out.println("1-Para cadastrar Produto");
		System.out.println("2-Para alterar o preço do produto");
		System.out.println("3–Para ver o preço do produto cadastrado ");
		System.out.println("4–Para ver todas as informações do produto cadastrado");
		System.out.println("5–Para cadastrar uma Cliente PF");
		System.out.println("6–Para ver o Nome e CPF do Cliente PF");
		System.out.println("7–Para alterar o celular do Cliente PF");
		System.out.println("8–Para ver todas as informações do Cliente PF ");
		System.out.println("9–Para cadastrar uma Cliente PJ");
		System.out.println("10–Para ver o Nome e CNPJ do Cliente PJ");
		System.out.println("11–Para alterar o CNPJ do Cliente PJ");
		System.out.println("12–Para ver todas as informações do Cliente PJ");
		System.out.println("13–Para sair.");
		System.out.println("---------------------------------");
		System.out.print("Escolha uma das opções Acima:");
		
		opcao = ler.nextInt();

		ler.nextLine();
		
		if(opcao == 1) {
			System.out.println("");
			System.out.println("Você escolheu a opção: " + opcao +" Cadastrar Produto");
			System.out.println(" ");
			
			for(int i = 0; i<=3;) {
				System.out.println(" ");
				
				System.out.print("O Digite a Nome: " );
				String nome = ler.nextLine();
				
				System.out.print("O Digite a Marca: " );
				String marca = ler.nextLine();
	
				System.out.print("O Digite o Valor: " );
				double valor = ler.nextDouble();
				
				produtos = new Produtos(nome, marca, valor);

				break;
			}
		}
		else if(opcao == 2) {
			System.out.println("Você escolheu a opção: " + opcao +" Alterar preço do produto");
			System.out.println(" ");
			System.out.print("O Digite o Preço: " );
			double valor = ler.nextDouble();
			System.out.println(" ");

			System.out.println("ALTERADO COM SUCESSO");
			System.out.println(" ");
		}
		else if(opcao == 3) {
			System.out.println("");
			System.out.println("Você escolheu a opção: " + opcao +" Verificar preço do Produto Cadastrado");
			System.out.println(" ");
			System.out.println("Possui o valor de "+ produtos.getNome());
		}
		else if(opcao == 4) {
			System.out.println("");
			System.out.println("Você escolheu a opção: " + opcao + " Informaçôes do Produto");
			System.out.println(" ");
			System.out.println("----- O Produto "+ produtos.getNome());
			System.out.println("----- Da Marca "+ produtos.getMarca());
			System.out.println("----- Possui o valor de "+ produtos.getValor());
			System.out.println(" ");
		}
		else if(opcao == 5) {
			
			System.out.println("");
			System.out.println("Você escolheu a opção: " + opcao + " Cadastrar Cliente PF"); 
			
			for(int i = 0; i<=4;) {
				System.out.println(" ");
				System.out.print("O Digite o nome do Cliente: " );
				String nome = ler.next();
				
				System.out.print("O Digite o CPF: " );
				String cpf = ler.next();
				
				System.out.print("O Digite o Celular: " );
				String celular = ler.next();
				
				System.out.print("O Digite a Data de Nascimento: " );
				String dataNascimento = ler.next();
				System.out.println(" ");
				
				cliente = new ClientePF (nome, cpf, celular, dataNascimento);

				break;
			}
				
		}
		else if(opcao == 6) {
			System.out.println("");
			System.out.println("Você escolheu a opção: " + opcao + " Ver Nome e CPF - Cliente PF");
			System.out.println(" ");
			System.out.println("Cliente(a) "+ cliente.getNome()+ " com o CPF " + cliente.getCpf());
			System.out.println(" ");

		}
		else if(opcao == 7) {
			System.out.println("");
			System.out.println("Você escolheu a opção: " + opcao + " Alterar Celular do Cliente PF");
			System.out.println(" ");
			System.out.print("O Digite o Celular: " );
			String celular = ler.next();
			System.out.println(" ");

			System.out.println("ALTERADO COM SUCESSO");
			System.out.println(" ");
			
		}
		else if(opcao == 8) {
			System.out.println("");
			System.out.println("Você escolheu a opção: " + opcao + " Informações do Cliente PF");
			System.out.println(" ");
			System.out.println("----- Cliente "+ cliente.getNome());
			System.out.println("----- Do CPF "+ cliente.getCpf());
			System.out.println("----- Possui o contato "+ cliente.getCelular());
			System.out.println("cuja a data de aniversario é "+cliente.getDataNascimento());
			System.out.println(" ");

		}
		else if(opcao == 9) {
			System.out.println("Você escolheu a opção: " + opcao + " Para cadastrar uma Cliente PJ");
			System.out.println(" ");
			
			for(int i = 0; i<=4;) {
				System.out.println(" ");
				System.out.print("O Digite o nome do Cliente: " );
				String nome = ler.next();
				
				System.out.print("O Digite o CNPJ: " );
				String cnpj = ler.next();
				
				System.out.print("O Digite o Celular: " );
				String celular = ler.next();
				
				System.out.print("O Digite a Data de Criação: " );
				String dataCriacao = ler.next();
				break;
			}
		}
		else if(opcao == 10) {
			System.out.println("");
			System.out.println("Você escolheu a opção: " + opcao + " Nome e CNPJ do Cliente PJ");
			System.out.println(" ");
			System.out.println("Cliente(a) "+ cliente2.getNome()+ " com o CNPJ " + cliente2.getCnpj());
			System.out.println(" ");
			
		}
		else if(opcao == 11) {
			System.out.println("");
			System.out.println("Você escolheu a opção: " + opcao + " Alterar o CNPJ do Cliente PJ");
			System.out.println(" ");
			System.out.print("O Digite o CNPJ: " );
			cliente2.cnpj = ler.next();
			System.out.println(" ");
			System.out.println("ALTERADO COM SUCESSO");
			System.out.println(" ");
		}
		else if(opcao == 12) {
			System.out.println("");
			System.out.println("Você escolheu a opção: " + opcao + " Informações do Cliente PJ");
			System.out.println(" ");
			System.out.println("-----Cliente "+ cliente2.getNome());
			System.out.println("-----Do CPF "+ cliente2.getCnpj());
			System.out.println("-----Possui o contato "+ cliente2.getCelular());
			System.out.println("cuja a data de aniversario é "+cliente2.getDataCriacao());
			System.out.println(" ");
			
			
		}
		else if(opcao == 13) {
			System.out.println("");
			System.out.println("Você escolheu a opção: " + opcao + "- Saindo Programa");
			System.out.println("-------------------------------------");
			System.out.println(" ");
			
			}
		
		  }
		
		
		ler.close();
	}

}


