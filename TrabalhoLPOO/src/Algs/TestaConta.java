package Algs;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marcos
 */
public class TestaConta {

    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public static ArrayList<Conta> contas = new ArrayList<Conta>();
    public static Scanner pSc = new Scanner(System.in);

    public static void listaClientes() {
        System.out.println("|\tID\t|\tNome\t|\tCPF\t|");

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("|\t" + clientes.get(i).getId() + "\t|\t" + clientes.get(i).getNome() + "\t|\t" + clientes.get(i).getCpf() + "\t|\t");
        }
    }

    public static int vinculaContaC(String cpf) {
        System.out.print("\nInforme o limite de valor da conta: ");
        double limite = pSc.nextDouble();
        pSc.nextLine();
        System.out.print("\nInforme o valor do depósito inicial para conta: ");
        double dInicial = pSc.nextDouble();
        pSc.nextLine();
        ContaCorrente cc = new ContaCorrente(limite, dInicial, cpf);
        contas.add(cc);
        return (contas.size() - 1);
    }

    public static int vinculaContaI(String cpf) {
        System.out.print("\nInforme o valor de depósito mínimo da conta: ");
        double dMin = pSc.nextDouble();
        pSc.nextLine();
        System.out.print("\nInforme o valor o montante mínimo que a conta pode ter: ");
        double mMin = pSc.nextDouble();
        pSc.nextLine();
        System.out.print("\nInforme o valor do depósito inicial para conta: ");
        double dInicial = pSc.nextDouble();
        pSc.nextLine();
        ContaInvestimento ci = new ContaInvestimento(dMin, mMin, dInicial, cpf);
        contas.add(ci);
        return (contas.size() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        boolean exit = false;

        do {
            System.out.println("\nEscolha uma opção:"
                    + "\n1 - Cadastrar cliente"
                    + "\n2 - Vincular cliente a conta"
                    + "\n3 - Listar clientes"
                    + "\n4 - Sair");

            opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 1:
                    System.out.print("\nInforme os atributos do cliente:"
                            + "\nNome: ");
                    String nome = sc.nextLine();
                    System.out.print("Sobrenome: ");
                    String sNome = sc.nextLine();
                    System.out.print("RG: ");
                    String rg = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Endereço: ");
                    String end = sc.nextLine();
                    System.out.print("Renda: ");
                    double renda = sc.nextDouble();
                    sc.nextLine();
                    Cliente c = new Cliente(nome, sNome, rg, cpf, end, renda);
                    clientes.add(c);
                    break;
                case 2:
                    TestaConta.listaClientes();
                    System.out.print("\nInforme o ID do cliente para vincular a uma conta: ");
                    int id = sc.nextInt();
                    if (clientes.get((id - 5500)).getHaveConta()) {
                        System.out.println("\nO cliente selecionado já possui conta vinculada!");
                    } else {
                        System.out.println("\nInforme o tipo de conta que deseja vincular ao cliente: "
                                + "\n1 - Conta Corrente"
                                + "\n2 - Conta Investimento");
                    }
                    int o = sc.nextInt();
                    sc.nextLine();
                    if (o == 1) {
                        int cc = TestaConta.vinculaContaC(clientes.get((id - 5500)).getCpf());
                        clientes.get((id - 5500)).setIdConta(cc);
                    } else if (o == 2) {
                        int ci = TestaConta.vinculaContaI(clientes.get((id - 5500)).getCpf());
                        clientes.get((id - 5500)).setIdConta(ci);
                    }
                    break;
                case 3:
                    TestaConta.listaClientes();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        } while (!exit);

    }

}
