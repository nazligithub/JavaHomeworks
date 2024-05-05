public class USBandKeyboard {
    public static void main(String[] args) {
        int keyboards[] = {40, 50, 60};
        int usbdrives[] = {5, 8, 12};
        int b = 60;
        int Maxprice = 0;

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < usbdrives.length; j++) {
            int price= keyboards[i]+usbdrives[j];

            if(price<=b && price > Maxprice){
                Maxprice=price;
            }
            }
        }
        System.out.println("En son harcayabileceğim en yüksek miktar:"+Maxprice);
    }
}
