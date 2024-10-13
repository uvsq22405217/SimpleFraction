public class Fraction {
    private int numérateur;
    private int dénominateur;

    // Constructeur avec numérateur et dénominateur
    public Fraction(int numérateur, int dénominateur) {
        this.numérateur = numérateur;
        this.dénominateur = dénominateur;
    }

    // Constructeur avec juste le numérateur (dénominateur = 1)
    public Fraction(int numérateur) {
        this(numérateur, 1);
    }

    // Constructeur sans argument (numérateur = 0, dénominateur = 1)
    public Fraction() {
        this(0, 1);
    }
    
    @Override
    public String toString() {
        return numérateur + "/" + dénominateur;
    }
}