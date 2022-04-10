public class FinalVariables {
    public static void main(String[] args) {
        final int i = 8;
        System.out.println(i);
        //i++; final variables assign a value just once. Cannot assign value many times. Illegal

        final long l; // Blank final
        l = 7;
        System.out.println(l);

        int x = 3;
        int y = 8;
        final int j;
        if (x>y)
            j = 9;
        else
            j = 11;
        System.out.println(j);

        // final Car c1 = new Car();
        // c1 = new Car(); is not Acceptable!!

        // final Car c2;
        // c2 = new Car();
    }
}
