package Unit_8.D;

public class q1testing {
    private static int[] stair(int range, char m) { // do not even bother to understand this method
        int[] arr = new int[range];
        int inc = 0;
        for (int i = 1; i <= range; i++) {
            boolean odd = (i % 2 != 0 ? true : false);
            if (m == 'o' ? odd : !odd) {
                arr[inc] = i;
                inc += 1;
            }
        }
        int[] arr2 = new int[inc];
        System.arraycopy(arr, 0, arr2, 0, inc);
        return arr2;
    }

    private static void printLine(int length, int num) { // printing line with the given int and the given length
        for (int i = 0; i < length; i++)
            System.out.print(num + " ");
        System.out.println();
    }

    private static void spacer(int spaceNum) {
        for (int i = 0; i < spaceNum; i++)
            System.out.print(" ");
    }

    private static void diamondPrint(int n) {
        if (n <= 0)
            System.exit(1);
        ;
        int[] odds = stair(n, 'o');
        int[] evens = stair(n, 'e');

        int evenInc = evens.length - 1;
        int increment = 1;
        for (int i = 0; i < odds.length; i++) { // print first half
            spacer(evenInc == -1 ? 0 : evens[evenInc]);
            printLine(odds[i], increment);
            evenInc--;
            increment++;
        }
        evenInc = 0;
        for (int i = odds.length - 2; i >= 0; i--) { // print second half
            spacer(evenInc == odds.length - 1 ? 0 : evens[evenInc]);
            printLine(odds[i], increment);
            evenInc++;
            increment++;
        }
    }

    public static void main(String[] args) {
        int n = 9;
        diamondPrint(n);
    }

}
