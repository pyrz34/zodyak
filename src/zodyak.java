import java.util.Scanner;

public class zodyak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Lütfen doğum yılınızı giriniz: ");
        int dogumYili = input.nextInt();


        int kalan = dogumYili % 12;


        String zodyakBurcu = "";
        switch (kalan) {
            case 0:
                zodyakBurcu = "Maymun";
                break;
            case 1:
                zodyakBurcu = "Horoz";
                break;
            case 2:
                zodyakBurcu = "Köpek";
                break;
            case 3:
                zodyakBurcu = "Domuz";
                break;
            case 4:
                zodyakBurcu = "Fare";
                break;
            case 5:
                zodyakBurcu = "Öküz";
                break;
            case 6:
                zodyakBurcu = "Kaplan";
                break;
            case 7:
                zodyakBurcu = "Tavşan";
                break;
            case 8:
                zodyakBurcu = "Ejderha";
                break;
            case 9:
                zodyakBurcu = "Yılan";
                break;
            case 10:
                zodyakBurcu = "At";
                break;
            case 11:
                zodyakBurcu = "Koyun";
                break;
            default:
                zodyakBurcu = "Geçersiz";
        }


        System.out.println("Çin Zodyağı burcunuz: " + zodyakBurcu);
    }
}
