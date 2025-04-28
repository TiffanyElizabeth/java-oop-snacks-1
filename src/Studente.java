public class Studente {

    // characteristics
    private String firstName;
    private String lastName;
    private int age;

    // getters and setters
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // methods
    public String fullNameAge() { // String firstName, String lastName, int age) {
        return firstName + " " + lastName + ", " + age + " anni";
    }

    // constructor
    public Studente(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
