package practica02;

/**
 * COMÉNTAME...
 * @author Leonardo Gallo
 * @param <T> debe ser un tipo de dato Operable
 */
public interface Matriz<T> {
 
    /**
     * COMÉNTAME... 
     * @param m
     * @return 
     */
    Matriz<T> sumaMatriz(Matriz<T> m);
    
    /**
     * COMÉNTAME... 
     * @param m
     * @return 
     */
    Matriz<T> restaMatriz(Matriz<T> m);
    
    /**
     * COMÉNTAME... 
     * @param m
     * @return 
     */
    Matriz<T> multiplicaMatriz(Matriz<T> m);
    
    /**
     * COMÉNTAME... 
     * @param escalar
     * @return 
     */
    Matriz<T> multiplicaMatriz(T escalar);
    
    /**
     * COMÉNTAME... 
     * @param renglon
     * @param columna
     * @return un elemento de tipo T en la posición (renglon, columna)
     * @throws IndexOutOfBoundsException es lanzada cuando la posición está fuera de la dimención de la matriz.
     */
    T getElemento(int renglon, int columna) throws IndexOutOfBoundsException;
    
    /**
     * COMÉNTAME... 
     * @param renglon
     * @param columna
     * @throws IndexOutOfBoundsException 
     */
    void setElemento(int renglon, int columna)throws IndexOutOfBoundsException;

    /**
     * COMÉNTAME...
     * @return 
     */
    int getRenglones();
    
    /**
     * COMÉNTAME... 
     * @return 
     */
    int getColumnas();
}
