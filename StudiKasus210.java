import java.util.Scanner;
public class StudiKasus210 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        String namaMahasiswa;
        String jenisKegiatan;
        String status ;
        String alasan ;
        int JumlahDokumen;
        int PeringkatJuara;
        int pendanaanPKM;

        System.out.println("                   ");
        System.out.println("===============================================================");
        System.out.println("======= Selamat datang di Program Penghargaan Mahasiswa =======");
        System.out.println("                                                              ");
        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MMANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine().trim().toLowerCase();

        if (jenisKegiatan.equals("belmawa") || jenisKegiatan.equals("bakorma") || jenisKegiatan.equals("mandiri")) {

            System.out.print("Jumlah dokumen yang diupload (0-4) : ");
            JumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara) : ");
            PeringkatJuara = sc.nextInt();

            if (PeringkatJuara >= 1 && PeringkatJuara <= 3) {
                
                if (JumlahDokumen == 4) {
                    status = "BERHAK MENERIMA DANA PENGHARGAAN" ;
                    alasan = "Memperoleh Juara " + PeringkatJuara + " dan dokumen lengkap.";

                } else {
                    status = "TIDAK MENERIMA DANA PENGHARGAAN" ;
                    alasan = "Dokumen tidak lengkap ( kurang " + (4 - JumlahDokumen) + " dokumen ).";
                }

            } else {
                status = "TIDAK MENERIMA DANA PENGHARGAAN";
                alasan = "Tidak Memperoleh Juara 1/2/3 ." ;
            }

        } else if (jenisKegiatan.equals("pkm")) {

            System.out.print("Jumlah dokumen yang diupload (0-4) : ");
            JumlahDokumen= sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos , 0 = tidak lolos) : ");
            pendanaanPKM = sc.nextInt();

            if (pendanaanPKM == 1) {

                if (JumlahDokumen == 4) {
                    status = "BERHAK MENERIMA DANA PENGHARGAAN";
                    alasan = "PKM lolos pendanaan dan keempat dokumen lengkap.";

                } else {
                    status = "TIDAK MENERIMA DANA PENGHARGAAN";
                    alasan = "Dokumen tidak lengkap ( kurang " + (4 - JumlahDokumen) + " dokumen ).";
                }
            } else {
                status = "TIDAK MENERIMA DANA PENGHARGAAN";
                alasan = "PKM tidak lolos pendanaan.";
            }

        } else if (jenisKegiatan.equals("lainnya")) {

            System.out.print("Jumlah dokumen yang diupload (0-4) : ");
            JumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara) : ");
            PeringkatJuara = sc.nextInt();

            status = "TIDAK MENERIMA DANA PENGHARGAAN";
            alasan = "Kegiatan kategori Lainnya tidak memperoleh dana penghargaan.";
        
        } else {
            status = "DATA TIDAK VALID";
            alasan = "Jenis kegiatan harus BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya.";
        }

        System.out.println("Status : " + status);
        System.out.println("Alasan : " + alasan);
        System.out.println("      ");
        System.out.println("====== TERIMA KASIH TELAH MENGGUNAKAN PROGRAM PENGHARGAAN MAHASISWA =======");
        System.out.println("===========================================================================");
        System.out.println("      ");

        sc.close();
    }
}