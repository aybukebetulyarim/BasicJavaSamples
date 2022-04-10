public class NarrowingConversion {
    public static void main(String[] args) {
        byte b = 0;
        short s = 1000;
        char c;
        int i = -100;
        long l = 10_000_000_000l;
        float f = 65.5541_233f;
        double d = 98.014_353_459_485_483d;


        // b = s; Compile Error: Possible loss of precision.
        // c = i; int -> char NOT OK!!
        // f = d; double -> float NOT OK!!

        // When we want to do Narrowing, we use the cast operator "()". The primitive type to be converted into parentheses is written.

        b = (byte) s; // short -> byte.
        System.out.println("s: " + s + "\t\t\tb: " + b);

        i = (int) l; // Loss of info long -> int
        System.out.println("l: " + l + "\t\ti: " + i);

        i = (int) d; // double -> int
        System.out.println("d: " + d + "\ti: " + i);

        i = (int) f; // Loss of floating point info float -> int
        System.out.println("f: " + f + "\t\ti: " + i);

        l = (long) f; // float -> long
        System.out.println("f: " + f + "\t\tl: " + l);

        f = (float) d; // double -> float
        System.out.println("d: " + d + "\tf: " + f);

        i= 65;
        c = (char) i;
        System.out.println("i: " + i + "\t\t\tc: " + c);

        i= -i;
        c = (char) i;  // Problem!
        System.out.println("i: " + i + "\t\t\tc: " + c);

    }
}
