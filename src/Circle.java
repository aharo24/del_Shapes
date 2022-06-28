public class Circle
{
    protected double radius;
    public Circle(){};
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public void solveArea(double radius)
    {
        double formula = Math.PI * radius * radius;

        System.out.println("Area of Circle: " + formula);

    }

    public void solveRadius(double area)
    {
        double formula = Math.sqrt( area / Math.PI);

        System.out.println("Radius of Circle: " + formula);
    }


    public void solveDiameter(double radius)
    {
        double formula = 2 * radius;
        System.out.println("Diameter of Circle: " + formula );
    }

    public void solveCircumference(double radius)
    {
        double formula = 2 * Math.PI * radius;

        System.out.println("Circumference of Circle: " + formula);
    }

}
