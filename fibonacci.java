public class fibonacci {
    public static void main(String[] args) {
        int n = 15;
        int a=0,b=1;
        int i,sum;

        System.out.println("Fibonacci series");

        for(i = 0 ; i <= n ; i++)
        {
            System.out.print(a + "\t");

            sum = a + b;

            a = b;
            b = sum;
        }
    }
}
