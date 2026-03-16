public class SampleAnalysis {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = a + b;   // unused variable

        int result = addNumbers(a, b);

        if(result > 0){
            System.out.println("Positive result");
        }

        if(result > 0){   // duplicate condition
            System.out.println("Still positive");
        }

    }

    public static int addNumbers(int x, int y){

        int sum = x + y;

        return sum;

    }

}
