package qa.emp;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
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

        newEmp.getName();



        int num1 = 5;
        int num2 = 6;

        float resultLast = num1/num2;

        int num3 = 8;

        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);

    }
}
