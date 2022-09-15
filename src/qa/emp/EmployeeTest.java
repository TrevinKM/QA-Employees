package qa.emp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTest {
    static {
        Employee newEmp = new Employee("jon", "smith", "js", 22, "f");
        Integer salary = newEmp.getSalary();
    }

    // ------------------------------------------------------------------------------------------------------
    public static void meth(StringBuilder x){
        x.append(" world 2");
    }


    public static void main(String[] args) {
        // String building
        StringBuilder bld = new StringBuilder();
        bld.append("Hello");
        System.out.println(bld.toString() + " World");
        meth(bld);
        System.out.println(bld);
//------------------------------------------------------------------------------------------


        ArrayList<Deck> cards = new ArrayList<>();
        //Array of suits and rank
        String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
        String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q", "A"};
        //call the deck
        for (String suit:suits) {
            for (String rank:ranks) {
                cards.add(new Deck(suit, rank));
            }
        }
        //print the deck
        System.out.println("~The deck~");
        for (Deck deck: cards) {
            System.out.println(deck.getSuit());
        }

        // ------------------------------------------------------------------------------------------------------


        //Book class calls
        Book book = new Book("50 shades ", "dunno", 22.0);
        System.out.println(book.toString());

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

        Employee newEmp = new Employee(firstName+lastName, firstName, lastName, "meal");
        Employee newEmp2 = new Employee(firstName+lastName, firstName, lastName, 22000, "femal");
        Employee newEmp3 = new Employee(firstName+lastName, firstName, lastName, 23000, "fems");

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
