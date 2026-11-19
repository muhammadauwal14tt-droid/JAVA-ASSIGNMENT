public class Question11 {
    public static void main(String[] args) {
        String name = "Ibrahim Bashiru Musa";
        int age = 24;
        int score1 = 75;
        int score2 = 80;
        int score3 = 70;
        double average = (score1 + score2 + score3) / 3;
        System.out.printf("Student Name: %s%n", name);
        System.out.printf("Student Age: %d%n", age);
        System.out.printf("First Score: %d%n", score1);
        System.out.printf("Second Score: %d%n", score2);
        System.out.printf("Third Score: %d%n", score3);
        System.out.printf("Average Score: %.2f%n", average);
    }
}