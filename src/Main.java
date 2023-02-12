public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, 23, "Aziz", "Karamiani");

        System.out.println(employee.getId());
        System.out.println(employee.getAge());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());

        System.out.println(employee.getMailingName());
        System.out.println(employee.getMailingName(false));
        System.out.println(employee.getMailingName(true));
    }
}
