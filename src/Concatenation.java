public class Concatenation {
    public static void main(String[] args) {
        String firstName = "Aziz";
        String lastName = "Karamiani";
        String fullName = String.format("Your FullName Is %s %s", firstName, lastName);
        System.out.println(fullName);

        System.out.println("Your FullName Is " + firstName + " " + lastName);
    }
}
