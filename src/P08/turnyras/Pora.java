package P08.turnyras;

public class Pora extends Zaidejas {

private Zaidejas a;
private Zaidejas b;

    public Pora(Zaidejas a, Zaidejas b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String vardas() {
        return a.laimetojas() +" - "+ b.laimetojas();
    }

    @Override
    public String laimetojas() {
        return this.getNumber() + "laimetojas";
    }
}
