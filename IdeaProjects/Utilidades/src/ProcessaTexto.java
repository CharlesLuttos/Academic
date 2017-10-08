
public class ProcessaTexto {
    public static int valoresMaisDigitados(String[] lista){
        int n[] = {0,0,0,0,0,0,0,0,0,0};
        int primeiro = 0;
        for (String x:lista){
            if (x.contains("0"))
                n[0]++;
            if (x.contains("1"))
                n[1]++;
            if (x.contains("2"))
                n[2]++;
            if (x.contains("3"))
                n[3]++;
            if (x.contains("4"))
                n[4]++;
            if (x.contains("5"))
                n[5]++;
            if (x.contains("6"))
                n[6]++;
            if (x.contains("7"))
                n[7]++;
            if (x.contains("8"))
                n[8]++;
            if (x.contains("9"))
                n[9]++;
        }
        System.out.printf("Número 0: %d, " +
                          "Número 1: %d, " +
                          "Número 2: %d, " +
                          "Número 3: %d, " +
                          "Número 4: %d, " +
                          "Número 5: %d, " +
                          "Número 6: %d, " +
                          "Número 7: %d, " +
                          "Número 8: %d, " +
                          "Número 9: %d\n",
                           n[0],
                           n[1],
                           n[2],
                           n[3],
                           n[4],
                           n[5],
                           n[6],
                           n[7],
                           n[8],
                           n[9]);
        for (int i =0; i<=9 ; i++){
            if (n[i] > primeiro)
                primeiro = i;
        }
        return primeiro;
    }
}
