import java.util.Scanner;

public class WaterLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The water level is:");

        double waterLevel = sc.nextDouble();

        String currentWlevel = (waterLevel >= 1000)
            ? "WARNING: The water level has reached 1000 or more"
            : "STATUS: NORMAL";

        System.out.println("The condition is: " + currentWlevel);
    }
}
