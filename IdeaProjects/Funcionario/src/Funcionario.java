/**
 * Created by Fantoche on 18/08/17.
 */
public abstract class Funcionario {
    String cpf, nome;
    int idade;
    double salario = 2000;

    public abstract double getSalario();
    public abstract String toString();

    public Boolean equals(Funcionario funcionario){
        return this.cpf.equals(funcionario.cpf);
    }
}
