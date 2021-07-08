package practica01;

/**
 * Clase Main para probar métodos sobre secuencias de enteros
 * @author Leonardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {-2, 11, -4, 13, -5, -2};
        // La subsecuencia de suma maxima es: {11, -4, 13} = 20
        //int a[] = {-1,3,-6};
        int maxSum;
        SecuenciaDeEnteros secuencia = new SecuenciaDeEnteros();
        
        maxSum = secuencia.getMaxSum1(a);        
        System.out.println( "La suma máxima para getMaxSum1 es: " + maxSum );
        
        maxSum = secuencia.getMaxSum2(a);
        System.out.println( "La suma máxima para getMaxSum2 es: " + maxSum );
        
        maxSum = secuencia.getMaxSum3(a);
        System.out.println( "La suma máxima para getMaxSum3 es: " + maxSum );
        
        maxSum = secuencia.getMaxSumRec(a);
        System.out.println( "La suma máxima para getMaxSumRec es: " + maxSum );
    }   
}
