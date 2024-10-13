public class Fraction {
    private int numérateur;
    private int dénominateur;


    public Fraction(int numérateur, int dénominateur) {
        this.numérateur = numérateur;
        this.dénominateur = dénominateur;
    }

    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);

    
    public Fraction(int numérateur) {
        this(numérateur, 1);
    }

  
    public Fraction() {
        this(0, 1);
    }

    public int getNumérateur() {
        return numérateur;
    }


    public int getDénominateur() {
        return dénominateur;
    }

    public double doubleValue() {
        return (double) numérateur / dénominateur;
    }
    
    @Override
    public String toString() {
        return numérateur + "/" + dénominateur;
    }
}