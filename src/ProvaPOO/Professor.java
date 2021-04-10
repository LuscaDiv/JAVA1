package ProvaPOO;

public class Professor extends Funcionario{

    @Override
    public double getprimParcela() {
        return this.getSalario();
    }
    @Override
    public double getsegParcela() {
        return 0;
    }
    public Professor(){

    }

    public Professor(int matricula, double salario) {
        super(matricula, salario);
    }

    public Professor(String nome, String sobrenome, int matricula, double salario) {
        super(nome, sobrenome, matricula, salario);
    }
}
