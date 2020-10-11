import java.util.Scanner;

class HariBerikutnya {
	public static void main(String[] datk) {
		int hariIni,
			nHari;

		String 	hari = "",
				hariBerikutnya = "",
				nHari1 = "";

		Scanner userInput = new Scanner(System.in);
	
		System.out.print("Masukkan Hari Sekarang (1-7) : ");
		hariIni = userInput.nextInt();
		System.out.print("Masukkan N Hari Kedepaan : ");
		nHari = userInput.nextInt();

		switch (hariIni) {
		case 1:
			hari = "Senin";
			hariBerikutnya = "Selasa";
			break;
		case 2:
			hari = "Selasa";
			hariBerikutnya = "Rabu";
			break;
		case 3:
			hari = "Rabu";
			hariBerikutnya = "Kamis";
			break;
		case 4:
			hari = "Kamis";
			hariBerikutnya = "Jumat";
			break;
		case 5:
			hari = "Jumat";
			hariBerikutnya = "Sabtu";
			break;
		case 6:
			hari = "Sabtu";
			hariBerikutnya = "Minggu";
			break;
		case 7:
			hari = "Minggu";
			hariBerikutnya = "Senin";
			break;
		default:
			System.out.println("Tidak ada hari ke - " + hariIni);
		break;
		}

		System.out.println("Hari ini hari " + hari);
		System.out.println("Besok hari " + hariBerikutnya);


		if(nHari % 7 == 0) {
			nHari1 = hari;
			System.out.println(nHari + " Hari Kedepaan " + nHari1);
		}else{
			int sum = nHari + hariIni;
			if (sum >7){
				sum %= 7;
			}
			switch (sum) {
			case 1:
				nHari1 = "Senin";
				break;
			case 2:
				nHari1 = "Selasa";
				break;
			case 3:
				nHari1 = "Rabu";
				break;
			case 4:
				nHari1 = "Kamis";
				break;
			case 5:
				nHari1 = "Jumat";
				break;
			case 6:
				nHari1 = "Sabtu";
				break;
			case 7:
				nHari1 = "Minggu";
				break;
		}
			 
		System.out.println(nHari + " Hari Kedepaan " + nHari1);
		}
}
}
