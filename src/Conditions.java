public class Conditions {
    public static void main(String[] args) {
        // if statements
        int testScore = 65;
        if (testScore < 50) {
            System.out.println("You Failed The Test");
        } else if (testScore == 100){
            System.out.println("You Got The Best Score");
        } else {
            System.out.println("You Pass The Test.");
        }


        // switch statements
        switch (testScore) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.println(2);
                break;
        }

    }
}
