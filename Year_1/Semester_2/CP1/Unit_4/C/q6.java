package Unit_4.C;

public class q6 {
    public static void main(String[] args) {
        getDecadeBorn(88);
    }

    public static void getDecadeBorn(int num) {

        int maa = num / 10 % 10;
        System.out.println(String.format("You were born in the %dth decade of the century.", maa + 1));

    }
}
