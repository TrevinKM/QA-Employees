package qa.emp;

import java.util.Scanner;

public class EmployeeTest {
    static {
        Employee newEmp = new Employee("jon", "smith", "js", 22);
        Integer salary = newEmp.getSalary();
    }
    public static void main(String[] args) {

        //call area class
        System.out.println("Enter two numbers : ");
        Scanner thisScan = new Scanner(System.in);
        int scanVal = thisScan.nextInt();
        int scanVal2 = thisScan.nextInt();

        Area rectangle = new Area( scanVal, scanVal2);

        System.out.println(" The area is : " + rectangle.returnArea() + "cm^2")
        ;


        int myInt = 100;

        int x = 100, y = 5, z = -30;
        int result = x*y*z;

        System.out.println(result);

        String street = "1600 Pennsylvania Avenue NW";
        String city = "Washington";
        String state = "DC";
        int zip = 20500;
        String whitehouseAddress = street + city + state + zip;
        System.out.println(whitehouseAddress);

        result  = (((((1+2)-1)*2)/2)+8)%7;
        result -= 1;
        result *= 2;
        result /=2;
        result +=8;
        result %= 7;
        System.out.println(result);


        char myChar = 'c';


        System.out.println("Employee details: " + myInt + myChar);

        Scanner custName = new Scanner(System.in);
        System.out.println("enter first name : ");
        String firstName = custName.nextLine();
        System.out.println("enter last name : ");
        String lastName = custName.nextLine();

        Employee newEmp = new Employee(firstName+lastName, firstName, lastName);
        Employee newEmp2 = new Employee(firstName+lastName, firstName, lastName, 22000);
        Employee newEmp3 = new Employee(firstName+lastName, firstName, lastName, 23000);

        newEmp.getName();
        Integer salary = newEmp2.getSalary();
        Integer salary2 = newEmp3.getSalary();

        System.out.println(salary + " " + salary2);

        System.out.println("the taxed salaries are: " + newEmp2.getSalaryTax() + " and " + newEmp3.getSalaryTax());

        newEmp2.raiseSalary(200);
        newEmp3.raiseSalary(500);

        System.out.println("Now the raised salaries are " + newEmp2.getSalary() +" " + newEmp3.getSalary());


//        int num1 = 5;
//        int num2 = 6;
//
//        float resultLast = num1/num2;
//
//        int num3 = 8;
//
//        System.out.println(num3++);
//        System.out.println(num3);
//        System.out.println(++num3);

    }
}
