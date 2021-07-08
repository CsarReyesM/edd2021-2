package practica01;

/**
 * Clase que implementa 4 métodos distintos para resolver un mismo problema.
 * @author Leonardo Gallo
 */
public class SecuenciaDeEnteros {

    /**
     * Primer algoritmo para encontrar la suma de la subsecuencia de suma maxima.
     * @param secuencia Es un arreglo que contiene una secuencia de enteros.
     * @return maxSum, regresa la suma máxima
     */
    public int getMaxSum1(int[] secuencia) {
        int maxSum = 0;
        int sumAct;

        for (int i = 0; i < secuencia.length; i++) {
            for (int j = i; j < secuencia.length; j++) {
                sumAct = 0;
                for (int k = i; k <= j; k++) {
                    sumAct += secuencia[k];
//                    System.out.println("Suma parcial: " + sumAct);
                }
                if (sumAct > maxSum) {
                    maxSum = sumAct;
                }
            }
        }
        return maxSum;
    }

    /**
     * Segundo algoritmo para encontrar la suma de la subsecuencia de suma maxima.
     * @param secuencia Es un arreglo que contiene una secuencia de enteros.
     * @return maxSum, regresa la suma máxima
     */
    public int getMaxSum2(int[] secuencia) {
        int maxSum = 0;
        int sumAct;

        for (int i = 0; i < secuencia.length; i++) {
            sumAct = 0;
            for (int j = i; j < secuencia.length; j++) {
                sumAct += secuencia[j];
//                System.out.println("Suma parcial: " + sumAct);
                if (sumAct > maxSum) {
                    maxSum = sumAct;
//                    System.out.println(i + " "+ j);
                }
            }
        }
        return maxSum;
    }

    /**
     * Tercer algoritmo para encontrar la suma de la subsecuencia de suma maxima.
     * @param secuencia Es un arreglo que contiene una secuencia de enteros.
     * @return maxSum, regresa la suma máxima
     */
    public int getMaxSum3(int[] secuencia) {
        int maxSum = 0;
        int sumAct = 0;

        for (int j = 0; j < secuencia.length; j++) {
            sumAct += secuencia[j];
            if (sumAct > maxSum) {
                maxSum = sumAct;
//                System.out.println("Suma parcial: " + sumAct);
            } else if (sumAct < 0) {
                sumAct = 0;
            }
        }
        return maxSum;
    }

    /**
     * Cuarto algoritmo para encontrar la suma de la subsecuencia de suma maxima.
     * @param secuencia Es un arreglo que contiene una secuencia de enteros.
     * @return maxSum, regresa la suma máxima
     */
    public int getMaxSumRec(int[] secuencia) {
        int maxSum = 0;
        int sumAct = 0;
        int sumRec;

        if (secuencia.length == 1)
            return secuencia[0] > 0? secuencia[0]: 0;

        for (int i = 0; i < secuencia.length; i++) {
            sumAct += secuencia[i];
//            System.out.println("Suma actual en la iteración " + i + " " + sumAct);
            if (sumAct > maxSum && sumAct > 0)
                maxSum = sumAct;
        }

        sumRec = getMaxSumRec(getSubArray(1, secuencia));
        
        if (sumRec > maxSum)
            maxSum = sumRec;
//        System.out.println("Suma máxima calculada hasta el momento : " + maxSum);
//        System.out.println("Suma de la llamada recursiva : " + sumRec);
        return maxSum;
    }

    /**
     * Genera un subarreglo de enteros de longitud secuencia.length - n
     * @param n
     * @param secuencia Es un arreglo que contiene una secuencia de enteros.
     * @return
     */
    public int[] getSubArray(int n, int[] secuencia) {
        int[] temp;
        if (n < secuencia.length)
            temp = new int[secuencia.length - n];
        else
            return null;
            
        for (int i = n; i < secuencia.length; i++)
            temp[i - n] = secuencia[i];
        
        return temp;
    }
}
