package ProvaPOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Pessoa pessoa = new Pessoa("Lucas", "Oliveira");
       System.out.println(pessoa.getnomeCompleto());

       Funcionario funcionario = new Funcionario("Lucas", "Oliveira", 1, 1045 );

       Professor professor = new Professor("Fabricio","Valadares", 2, 9999);

        Scanner input = new Scanner(System.in);

       System.out.println(pessoa.getClass());
       System.out.println(funcionario.getClass());
       System.out.println(professor.getClass());
       System.out.println("O Salário do funcionário " + funcionario.getNome() + " é: " + funcionario.getSalario());
       System.out.println("A primeira parcela do salário do funcionário " + funcionario.getNome() + " é: " + funcionario.getprimParcela());
       System.out.println("A segunda parcela do salário do funcionário " + funcionario.getNome() + " é: " + funcionario.getsegParcela());
       System.out.println("O salário do Professor " + funcionario.getNome() + " é "  + professor.getSalario());
       System.out.println("A primeira parcela do salário do Professor " + funcionario.getNome() + " é: " + professor.getprimParcela());
       System.out.println("A segunda parcela do salário do Professor " + funcionario.getNome() + " é: " + professor.getsegParcela());
     }

}
