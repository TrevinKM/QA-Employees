package qa.emp;

public class Area {
    private double length;
    private double breadth;

    public Area(double length, double breadth){
        this.breadth = breadth;
        this.length = length;
    }

    public double returnArea(){
        return breadth*length;
    }
}
