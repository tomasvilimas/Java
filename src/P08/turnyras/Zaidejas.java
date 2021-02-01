package P08.turnyras;

public abstract class Zaidejas {

    static private int counter;

    private  int number;





    abstract public String vardas();

    abstract public String laimetojas();

    public Zaidejas() {
        number=++counter;
    }

    public  int getNumber() {
        return number;
    }
}
