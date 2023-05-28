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
    static Service service;
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int valor = 1;
        do {
            System.out.println("-------Menu de ações-------\n"
                    + " 1 - Cadastrar Cliente       \n"
                    + " 2 - Cadastrar Vendedor       \n"
                    + " 3 - Editar Gerente          \n"
                    + " 4 - Listar Clientes          \n"
                    + " 5 - Listar Vendedores       \n"
                    + " 6 - Listar Gerentes       \n");

            System.out.println("Selecione uma ação:");
            valor = scan.nextInt();
            switch (valor) {
                case 1:
                    Cliente c = new Cliente();
                    c = service.cadastroCliente();
                    clientes.add(c);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;
            }

        } while (valor != 0);
    }
    
    
    
}
