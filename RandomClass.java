import java.util.Random;
public class RandomClass {
    public static void main(String[] args) {
    Random random=new Random();
    int deneme = 1;
    do {
        int zar1 = random.nextInt(6) + 1;//parantez içinde 6 yazdığımızda 0'dan başlatacaktır.
        //Bunu istemiyoruz. Zar sayıları 1 den başlar bu nedenle 1 ekliyoruz.
        int zar2 = random.nextInt(6) + 1;
        System.out.println("Deneme " + deneme + ": " + zar1 + "-" + zar2);

        if (zar1 == 6 && zar2 == 5) {
            System.out.println();//Boşluk bırakmak için.
            System.out.println("Deneme " + deneme + "' de 6-5 geldi.");
            break;
        }
        deneme++;
                } while (true);// true döndükçe do ya tekrar gider.
            }
        }


