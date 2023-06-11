package Unit_6.B;

public class q2 {
    public static void searchHighest(String students[], double grades[]) {
        int highestIndex = 0;
        double highesGrade = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > highesGrade) {
                highesGrade = grades[i];
                highestIndex = i;
            }
        }
        System.out.println(
                String.format("%s got the highest grades of the class: %s", students[highestIndex],
                        grades[highestIndex]));
        // System.out.println(highestIndex);
    }

    public static double average(String students[], double grades[]) {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

}
