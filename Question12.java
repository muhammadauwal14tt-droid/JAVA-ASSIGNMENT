public class Question12 {
    public static void main(String[] args) {
        int score = 75;
        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Score must be between 0 and 100.");
        } else {
            switch (score / 10) {
                case 1:
                    System.out.println("Grade: A");
                    break;
                case 2:
                    System.out.println("Grade: B");
                    break;
                case 3:
                    System.out.println("Grade: C");
                    break;
                case 4:
                    System.out.println("Grade: D");
                    break;
                default:
                    System.out.println("Grade: F");
            }
        }
    }
}
