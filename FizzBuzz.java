public class FizzBuzz {
    public static void  main(String[] args) {
        FizzBuzz game = new FizzBuzz();
        game.calculateGame((int)(Math.random() * 101));
    }
    public void calculateGame(int n) {
        if (n % 3 == 0 & n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.print("There is no condition");
        }
    }
}
