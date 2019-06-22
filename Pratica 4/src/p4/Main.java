package p4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		
		Scanner s = new Scanner(System.in);

		Agencia agencia = new Agencia();
		ArrayList<Cliente> clientes;
		ArrayList<Conta> contas;
		ArrayList<Operacao> operacoes;
		int operacao = 1;
		String CPF;

		while (operacao != 0) {
			System.out.println("Bem vindo ao Banco!\n");
			System.out.println("1-Cadastrar \n2-Operações \n3-Sair \n");
			operacao = s.nextInt();

			switch (operacao) {
				case 1:
					System.out.println("Informe o seu CPF: ");
					CPF = s.next();
					if (agencia.addCliente(CPF)) {
						System.out.println("Sucesso ao cadastrar!");
					}else{
						System.out.println("Cadastro não realizado!");
					}
					break;
			case 2:
				System.out.println("Informe o seu CPF: ");
				CPF = s.next();
				clientes = agencia.getClientes();
				int cT = 0;
				int cI = 0;
				for (Cliente cliente : clientes) {
					cT++;
					if (cliente.getIdCliente().equals(CPF)) {
						int opcaoCliente = 1;
						while (opcaoCliente != 0) {
							System.out.println("1-Adicionar uma nova conta\n"
									+ "2-Ver contas\n"
									+ "3-Acessar uma de suas contas\n"
									+ "4-Encerrar uma conta\n"
									+ "5-Voltar");
							opcaoCliente = s.nextInt();

							switch (opcaoCliente) {
								case 1:
									if(agencia.abrirNovaConta(CPF)) {
										System.out.println("Sucesso ao criar conta!");
									}else {
										System.out.println("Conta não criada!");
									}
									break;
								case 2:
									contas = cliente.getContas();
									for (Conta conta : contas) {
										System.out.println(conta);
									}
									break;
	
								case 3:
									System.out.println("Informe o numero da conta");
									int contaAux = s.nextInt();
									contas = cliente.getContas();
	
									for (Conta conta : contas) {
										if ((conta.getNumero() == contaAux) && conta.getAtiva()) {
											int operacaoConta = 1;
											while (operacaoConta != 0) {
												System.out.println("Conta " + conta.getNumero());
												System.out.println(
														"1-Depositar\n"
														+ "2-Sacar\n"
														+ "3-Transferencia\n"
														+ "4-Extrato\n"
														+ "5-Saldo\n"
														+ "6-Voltar ");
												operacaoConta = s.nextInt();
												int v;
												switch (operacaoConta) {
													case 1:
														System.out.println("Valor para depositar: ");
														v = s.nextInt();
														if (conta.depositar(v)) {
															System.out.println("Sucesso ao depositar!");
														}else {
															System.out.println("Depositivo não realizado");
														}
														break;
		
													case 2:
														System.out.println("Valor para sacar: ");
														v = s.nextInt();
														if(conta.sacar(v)) {
															System.out.println("Sucesso ao sacar!");
														}else {
															System.out.println("Saque não realizado");
														}
														break;
		
													case 3:
														System.out.println("Número da conta de destino: ");
														int nConta = s.nextInt();
														System.out.println("Valor da transferência: ");
														v = s.nextInt();
		
														Conta aux = null;
														for (Cliente cli : clientes) {
															ArrayList<Conta> contas2 = cli.getContas();
															for (Conta ct : contas2) {
																if (ct.getNumero() == nConta) {
																	aux = ct;
																}
															}
		
														}
		
														if (aux != null) {
															if (conta.transferir(aux, v)) {
																System.out.println("Sucesso ao transferir!");
															}else {
																System.out.println("Transferencia não realizada");
															}
														} else {
															System.out.println("Conta não encotrada");
														}
														break;
													case 4:
														operacoes = conta.getExtrato();
														System.out.println();
														System.out.println("-----------------EXTRATO-----------------");
														for (Operacao o : operacoes) {
															System.out.println(o);
														}
														break;
		
													case 5:
														System.out.println("Saldo R$" + conta.getSaldo());
														break;
		
													default:
														break;
													}
												}
											}
										}
									break;
								case 4:
									System.out.println("Digite o número da conta a ser encerrada");
									int nAux = s.nextInt();
									contas = cliente.getContas();
	
									for (Conta conta : contas) {
										if (conta.getNumero() == nAux) {
											conta.encerrar();
										}
									}
									break;
								default:
									break;
								}
							}
					} else {
						cI++;
					}
				}
				if (cI == cT) {
					System.out.println("CPF não cadastrado!");
				}
				break;
			case 0:
				System.out.println("Adeus!!!");
				System.exit(0);
			default:
				System.out.println("Operação inválida");
				break;
			}
			System.out.println();
		}
	}
}
