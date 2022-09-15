package qa.emp;

public class Employee extends Person{
    private static final double salaryTax = 0.2;
    private String userName;
    private String firstName;
    private String lastName;
    private Integer salary;
    private boolean isHired;

    public Employee(String userName, String firstName, String lastName, String gender){
        super(gender);
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String userName, String firstName, String lastName, Integer salary, String gender){
        super(gender);
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }


    /* setters for creating an employee */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setHired(boolean isHired){
        this.isHired = isHired;
    }

    public void getName(){
        System.out.println("Hello "+ this.firstName + " " + this.lastName);
    }

    public Integer getSalary(){
        return (salary);
    }

    public double getSalaryTax(){
        return this.salary * (1 - salaryTax);
    }

    public void raiseSalary(Integer raise){
        this.salary += raise;
    }

    @Override
    public void yearsWorked(int n) {
        System.out.println("you have worked "+ n + " years and earned " + n*this.salary);
    }


//    public void testCase(){
//        //largest byte
//        byte sizeof = 127;
//        byte lowByte = -128;
//        //largest short
//        short highShort = 88;
//        int highInt = sizeof * sizeof;
//        long highLong;
//        char alpha;
//        float point;
//        double point2;
//
//        boolean nope;
//    }

}
