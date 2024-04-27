import java.util.Scanner;
public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=scanner.nextInt();

        int factorial=1;
        //Neden 1'den başlatıyoruz? Çünkü faktoriyel hesaplanırken çarpma işlemi yapılır bu nedenle 0'dan başlatamayız.//
        for(int i=1; i<=number;i++){
            factorial*=i;
        }
        System.out.print(number+  " factorial of number: "+factorial);
    }
}
