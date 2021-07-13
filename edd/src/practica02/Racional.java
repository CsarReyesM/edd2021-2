package practica02;

/**
 * COMÉNTAME
 * @author leonardo.gallo
 * @since 12/07/2021
 */
public class Racional extends Operable {
    
    private final double r;
    
    /**
     * Constructor
     * @param r 
     */
    public Racional(double r) {
        this.r = r;
    }

    @Override
    public Operable suma(Operable op) {
        return new Racional(this.r + ((Racional) op).r);
    }

    @Override
    public Operable resta(Operable op) {
        return new Racional(this.r - ((Racional) op).r);
    }

    @Override
    public Operable multiplica(Operable op) {
        return new Racional(this.r * ((Racional)op).r);
    }

    @Override
    public Operable divide(Operable op) {
        return new Racional(this.r / ((Racional)op).r);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Racional )
            return this.r ==((Racional) o).r;
        return false;
    }    
    
    @Override
    public String toString() {
        return r + "";
    }
            
}
