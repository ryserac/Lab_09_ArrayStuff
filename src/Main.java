import java.util.Random;
import java.util.Scanner;

public class Main {
    public static double getAverage(int values[]) {
        double sum = 0;
        for (int x = 0; x < values.length; x++) {
            sum += values[x];
        }
        return sum / values.length;
    }
    public static int min(int values[]) {
        int min = 0;
        for (int x = 0; x < values.length; x++) {
            if (min > values[x]) {
                min = values[x];
            }
        }
        return min;
    }
    public static int max(int values[]) {
        int max = 0;
        for (int x = 0; x < values.length; x++) {
            if (max < values[x]) {
                max = values[x];
            }
        }
        return max;
    }
    public static int occuranceScan(int values[], int target) {
        int count = 0;
        for (int x = 0; x < values.length; x++) {
            if (values[x] == target) {
                count++;
            }
        }
        return count;
    }
    public static int sum(int values[]) {
        int sum = 0;
        for (int x = 0; x < values.length; x++) {
            sum += values[x];
        }
        return sum;
    }
    public static boolean contains(int values[], int target) {
        boolean contains = false;
        for (int x = 0; x < values.length; x++) {
            if (values[x] == target) {
                contains = true;
            }
        }
        return contains;
    }
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int MAX_SIZE = 100;
        int[] dataPoints = new int[MAX_SIZE];
        int sum = 0;
        for (int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }
        for (int x = 0; x < dataPoints.length; x++) {
            System.out.printf(dataPoints[x] + " | ");
        }
        System.out.println();
        for (int x = 0; x < dataPoints.length; x++) {
            sum = sum + dataPoints[x];
        }
        int avg = sum / dataPoints.length;
        System.out.println("The sum of the random array is : " + sum);
        System.out.println("The average of the random array is : " + avg);

        int searchTarget = 0;
        searchTarget = SafeInput.getRangedInt(in, "\nEnter a value to search for", 1, 100);
        boolean found = false;
        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == searchTarget) {
                found = true;
                System.out.println("Found " + searchTarget + " at index " + x);
            }
        }
        if (!found) {
            System.out.println("Value " + searchTarget + " not found.");
        }

        searchTarget = SafeInput.getRangedInt(in, "\nEnter a value to search for", 1, 100);
        found = false;
        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == searchTarget) {
                found = true;
                System.out.println("Found " + searchTarget + " at index " + x);
                break;
            }
        }
        if (!found) {
            System.out.println("Value " + searchTarget + " not found.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int x = 0; x < dataPoints.length; x++) {
            if (min > dataPoints[x]) {
                min = dataPoints[x];
            }
            if (max < dataPoints[x]) {
                max = dataPoints[x];
            }
        }
        System.out.println("\n\nThe min is " + min + " and the max is " + max);
        System.out.println("\n\nAverage of dataPoints is : " + getAverage(dataPoints));
        System.out.println("\nMin of dataPoints is : " + min(dataPoints));
        System.out.println("\nMax of dataPoints is : " + max(dataPoints));
        System.out.println("\nTarget occurred in dataPoints " + occuranceScan(dataPoints, searchTarget) + " times.");
        System.out.println("\nSum of dataPoints is : " + sum(dataPoints));
        System.out.println("\n'Target occurred in dataPoints' is " + contains(dataPoints, searchTarget));
    }
}