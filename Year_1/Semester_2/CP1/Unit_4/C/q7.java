package Unit_4.C;

public class q7 {
    public static void main(String[] args) {
        getDecadeBorn(1998);
    }

    public static void getDecadeBorn(int num) {

        int maa = (num / 10 % 10) + 1;
        // System.out.println(maa);
        if (maa == 1) {
            System.out.println(String.format("You were born in the %dst decade of the century.", maa));

        } else if (maa == 2) {
            System.out.println(String.format("You were born in the %dnd decade of the century.", maa));

        } else if (maa == 3) {
            System.out.println(String.format("You were born in the %drd decade of the century.", maa));

        } else {
            System.out.println(String.format("You were born in the %dth decade of the century.", maa));

        }

    }
}
