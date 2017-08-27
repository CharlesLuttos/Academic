/**
 * Created by Fantoche on 09/08/17.
 */
public class IPTU {
    static double iptu = 0.0;

    /**
     * Metodo para calcular o IPTU de um imovel do tipo residencial
     * @param valor valor de mercado do imovel
     * @return IPTU do imovel
     */
    public static double residencial(long valor){
        iptu = 0;
        /**
         * Aliquota 0,60%
         */
        if (valor > 95450){
            valor -= 95450;
            iptu += 0.006*95450;
        }else{
            iptu += 0.006*valor;
            return iptu;
        }
        /**
         * Aliquota 0,70%
         */
        if(valor > 143176){
            valor -= 143176;
            iptu += 0.007*143176;
        }else{
            iptu += 0.007*valor;
            return iptu;
        }
        /**
         * Aliquota 0,75%
         */
        if(valor > 178970){
            valor -= 178970;
            iptu += 0.0075*178970;
        }else{
            iptu += 0.0075*valor;
            return iptu;
        }
        /**
         * Aliquota 0,80%
         */
        if(valor > 298283){
            valor -= 298283;
            iptu += 0.008*298283;
        }else{
            iptu += 0.008*valor;
            return iptu;
        }
        /**
         * Aliquota 0,85%
         */
        if(valor > 238626){
            valor -= 238626;
            iptu += 0.0085*238626;
        }else{
            iptu += 0.0085*238626;
            return iptu;
        }
        /**
         * Aliquota 0,90%
         */
        if(valor > 238626){
            valor -= 238626;
            iptu += 0.009*238626;
        }else{
            iptu += 0.009*238626;
            return iptu;
        }
        /**
         * Aliquota 1,00%
         */
        if(valor != 0 && valor < 999999999999.0)
            iptu += valor * 0.01;

        return iptu;
    }

    /**
     * Metodo para calcular o IPTU de um imovel nao residencial
     * @param valor valor de mercado do imovel
     * @return IPTU do imovel
     */
    public static double naoResidencial(long valor){
        iptu = 0;
        /**
         * Aliquota 1,20%
         */
        if (valor > 35793) {
            valor -= 35793;
            iptu += 0.0120 * 35793;
        } else {
            iptu += 0.0120 * valor;
            return iptu;
        }
        /**
         * Aliquota 1,30%
         */
        if (valor > 83520) {
            valor -= 83520;
            iptu += 0.0130 * 83520;
        } else {
            iptu += 0.0130 * valor;
            return iptu;
        }
        /**
         * Aliquota 1,40%
         */
        if (valor > 477252) {
            valor -= 477252;
            iptu += 0.0140 * 477252;
        } else {
            iptu += 0.0140 * valor;
            return iptu;
        }
        /**
         * Aliquota 1,50%
         */
        if (valor > 596566) {
            valor -= 596566;
            iptu += 0.0150 * 596566;
        } else {
            iptu += 0.0150 * valor;
            return iptu;
        }
        /**
         * Aliquota 1,60%
         */
        if(valor != 0 && valor < 999999999999.0)
            iptu += valor * 0.0160;
        return iptu;
    }

    /**
     * Metodo para calcular o IPTU de um imovel territorial
     * @param valor valor de mercado do imovel
     * @return IPTU do imovel
     */
    public static double territorial(long valor){
        iptu = 0;
        /**
         * Aliquota 1,00%
         */
        if (valor > 47724) {
            valor -= 47724;
            iptu += 0.01 * 47724;
        } else {
            iptu += 0.01 * valor;
            return iptu;
        }
        /**
         * Aliquota 1,60%
         */
        if (valor > 310215) {
            valor -= 310215;
            iptu += 0.0160 * 310215;
        } else {
            iptu += 0.0160 * valor;
            return iptu;
        }
        /**
         * Aliquota 2,00%
         */
        if (valor > 357940) {
            valor -= 357940;
            iptu += 0.02 * 357940;
        } else {
            iptu += 0.02 * valor;
            return iptu;
        }
        /**
         * Aliquota 2,50%
         */
        if (valor > 477252) {
            valor -= 477252;
            iptu += 0.025 * 477252;
        } else {
            iptu += 0.025 * valor;
            return iptu;
        }
        if(valor != 0 && valor < 999999999999.0)
            iptu += valor * 0.03;
        return iptu;
    }
}
