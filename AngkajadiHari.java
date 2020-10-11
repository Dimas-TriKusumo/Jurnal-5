import java.util.Scanner;


public class AngkajadiHari {

    public static void main(String[] datk) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Bilangan Bulat N(1<=N>=7) = ");
        String hari = input.nextLine();
        switch(hari){
        case "1":
                System.out.println("Senin");
        break;
        case "2":
                System.out.println("Selasa");
            break;
        case "3":
                System.out.println("Rabu");
        break;
        case "4":
                System.out.println("Kamis");
        break;
        case "5":
                System.out.println("Jumat");
        break;
        case "6":
                System.out.println("Sabtu");
        break;
        case "7":
                System.out.println("Minggu");
        break;
        default : 
                System.out.println("Itu Hari Apa Ya?");
}
}
}