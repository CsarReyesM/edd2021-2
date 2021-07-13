package practica02;

/**
 * 
 * @author leonardo.gallo
 * @param <T> 
 */
public class MatrizAB<T extends Operable> implements Matriz<T> {

    /**
     * Matriz de objetos
     */
    private Object[][] matriz;
    
    /**
     * COMÉNTAME...
     * @param renglones
     * @param columnas
     */
    public MatrizAB(int renglones, int columnas) {
        matriz = new Object[renglones][columnas];
    }
    
    /**
     * COMÉNTAME...
     * @param matriz
     */
    public MatrizAB(T[][] matriz) {
        this.matriz = matriz;
    }
    
    @Override
    public Matriz<T> sumaMatriz(Matriz<T> m) {
        Operable[][] newMatriz = new Operable[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                newMatriz[i][j] = m.getElemento(i, j).suma((Operable) matriz[i][j]);
                //System.out.println(matriz[i][j]);
            }
        }
        return new MatrizAB(newMatriz);
    }

    @Override
    public Matriz<T> restaMatriz(Matriz<T> m) {
        return null;
    }

    @Override
    public Matriz<T> multiplicaMatriz(Matriz<T> m) {
        return null;
    }

    @Override
    public Matriz<T> multiplicaMatriz(T escalar) {
        return null;
    }

    @Override
    public T getElemento(int renglon, int columna) throws IndexOutOfBoundsException {
        return (T) matriz[renglon][columna];
    }

    @Override
    public void setElemento(int renglon, int columna) throws IndexOutOfBoundsException {
        return;
    }

    @Override
    public int getRenglones() {
        return 0;
    }

    @Override
    public int getColumnas() {
        return 0;
    }
    
    @Override
    public String toString() {
        String matrizStr = "";
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matrizStr += matriz[i][j] + " ";
                
            }
            matrizStr += "\n";
        }
        return matrizStr;
    }

}
