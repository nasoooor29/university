package Unit_4.C;

public class q5 {
    public static void main(String[] args) {
        getDecadeBorn("88");
    }

    public static void getDecadeBorn(String num) {
        if (num.length() == 2) {

            int maa = Character.getNumericValue(num.charAt(0));
            ;
            int dec = maa + 1;
            if (dec < 10) {
                System.out.println(String.format("You were born in the %dth decade of the century.", dec));
            } else {
                System.out.println(String.format("You were born in the :th decade of the century.", dec));
            }

        } else {
            System.out.println("incorrect input parameter.");
        }
    }
}
