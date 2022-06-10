public class Operators {
    public static void main(String[] args) {
        Operators num = new Operators();
        num.operatorsFunc();
    }
    public void operatorsFunc() {
        int i = 5;
        float f = 10.2f;
        double d = 9.934;
        long l = 30L;

        //var result = i + f; // If we add int and float, the result is float
        //var result = f + d; // If we add float and double, the result is double
        //var result = l + d;

        //var result = i * f; // If we multiply int and float the result is float;
        //var result = l / d;
        var result = l % f;

        // Consequently if one operand is float or double with operators, result must be float or double.
        System.out.println(result);
    }
}
