import java.util.*;

public class BMI
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int f;
        double i;
        double w;
        double kilo;
        double bmi;
        double ti;
        double m;
        
        System.out.print( " What is your height in feet (inches will come next) ? ");
        f = console.nextInt();
        System.out.print( " Inches ? ");
        i = console.nextDouble();
        System.out.print( " What is your weight (in pounds) ? ");
        w = console.nextDouble();
        
        ti = i + (f * 12);
        m = ( ti * .0254 );
        kilo = ( w / 2.2);
        bmi = kilo  / (m * m);

        System.out.printf( "\nA %d foot %.0f inch adult of %.1f pounds has a Body Mass Index (BMI) of %.1f ." , f , i , w , bmi);
        
        	if(bmi<18.5) System.out.printf( " You are underweight. \n" );
            if(bmi>18.5 && bmi<24.9) System.out.printf( " You are Normal. \n" );
            if(bmi>25.0 && bmi<29.9) System.out.printf( " You are overweight. \n" );
            if(bmi>30) System.out.printf( " You are obese. \n" );
           
        System.out.printf("BMI   ") ;          System.out.printf("      Weight Status: \n");
        System.out.printf("Below 18.5  ");     System.out.printf("  -Underweight \n");
        System.out.printf("18.5 - 24.9  ");    System.out.printf("  -Normal \n");
        System.out.printf("25.0 - 29.9  ") ;   System.out.printf("  -Underweight \n");
        System.out.printf("30.0 and above  ");  System.out.printf("-Obese  \n");

        
    }
}
