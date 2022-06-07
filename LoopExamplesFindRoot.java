public class LoopExamplesFindRoot {
    public static void main(String[] args) {
       LoopExamplesFindRoot obj = new LoopExamplesFindRoot();
       obj.calculateRoots(2,8,5);
    }
    public void calculateRoots(double a, double b, double c) {
        System.out.println(a + "x^2" + "+" + b + "x" + "+" + c);
        double x1, x2;
        // x1 = (-b + Math.sqrt(b*b-4*a*c))/2*a;
        // x2 = (-b - Math.sqrt(b*b-4*a*c))/2*a;
        double result;
        result = (b*b)-(4*a*c);
        if(result > 0) {
            x1 = (-b + Math.sqrt(result))/2*a;
            x2 = (-b - Math.sqrt(result))/2*a;
        } else if (result == 0) {
            x1 = -b/(2*a);
            x2 = -b/(2*a);
        } else {
            System.out.println("Roots are imaginary");
        }
    }
}
