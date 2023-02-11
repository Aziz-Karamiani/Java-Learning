public class TernaryOperator {
    public static void main(String[] args) {
        // Check firstName is even Or odd length
        String oddOrEven = getFirstNameLength("Aziz Karamiani");
        System.out.println(oddOrEven);
    }

    public static String getFirstNameLength(String fullName) {
        String firstName = fullName.split(" ")[0];
        return firstName.length() % 2 == 0 ? "Even" : "Odd";
    }
}
