/**
 * Created by Fantoche on 18/08/17.
 */
public class FuncionarioHorario extends Funcionario {
    double valor_hora, qtd_horas;

    public FuncionarioHorario(){
        super();
    }

    public FuncionarioHorario(String cpf, String nome, int idade, double valor_hora, double qtd_horas){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.valor_hora = valor_hora;
        this.qtd_horas = qtd_horas;
    }

    @Override
    public double getSalario() {
        salario = valor_hora * qtd_horas;
        return salario;
    }

    @Override
    public String toString(){
        return " "+cpf+" - "+nome+", "+idade+" : "+getSalario()+" (FH)";
    }
}
