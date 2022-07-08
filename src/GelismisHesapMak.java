import java.util.Scanner;

public class GelismisHesapMak {

    static int toplama(int a, int b) {
        int result = a + b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int cikarma(int a, int b) {
        int result = a - b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int carpma(int a, int b) {
        int result = a * b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int bolme(int a, int b) {
        int result = a / b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int uslu(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int dikdortgen(int a, int b) {
        int alan = a * b;
        int cevre = (2 * a) + (2 * b);
        System.out.println("Alan : " + alan + "\n" + "Cevre : " + cevre);
        return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "1 - Toplama islemi\n" +
                "2 - Cikarma islemi\n" +
                "3 - Carpma islemi \n" +
                "4 - Bolme islemi\n" +
                "5 - Uslu Sayi Hesaplama \n" +
                "6 - Mod alma\n" +
                "7 - Dikdortgen Alan ve Cevre Hesabi\n" +
                "0 - Cikis";
        while (true) {
            System.out.println(menu);
            System.out.print("Bir islem seciniz : ");
            int select = input.nextInt();
            if (select == 0 || select > 7) {
                if (select > 7) {
                    System.out.println("Hatali giris yapildi..");
                } else {
                    System.out.println("Cikis yapiliyor..");
                }
                break;
            }
            System.out.println("Ilk sayiyi giriniz : ");
            int a = input.nextInt();
            System.out.println("Ikinci sayiyi giriniz : ");
            int b = input.nextInt();
            switch (select) {
                case 1:
                    toplama(a, b);
                    break;
                case 2:
                    cikarma(a, b);
                    break;
                case 3:
                    carpma(a, b);
                    break;
                case 4:
                    bolme(a, b);
                    break;
                case 5:
                    uslu(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    dikdortgen(a, b);
                    break;
                default:
                    System.out.println("Hatali giris yapildi..");
            }
        }
    }
}
