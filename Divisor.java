public class Divisor {
    public static void main(String[] args) {
        Divisor obj = new Divisor();
        //obj.calculateDivisor(12);
    }
    public void calculateDivisor(int num) {
        int[] divisorArray = new int[15];
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                divisorArray[i-1] = i;
                System.out.println(i + " is divisor for " + num);
            }
        }
        for(int i : divisorArray) {
            System.out.print(i);
        }
    }

}
