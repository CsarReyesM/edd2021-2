package practica02;

/**
 * COMÉNTAME...
 * @author Leonardo Gallo
 */
public abstract class Operable {

    /**
     * COMÉNTAME... 
     * @param op
     * @return 
     */
    public abstract Operable suma(Operable op);
    
    /**
     * COMÉNTAME... 
     * @param op
     * @return 
     */
    public abstract Operable resta(Operable op);
    
    /**
     * COMÉNTAME... 
     * @param op
     * @return 
     */
    public abstract Operable multiplica(Operable op); 
    
    /**
     * COMÉNTAME... 
     * @param op
     * @return 
     */
    public abstract Operable divide(Operable op);

}