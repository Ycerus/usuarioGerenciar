package main;

/**
 *
 * @author tomnu
 */
import Model.Cliente;
import Model.Endereco;
import Model.Gerente;
import Model.Vendedor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    static List<Cliente> clientes = new ArrayList();
    static List<Vendedor> vendedores = new ArrayList();
    static List<Gerente> gerentes = new ArrayList();
    static Scanner scan = new Scanner(System.in);

    
    public Cliente cadastroCliente(){
        Cliente c = new Cliente();
        Endereco e = new Endereco();
        
        System.out.println("Insira o nome do Cliente:");
        c.setNome(scan.next());
        
        System.out.println("Insira o Cpf do Cliente:");
        c.setCpf(scan.next());
        
        System.out.println("Insira o E-mail do Cliente:");
        c.setEmail(scan.next());
        
        System.out.println("Insira a cidade em que mora:");
        e.setCidade(scan.next());
        
        System.out.println("Insira o nome da Rua");
        e.setRua(scan.next());
        
        System.out.println("Insira o numero do endereço:");
        e.setNumero(scan.nextInt());
        
        System.out.println("Insira o Limite de Credito:");
        c.setLimiteCredito(scan.nextInt());
        
        System.out.println("Insira o Login do Cliente:");
        c.setLogin(scan.next());
        
        System.out.println("Insira a Senha do Cliente:");
        c.setSenha(scan.next());
        
         c.setEndereco(e);
        return c;
    }
    
    
}
