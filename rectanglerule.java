//program to find approximate area under the graph of a function
import java.util.Scanner;
public class RectangleRule
{
   private double x;
   private double a;//first value of x
   private double b;//last value of x
   private double n;//number of divisions between x values
   private double function;//function of x
public double function(double x)//defines function of x
   {
       return function = //write any function of x;
       
   }
    public double area()//calculates area under graph of  f(x)
    {
        double sum;//sum variable has been initialised in this line
        Scanner in = new Scanner(System.in);//new scanner for user to enter values of a,b and n
        System.out.println("Enter first value of x:");
        a = in.nextDouble();
        System.out.println("Enter last value of x:");
        b = in.nextDouble();
        System.out.println("Enter number of divisions between x values:");
        n = in.nextDouble();
        double deltax = (b-a)/n;//calculating value of deltax i.e step size of variable x
        sum=0;
        for(double i=1;i<=n;i++)
        {
            x=a+deltax*i-(deltax/2);
            sum = sum + function(x);
        }
        sum = sum*deltax;//this will calculate total area under the curve 
        return sum;     
}
}
