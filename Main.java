import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Racer racer1 = new Racer("Bob", 3.6f, 2.7f);
        Racer racer2;

        Scanner scan = new Scanner(System.in);
        String name = "John";
        System.out.print("Input Time 1: ");
        float time1 = scan.nextFloat();
        System.out.print("Input Time 2: ");
        float time2 = scan.nextFloat();
        racer2 = new Racer(name, time1, time2);

        if(racer2.getFastestTime() < racer1.getFastestTime()) {
            System.out.println("WINNER! " + racer2.toString());
        } else if(racer2.getFastestTime() > racer1.getFastestTime()) {
            System.out.println("WINNER! " + racer1.toString());
        } else {
            System.out.println("DRAW! " + racer1.toString() + racer2.toString());
        }
    }

    public static RacerStats fastestOfAllTimes(RacerStats[] stats) {
        float[] fastestTimes = new float[stats.length];
        for(int i = 0; i < stats.length; i++) {
            fastestTimes[i] = stats[i].fastestTime();
        }

        int fastestRacer = 0;
        float fastestTime = fastestTimes[0];
        for(int i = 1; i < fastestTimes.length; i++) {
            if(fastestTimes[i] < fastestTime) {
                fastestRacer = i;
                fastestTime = fastestTimes[i];
            }
        }

        return stats[fastestRacer];
    }

    public static float secondFastestOfAllTimes(float... times) throws IncompleteTimes {
        if(times.length < 2) {
            throw new IncompleteTimes("Input 2 or more times.");
        } else {
            Arrays.sort(times);
            return times[1];
        }
    }
}