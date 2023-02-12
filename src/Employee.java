public class Employee {
    public int id;
    public int age;
    public String firstName;
    public String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee(int id, int age, String firstName, String lastName) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getMailingName() {
        return this.firstName + this.lastName;
    }


    public String getMailingName(boolean onlyFirstName) {
        if (onlyFirstName)
            return this.firstName;

        return this.firstName + "@" + this.lastName;
    }
}
