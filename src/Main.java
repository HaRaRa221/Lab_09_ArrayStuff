import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int [] dataPoints = new int [100];

        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        int sum = 0;
        double ave = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        System.out.println("\nThe sum of values is " + sum);
        ave = (double) sum / dataPoints.length;
        System.out.printf("The average of the random array dataPoints is: %5.2f", ave);
        System.out.println("The average is: " + sum / dataPoints.length);

        double linearScan= SafeInput.getRangedInt(in,"Enter an int: ", 1, 100);

        int count = 0;
        for(int i = 0; i < dataPoints.length; i++) {
            if(dataPoints[i] == linearScan){
                count++;
            }
        }
        System.out.println(linearScan + " was found " + count + " times. ");

        System.out.println("Enter the number you want to input: ");
        int input = in.nextInt();

        for(int i = 0; i < dataPoints.length; i++) {
            count++;
            if(dataPoints[i] == input)
            {
                count = count - 1;
                System.out.println(" Value " + input + " was found at array index position " + count);
                break;
            }
        }
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) // New MIN!
                min = dataPoints[i]; //so save it
            if (dataPoints[i] > max) // New MAX!
                max = dataPoints[i]; //so save it
        }
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);

        System.out.println(" Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[])
    {
        int sum = 0;
        double ave = 0;
        for(int r = 0; r < values.length; r++)
        {
            sum+= values[r];
        }
        ave = sum / values.length;
        return ave;
    }

}