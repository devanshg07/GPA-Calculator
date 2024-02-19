import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
        
        double GPAScale = getScale();
        int markCount = getMarkCount();
        int[] markList = getMarks(markCount);
        double average = getAverage(markList);
        double GPA = getGPA(average, GPAScale);

        System.out.println("Average: " + average + "\n" + "GPA: " + Math.round(GPA * 100) / 100.0);

        }
    }

    public static double getScale() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the GPA Scale: ");
        double GPAScale = scanner.nextDouble();

        return GPAScale;
    }

    public static int getMarkCount() {
        Scanner scanner = new Scanner(System.in);

        int markCount = 0;

        System.out.print("Enter number of marks you want to add: ");
        markCount = scanner.nextInt();

        return markCount;
    }

    public static int[] getMarks(int markCount) {
        Scanner scanner = new Scanner(System.in);

        int[] markList = new int[markCount];

        for (int i = 0; i < markCount; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            markList[i] = scanner.nextInt();
        }

        return markList;
    }

    public static double getAverage(int[] markList) {
        int sum = 0;

        for (int mark : markList) {
            sum += mark;
        }

        double average = (double) sum / markList.length;
        return average;
    }

    public static double getGPA(double average, double GPAScale) {
        double divNum = 100 / GPAScale;
        double GPA = average / divNum;
        return GPA;
    }
}
