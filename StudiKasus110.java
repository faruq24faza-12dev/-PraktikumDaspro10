import java.util.Scanner;
public class StudiKasus110 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int hargaPerCup = 18000 ;
        int jumlahCup           ;
        int uangBayar           ;    
        int totalHarga          ; 
        int diskon              ;
        int totalBayar          ;
        int kembalian           ;
        int kurang              ;

        System.out.println("======= Selamat datang di Kedai Kopi MAS FARUQ =======");
        System.out.println("                                                      ");
        System.out.print("Masukkan jumlah cup yang dibeli : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar             : Rp.");
        uangBayar = sc.nextInt();
