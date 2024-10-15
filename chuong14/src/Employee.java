public class Employee {
    private int id;
    private String FirtName;
    private String LastName;
    private int salary;
    public Employee(int id, String FirtName, String LastName, int salary) {
        this.id = id;
        this.FirtName = FirtName;
        this.LastName = LastName;
        this.salary = salary;
    }
    public void Employee(int id, String FirtName, String LastName, int salary) {
        this.id = id;
        this.FirtName = FirtName;
        this.LastName = LastName;
        this.salary = salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return this.salary;
    }
    public int getId() {
        return id;
    }
    public String toString(){
        return "Employee [id= "+ id + "name= " + FirtName + " " + LastName + " " + salary+"]";
    }
    public String getFirstName() {
        return FirtName;
    }
    public String getLastName() {
        return LastName;
    }
    public int getAnnualSalary(){
        return salary*12;

    }
    public String getName(){
        return FirtName+" "+LastName;
    }
    public  Employee(){
        this.FirtName="Peter";
        this.LastName="Tan";
        this.salary=999;
        this.id=8;
    }
    public int raiseSalary(int persent){
        salary +=salary*persent/100;
        return salary;
    }
}
