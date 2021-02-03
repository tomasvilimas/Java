package P06;

public class DaugLent {

    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 5; y++) {
                System.out.print("|" + printD(y) + "x" + printD(x) + "=" + printR(x * y) + "|" + "    ");
            }
            System.out.println();

        }
        System.out.println();

        for (int x = 1; x <= 10; x++) {
            for (int y = 6; y <= 10; y++) {
                System.out.print("|" + printD(y) + "x" + printD(x) + "=" + printR(x * y) + "|" + "    ");
            }
            System.out.println();

        }

    }

    static String printD(int d) {
        return (d < 10 ? " " : "") + d;
    }

    static String printR(int r) {
        return (r < 10 ? "  " : r < 100 ? " " : "") + r;
    }
}
