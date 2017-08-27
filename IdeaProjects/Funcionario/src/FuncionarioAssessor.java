/**
 * Created by Fantoche on 18/08/17.
 */
public class FuncionarioAssessor extends Funcionario {



    public FuncionarioAssessor(){
        super();
    }

    public FuncionarioAssessor(String cpf, String nome, int idade){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public String toString(){
        return " "+cpf+" - "+nome+", "+idade+" : "+getSalario()+" (F)";
    }
}
