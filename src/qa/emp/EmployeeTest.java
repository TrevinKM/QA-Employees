package qa.emp;

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


    }
}
