package main;

/**
 *
 * @author tomnu
 */
import Model.Cliente;
import Model.Endereco;
import Model.Gerente;
import Model.Vendedor;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

public class Service {

    static Scanner scan = new Scanner(System.in);

    public Cliente cadastroCliente() {
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

    public Vendedor cadastroVendedor() {
        Vendedor v = new Vendedor();

        System.out.println("Insira o nome do vendedor:");
        v.setNome(scan.next());

        System.out.println("Insira o Cpf do vendedor:");
        v.setCpf(scan.next());

        System.out.println("Insira o E-mail do vendedor:");
        v.setEmail(scan.next());

        System.out.println("Insira o ctps do vendedor:");
        v.setCtps(scan.next());

        System.out.println("Insira a data de admissão:");
        String dataAdmissaoStr = scan.next();
        LocalDate dataAdmissao = LocalDate.parse(dataAdmissaoStr);
        v.setDataAdmissao(dataAdmissao);

        System.out.println("Insira o Login do vendedor:");
        v.setLogin(scan.next());

        System.out.println("Insira a Senha do vendedor:");
        v.setSenha(scan.next());

        System.out.println("Insira o salario:");
        Double salario = scan.nextDouble();
        v.setSalario(calculaSalario(dataAdmissao, salario));

        //*******************ENDERECO****************************
        Endereco e = new Endereco();

        System.out.println("Insira a cidade em que mora:");
        e.setCidade(scan.next());

        System.out.println("Insira o nome da Rua");
        e.setRua(scan.next());

        System.out.println("Insira o numero do endereço:");
        e.setNumero(scan.nextInt());

        v.setEndereco(e);

        return v;
    }
    
    public Gerente cadastroGerente(){
        Gerente g = new Gerente();

        System.out.println("Insira o nome do Gerente:");
        g.setNome(scan.next());

        System.out.println("Insira o Cpf do Gerente:");
        g.setCpf(scan.next());

        System.out.println("Insira o E-mail do Gerente:");
        g.setEmail(scan.next());

        System.out.println("Insira o ctps do Gerente:");
        g.setCtps(scan.next());
        
        System.out.println("Insira o Departamento:");
        g.setDepartamento(scan.next());
        
        System.out.println("Insira a data de admissão:");
        String dataAdmissaoStr = scan.next();
        LocalDate dataAdmissao = LocalDate.parse(dataAdmissaoStr);
        g.setDataAdmissao(dataAdmissao);

        System.out.println("Insira o Login do Gerente:");
        g.setLogin(scan.next());

        System.out.println("Insira a Senha do Gerente:");
        g.setSenha(scan.next());
        
        System.out.println("Insira o Valor do Bonus");
        Double bonusSalarial = scan.nextDouble();
        
        System.out.println("Insira o salario:");
        Double salario = scan.nextDouble();
        g.setSalario(calculaSalario(dataAdmissao, salario, bonusSalarial));

        //*******************ENDERECO****************************
        Endereco e = new Endereco();

        System.out.println("Insira a cidade em que mora:");
        e.setCidade(scan.next());

        System.out.println("Insira o nome da Rua");
        e.setRua(scan.next());

        System.out.println("Insira o numero do endereço:");
        e.setNumero(scan.nextInt());

        g.setEndereco(e);

        return g;
    }

    public Double calculaSalario(LocalDate dataAdmissao, Double salario) {
        LocalDate dataAtual = LocalDate.now();
        int anosEmpresa = Period.between(dataAdmissao, dataAtual).getYears();

        double bonus = (anosEmpresa * 0.01);

        double salarioBonus = (salario * bonus);

        double novoSalario = (salario + salarioBonus);

        return novoSalario;
    }

    public Double calculaSalario(LocalDate dataAdmissao, Double salario, Double bonus) {
        LocalDate dataAtual = LocalDate.now();
        int anosEmpresa = Period.between(dataAdmissao, dataAtual).getYears();

        double calculoBonus = (anosEmpresa * 0.01);

        double salarioBonus = (salario * calculoBonus);

        double novoSalario = (salario + salarioBonus + bonus);

        return novoSalario;
    }
    
}
