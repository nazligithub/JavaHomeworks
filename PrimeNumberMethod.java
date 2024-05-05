import java.util.Scanner;
public class PrimeNumberMethod {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number= scanner.nextInt();


                if (Primenumber(number)) {
                    System.out.print("Asal sayıdır.");
                } else {
                    System.out.print("Asal sayı değildir.");
                }
            }

            public static boolean Primenumber(int number) {
                if (number <= 1) {
                    return false;
                    //Bunu belirtmezsek program 1i de asal olarak alır.
                }
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        return false;
                    }
                    //Math.sqrt aslında karekök bulmak için kullanılır. Biz burada kareköküne kadar olan sayıları bölenlerini bulabilmek için kullandık//
                    //1 den ve kendisinden başka böleni var ise zaten asal değildir. Bu yöntemle anlayabiliriz.
                }
                return true;
            }
        }
