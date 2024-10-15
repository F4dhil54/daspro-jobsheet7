import java.util.Scanner;

public class SiakadForModifikasi04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int JumlahLulus = 0, JumlahTidakLulus = 0;
        double tidakLulus = 60.0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilai = input.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= tidakLulus) {
                JumlahLulus++;
            } else {
                JumlahTidakLulus++;
            }
        }
        input.close();
        System.out.println("-------------------------------------------");
        System.out.println("Nilai tertinggi            : " + tertinggi);
        System.out.println("Nilai terendah             : " + terendah);
        System.out.println("Mahasiswa yang Lulus       : " + JumlahLulus);
        System.out.println("Mahasiswa yang tidak Lulus : " + JumlahTidakLulus);
    }
}