class pen
{
    String color;
    String type;

    public void printinfo()
    {
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
    }
}

public class Pen_theory {
    public static void main(String[] args) {
        pen p1 = new pen();
        pen p2 = new pen();
        p1.color = "Blue";
        p2.color = "Black";
        p1.type = "Ball";
        p2.type = "Gel";
        p1.printinfo();
        p2.printinfo();
    }
}
