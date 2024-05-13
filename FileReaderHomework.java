import java.io.FileReader;
import java.util.Scanner;
public class FileReaderHomework {
    public static void main(String[] args) {
        try(FileReader fileReader=new FileReader("sayi.txt")){

            Scanner scanner = new Scanner(fileReader);
            int[] tekSayilar = new int[10];
            int[] ciftSayilar = new int[10];
            int tekArray = 0;
            int ciftArray = 0;

            while (scanner.hasNextLine()) { //dosyanın sonuna kadar veriyi okumamızı sağlar
                int sayi = Integer.parseInt(scanner.nextLine());
                 //tam sayıya dönüştürmek için
                if (sayi % 2 == 0) {
                    ciftSayilar[ciftArray++] = sayi;
                } else {
                    tekSayilar[tekArray++] = sayi;
                }
            }
             Arrays.sort(ciftSayilar);
             Arrays.sort(tekSayilar);
            System.out.print("Tek sayılar:");
            for (int i = 0; i < tekArray; i++) {
                System.out.println(tekSayilar[i]);
            }

            System.out.print("Çift sayılar:");
            for (int i = 0; i < ciftArray; i++) {
                System.out.println(ciftSayilar[i]);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
