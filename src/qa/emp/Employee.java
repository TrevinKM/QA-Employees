package qa.emp;

public class Employee {
    private String userName;
    private String firstName;
    private String lastName;
    private Integer salary;
    private boolean isHired;

    Employee(String userName, String firstName, String lastName){
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public void testCase(){
        //largest byte
        byte sizeof = 127;
        byte lowByte = -128;
        //largest short
        short highShort = 88;
        int highInt = sizeof * sizeof;
        long highLong;
        char alpha;
        float point;
        double point2;

        boolean nope;
    }

}
