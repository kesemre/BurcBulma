import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Kaçıncı Ayda doğduğunuzu yazınız: ");
        month = input.nextInt();
        System.out.print("Lütfen Kaçıncı Günde doğduğunuzu yazınız: ");
        day = input.nextInt();
        if (month == 1) {
            if (day <= 21 && day > 0) {
                System.out.println("Oğlak Burcu");
            } else if (day <= 31) {
                System.out.println("Kova Burcu");

            } else {
                System.out.println("Geçersiz gün");
            }
        } else if (month == 2) {
            if (day <= 19 && day > 0) {
                System.out.println("Kova Burcu");
            } else if (day < 29) {
                System.out.println("Balık Burcu");

            } else {
                System.out.println("Geçersiz gün");
            }

        } else if (month == 3) {
            if (day <= 20 && day > 0) {
                System.out.println("Balık Burcu");
            } else if (day <= 31) {
                System.out.println("Koç Burcu");

            } else {
                System.out.println("Geçersiz gün");
            }

        } else if (month == 4) {
            if (day <= 20 && day > 0) {
                System.out.println("Koç Burcu");
            } else if (day <= 30) {
                System.out.println("Boğa Burcu");
            } else {
                System.out.println("Geçersiz gün");
            }

        } else if (month == 5) {
            if (day > 0 && day <= 21) {
                System.out.println("Boğa Burcu");
            } else if (day <= 31) {
                System.out.println("İkizler Burcu");

            } else {
                System.out.println("Geçersiz gün");
            }

        } else if (month == 6) {
            if (day <= 22 && day > 0) {
                System.out.println("İkizler Burcu");
            } else if (day <= 30) {
                System.out.println("Yengeç Burcu");

            } else {
                System.out.println("Geçersiz gün");
            }

        } else if (month == 7) {
            if (day <= 23 && day > 0) {
                System.out.println("Yengeç Burcu");
            } else if (day <= 31) {
                System.out.println("Aslan Burcu");

            } else {
                System.out.println("Geçersiz gün");
            }

        } else if (month == 8) {
            if (day <= 22 && day > 0) {
                System.out.println("Aslan Burcu");
            } else if (day <= 31) {
                System.out.println("Başak Burcu");
            } else {
                System.out.println("Geçersiz gün");
            }

        } else if (month == 9) {
            if (day > 0 && day <= 22) {
                System.out.println("Başak Burcu");
            } else if (day <= 30) {
                System.out.println("Terazi Burcu");

            } else {
                System.out.println("Geçersiz gün");
            }

        } else if (month == 10) {
            if (day <= 22 && day > 0) {
                System.out.println("Terazi Burcu");
            } else if (day <= 31) {
                System.out.println("Akrep Burcu");

            } else {
                System.out.println("Geçersiz gün");
            }

        } else if (month == 11) {
            if (day <= 21) {
                System.out.println("Akrep Burcu");
            } else if (day <= 30) {
                System.out.println("Yay Burcu");
            } else {
                System.out.println("Geçersiz gün");
            }

        } else if (month == 12) {
            if (day <= 21) {
                System.out.println("Yay Burcu");
            } else if (day >= 31) {
                System.out.println("Oğlak Burcu");

            } else {
                System.out.println("Geçersiz gün");
            }

        } else {
            System.out.println("Bir yılda 12 ay vardır");
        }
    }
}