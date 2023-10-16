/**
 * WhileGaji10
 */
import java.util.Scanner;
public class WhileGaji10 {

    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int jumlahJamLembur, jumlahKaryawan;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;
        System.out.print("Masukkan jumlah karyawan : ");
        jumlahKaryawan = input10.nextInt();
        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihlah jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + i + ": ");
            jabatan = input10.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = input10.nextInt();
            i++;
            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan salah");
                i--;
                continue;
            }
            totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur : " + totalGajiLembur);

        } 
    }
}