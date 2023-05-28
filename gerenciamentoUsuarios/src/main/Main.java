/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Model.Cliente;
import Model.Gerente;
import Model.Vendedor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author WTNUNES
 */
public class Main {

    static List<Cliente> clientes = new ArrayList();
    static List<Vendedor> vendedores = new ArrayList();
    static List<Gerente> gerentes = new ArrayList();
    static Service service = new Service();

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int valor = 1;
        do {
            System.out.println("-------Menu de ações-------\n"
                    + " 1 - Cadastrar Cliente       \n"
                    + " 2 - Cadastrar Vendedor      \n"
                    + " 3 - Cadastrar Gerente          \n"
                    + " 4 - Listar Clientes         \n"
                    + " 5 - Listar Vendedores       \n"
                    + " 6 - Listar Gerentes         \n"
                    + " 0 - Sair                    \n");

            System.out.println("Selecione uma ação:");
            valor = scan.nextInt();
            switch (valor) {
                case 1:
                    Cliente c = new Cliente();
                    c = service.cadastroCliente();
                    if (clientes.add(c)) {
                        System.out.println("Cliente cadastrado com Sucesso!");
                    }
                    break;
                case 2:
                    Vendedor v = new Vendedor();
                    v = service.cadastroVendedor();
                    if (vendedores.add(v)) {
                        System.out.println("Vendedor cadastrado com Sucesso!");
                    }
                    break;
                case 3:
                    Gerente g = new Gerente();
                    g = service.cadastroGerente();
                    if (gerentes.add(g)) {
                        System.out.println("Gerente cadastrado com Sucesso!");
                    }
                    break;
                case 4:
                    Listar(clientes);
                    break;
                case 5:
                    Listar(vendedores);
                    break;
                case 6:
                    Listar(gerentes);
                    break;
                default:
                    break;
            }

        } while (valor != 0);
    }

    static public void Listar(List pessoas) {

        if (pessoas.isEmpty()) {
            System.out.println("Não há nenhum registro!!");
        } else {
            pessoas.forEach(p -> {
                System.out.println(p.toString());
            });
        }
    }
}
