package qa.emp;

public class Graduate extends Employee{
    private boolean newStarter = true;
    public Graduate(String userName, String firstName, String lastName, Integer salary, String gender, boolean newStarter) {
        super(userName, firstName, lastName, salary, gender);
        this.newStarter = newStarter;
    }

    public Graduate(String userName, String firstName, String lastName, String gender, boolean newStarter) {
        super(userName, firstName, lastName, gender);
        this.newStarter = newStarter;
    }

    public void raiseSalary(Integer raise){
        raise = getSalary() + 1;
    }

}
