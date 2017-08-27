/**
 * Created by Fantoche on 18/08/17.
 */
public class FuncionarioChefe extends Funcionario{
    double valor_inicial, gratificação;
    Funcionario funcionarioAssessor;

    public FuncionarioChefe(){
        super();
    }

    public FuncionarioChefe(String cpf, String nome, int idade, double valor_inicial, double gratificação, Funcionario funcionarioAssessor){
        this.cpf = cpf;
        this.nome = nome;
        this.valor_inicial = valor_inicial;
        this.gratificação = gratificação;
        this.funcionarioAssessor = funcionarioAssessor;
    }

    @Override
    public double getSalario() {
        salario = valor_inicial + gratificação;
        return salario;
    }

    @Override
    public String toString(){
        return " "+cpf+" - "+nome+", "+idade+" : "+getSalario()+" (FC) Acessor: "+funcionarioAssessor.nome;
    }
}
