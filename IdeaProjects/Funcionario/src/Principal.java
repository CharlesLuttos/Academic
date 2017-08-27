import org.omg.CORBA.Object;

/**
 * Created by Fantoche on 18/08/17.
 */
public class Principal {
    public static void main(String[] args){
        Funcionario f = new FuncionarioAssessor("2345234","Andre",34);
        System.out.println(f.toString());

        FuncionarioHorario fh = new FuncionarioHorario("234523","marcos",30,30,7);
        System.out.println(fh.toString());

        FuncionarioChefe fc = new FuncionarioChefe("4353553","Julia",23,3455,234,f);
        System.out.println(fc.toString());
    }
}
