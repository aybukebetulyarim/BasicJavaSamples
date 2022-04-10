public class WideningConversion {
    public static void main (String[] args) {
        byte b = 126;
        short s = 1000;
        char c = 65;
        int i = 2_147_483_647;
        long l;
        float f = 3.14f;
        double d;

        //c = b; Compile Error because of boolean cannot convert to other primitive variable types.

        s = b; // byte -> short OK.
        l = i; // int -> long OK.

        f = i; // int -> float NOT OK!! Because floating points maybe missing.
        System.out.println("i: " + i + " f: " + f);

        l = i + 1;
        System.out.println("i: " + i + " l: " + l);
        System.out.println();
        // Loss of precision

        l = 987_654_321_123_456_789L;
        f = l; // long -> float NOT OK!!
        System.out.println("l: " + l + " f: " + f);

        d = l; // long -> double NOT OK!!
        System.out.println("l: " + l + " d: " + d);

        d = f; // float -> double OK.
        System.out.println("f: " + f + " d: " + d);

        i = c; // char -> int OK.
        System.out.println("c: " + c + " i: " + i);

        d = i; // int -> double NOT OK!! Because floating points digits may be missing.
        System.out.println("i: " + i + " d: " + d);

    }
}
