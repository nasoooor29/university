package Unit_6.D;

public class q2 {
    public static int findFirst(int[] vector, int value) {

        int i = 0;
        while (i < vector.length) { // loop over the values in the vector
            if (vector[i] == value) {
                return i; // return the index of the value if it is found in the loop
            }
            i++;
        }
        return -1; // return -1 if it was not found in the loop
    }
}
