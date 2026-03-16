public class DemoIssues {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = a + b;   // Issue 1: unused variable

        if(a > 5){
            System.out.println("A is greater than 5");
        }

        if(a > 5){   // Issue 2: duplicate condition
            System.out.println("Still greater than 5");
        }

        int result = divideNumbers(10,0); // Issue 3: possible divide by zero

        System.out.println("Result = " + result);

    }

    public static int divideNumbers(int x, int y){

        int temp = 0;  // Issue 4: unnecessary variable

        return x / y;

    }

}
