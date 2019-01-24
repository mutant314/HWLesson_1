public class Person<persArr> {

    private String name;
    private String position;
    private String email;
    private String  telNumber;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String telNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    public void setPrintPers() {
            System.out.println("Name: " + name);
            System.out.println("Position: " + position);
            System.out.println("e-Mail: " + email);
            System.out.println("Tel.: " + telNumber);
            System.out.println("Salary: " + salary);
            System.out.println("Age: " + age + "\n");
    }

    public int getAge() {
        return age;
    }
}
