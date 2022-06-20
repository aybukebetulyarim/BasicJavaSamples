public class PrimeNumbers2 {
    public static void main(String[] args) {
        PrimeNumbers2 obj = new PrimeNumbers2();
        //obj.findPrimeNumbers(7);

    }

    public void findPrimeNumbers(int num) {
        int[] primeArray = new int[10];
        boolean prime = true;
        int position = 1;
        primeArray[0] = 2;
        for (int i = 3; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                } else if (i - 1 == j) {
                    prime = true;
                }
            }
            if (prime) {
                primeArray[position] = i;
                position++;
            }
        }
        for (int i : primeArray) {
            System.out.print(i + " ");
        }

    }

    int calculatePrimeNumbers(int n) {
        boolean prime = true;
        int i = 2;
        int upperBound = (int) (Math.sqrt(n) + 1);
        for (; i < upperBound; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            return n;
        }
        return 0;
    }
}

