public class Main
{
    public static void main(String[] args)
    {
        Circle c = new Circle();

        c.solveArea(12);

        c.solveRadius(6);

        c.solveDiameter(20);

        c.solveCircumference(22);

        System.out.println("------- Explicit Constructor Below ---- ");
        Circle c2 = new Circle(12);

        System.out.println( c2.solveRadius(12) );

    }
}
