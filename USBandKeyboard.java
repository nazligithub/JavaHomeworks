import java.util.Scanner;
public class USBandKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bütçeniz 60'tır. İkisinden de en az 1 tane almanız gerekmektedir.");
        System.out.println("Klavye fiyatını giriniz(40,50,60):");
        int keyboard= scanner.nextInt();;
        System.out.println("USB fiyatını giriniz(5,8,12):");
        int usb=scanner.nextInt();
        int butceasimi=-1;

        if(keyboard==50 && usb==8){
            System.out.println("Bütçenize uygun ve max değer.");
        } else if(keyboard==50 && usb==12 || keyboard==60 && usb==5 || keyboard==60 && usb==8 || keyboard==60 && usb== 12){
            System.out.println("Bütçenizi aşıyor. Alamazsınız.  " +  butceasimi);
        }else{
            System.out.println("Bütçenize uygun fakat max değer değil.");
        }
    }
}