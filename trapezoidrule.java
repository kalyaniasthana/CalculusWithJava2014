//program to find approximate area under the graph of a function
import java.util.Scanner;
public class TrapezoidRule
{
   private double x;
   private double a;//first value of x
   private double b;//last value of x
   private double n;//number of divisions between x values
   private double function;//function of x
public double function(double x)//defines function of x
   {
       return function = //insert an fucntion of x; //function of x
       
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
        sum = (function(a) + function(b))/2;//variable sum has been given a temporary value here which will keep changing while the loop runs
        for(double i=1;i<n;i++)
        {
            x = a + i*deltax;//increasing values of x by adding step size
            sum = sum + function(x);
        }
        sum = sum*deltax;//this will total area under the curve 
        return sum;     
}
}
