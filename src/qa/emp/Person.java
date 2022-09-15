package qa.emp;

public abstract class Person {
    private String gender;

    public Person(String gender){
        this.gender = gender;
    }

    //abstract method
    public abstract void yearsWorked(int n);

    public void setGender(String newGender){
        this.gender = newGender;
    }

    public String getGender() {
        return gender;
    }
}
