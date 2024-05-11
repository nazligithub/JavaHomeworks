import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterHomework {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("sayi.txt")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("10 adet sayı giriniz:");


            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + ". sayı:");
                int sayi = scanner.nextInt();
                fileWriter.write(Integer.toString(sayi)+"\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}