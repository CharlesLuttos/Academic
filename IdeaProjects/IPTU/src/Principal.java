import java.util.Scanner;

/**
 * Created by Fantoche on 10/08/17.
 */
public class Principal {
    public static void main(String[] args){
        System.out.println("Digite o valor do imovel");
        long valor = new Scanner(System.in).nextLong();
        System.out.printf("Selecione o tipo do imovel\n\n" +
                          "1.Residencial\n" +
                          "2.Nao residencial\n" +
                          "3.Territorial\n\n");
        int opcao = new Scanner(System.in).nextInt();
        switch (opcao){
            case 1:
                System.out.printf("IPTU: %.2f",IPTU.residencial(valor));
                break;
            case 2:
                System.out.printf("IPTU: %.2f",IPTU.naoResidencial(valor));
                break;
            case 3:
                System.out.printf("IPTU: %.2f",IPTU.territorial(valor));
                break;
        }
    }
}
