package interviewTask;

public class Fibonacci {
	public static void main(String[] args) {
        //Write a Java Program to print first 10 numbers of Fibonacci series.
        
        int n1=0;
        int n2=1;
        
        for(int a=1; a<=10; ++a) {
            System.out.print(n1+" ");
            int sum=n1+n2;
            n1=n2;
            n2=sum;     
        }
      //  public static void main(String[] args) {
            int[] fib = new int[10];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < 10; i++) {
                   fib[i] = fib[i - 1] + fib[i - 2];
            }
            System.out.println("Here are the first 10 Fibonacci numbers:");
            for (int j = 0; j < 10; j++) {
                   System.out.print(fib[j] + " ");
            }
        
        
        
    }
}

