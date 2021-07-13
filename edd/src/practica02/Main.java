package practica02;

/**
 *
 * @author leonardo.gallo
 */
public class Main {
    
    public static void main(String[] args) {
        Racional num = new Racional(4);
        //System.out.println(num);
        
        // Racional[renglones][columnas]
        Racional[][] matrizA = new Racional[2][3];
        matrizA[0][0] = new Racional(4);
        matrizA[0][1] = new Racional(1);
        matrizA[0][2] = new Racional(2);
        matrizA[1][0] = new Racional(3);
        matrizA[1][1] = new Racional(7);
        matrizA[1][2] = new Racional(1);
        
        Matriz<Racional> matriz = new MatrizAB<>(matrizA);
 
        System.out.println(matriz);
        
        // matriz suma
        System.out.println(matriz.sumaMatriz(matriz));
    }
    
}
