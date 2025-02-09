//e2

import java.util.function.Function;

class eq {
    public static void main(String args[]) {
    double a =2;
    double b =20;
    double c =10;
    
    Function<Double, Double> discriminant = (Double val) -> Math.pow(val, 2) - 4 * a * c;
    double discriminantValue = discriminant.apply(b);
    double root1 = (-b + Math.sqrt(discriminantValue)) / (a * 2) ;
    double root2 = (-b - Math.sqrt(discriminantValue)) / (a * 2) ;
    System.out.println("root 1 = " + root1);
    System.out.println("root 2  = " + root2);
    }
}


