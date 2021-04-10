package ProvaPOO;
public class Funcionario extends Pessoa {

    private int matricula;
    private double salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws Exception {
        if (salario <= 0){
            salario = 0;
        }
        this.salario = salario;
    }
    public double getprimParcela(){
        return this.salario = (salario / 100) * 60;
    }
    public double getsegParcela(){
        return this.salario = (salario /100) *40;
    }
    public Funcionario(){

    }

    public Funcionario(int matricula, double salario) {
        if (salario <= 0){
            salario = 0;
        }
        this.matricula = matricula;
        this.salario = salario;
    }

    public Funcionario(String nome, String sobrenome, int matricula, double salario){
        super ( nome, sobrenome );
        if (salario <= 0){
            salario = 0;
        }
        this.matricula = matricula;
        this.salario = salario;
    }
}


