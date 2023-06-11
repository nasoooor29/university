package Unit_8.C;

public class q1 {
    public static void main(String[] args) {
        int speed = 12, duration = 30;
        System.out.println("Distance travelled in " + duration + "min at " + speed + "km/h is: "
                + distanceTravelled(speed, duration) + "km.");
        // Distance travelled in 30min at 12km/h is: 6km.
        double rate = (1 / 60);
        System.out.println(rate);

    }

    private static int distanceTravelled(int speed, int durationInMinutes) {
        return Math.round((1 / 60) * durationInMinutes * speed);
    }

}