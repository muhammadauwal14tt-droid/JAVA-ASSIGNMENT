public class Question13 {
    public static void main(String[] args) {
        int[] scores = {75, 80, 65, 90, 55, 85, 70, 60, 95, 50};
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        double average = (double) sum / scores.length;
        int aboveAverage = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                aboveAverage++;
            }
        }
        System.out.println("Class Average: " + average);
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);
        System.out.println("Students Above Average: " + aboveAverage);
    }
}
