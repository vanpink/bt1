public class TestMain {
    public static void main(String[] args) {

        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1.toString());
        e1.setSalary(999);
        System.out.println(e1.toString());
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());
        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary());
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}