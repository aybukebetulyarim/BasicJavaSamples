public class ExchangeDigits {
    public static void main(String[] args) {
        ExchangeDigits digits = new ExchangeDigits();
        digits.exchangeDigitsFunc((int)(Math.random() * 10001));
    }
    public void exchangeDigitsFunc(int n) {
        System.out.println(n);
        int length = (int) (Math.log10(n)+1);
        int other,last,remainder,temp = 0;
        int result;
        for(int i = 0; i < length; i++) {
            remainder = n % 10;
            n = n/10;
            System.out.print(remainder);
        }
    }
}
