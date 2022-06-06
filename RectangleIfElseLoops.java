public class RectangleIfElseLoops {
    public static void main(String[] args) {
        RectangleIfElseLoops rectangle = new RectangleIfElseLoops();
        //rectangle.drawFilledFakeRectangle();
        //rectangle.drawVoidFakeRectangle();
        //rectangle.drawFilledRealRectangle(10,5);
        //rectangle.drawVoidRealRectangle(10,5);
        //rectangle.drawFakeRightTriangle();
        rectangle.drawRealRightTriangle(6,6);
    }
    public void drawFilledFakeRectangle() {
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");

    }

    public void drawFilledRealRectangle(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
                if (j == column -1) {
                    System.out.println();
                }
            }
        }

    }
    public void drawVoidFakeRectangle() {
        System.out.println("******");
        System.out.println("*    *");
        System.out.println("*    *");
        System.out.println("*    *");
        System.out.println("*    *");
        System.out.println("******");
    }

    public void drawVoidRealRectangle(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 | i == row - 1) {
                    System.out.print("*");
                    if (j == column -1)
                        System.out.println();
                }
                else {
                    if (j == 0) {
                        System.out.print("*");
                    } else if (j == column - 1) {
                        System.out.println("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
        }
    }
    public void drawFakeRightTriangle() {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        System.out.println("******");
        System.out.println("*******");
        System.out.println("********");
    }

    public void drawRealRightTriangle(int row, int column) {
        for(int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
               if (j <= i)
                   System.out.print("*");
            }
            System.out.println();
        }
    }
}


