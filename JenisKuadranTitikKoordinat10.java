import java.util.Scanner;

public class JenisKuadranTitikKoordinat10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int x          ;
        int y          ;
        String Letak   ;

        System.out.println("===============================================================");
        System.out.println("======= Selamat datang di Program Kuadran Titik Koordinat =======");
        System.out.println("                                                              ");
        System.out.print("Masukkan nilai x : ");
        x = sc.nextInt();
        System.out.print("Masukkan nilai y : ");
        y = sc.nextInt();

        if (x == 0 && y == 0) {
            Letak = "Titik pusat (0,0)" ;
        } else if (x == 0) {
            Letak = "Titik berada pada sumbu Y" ;
        } else if (y == 0) {
            Letak = "Titik berada pada sumbu X" ;
        } else if (x > 0) {
           
            if (y > 0) {
                Letak = "Kuadran I" ;
            } else {
                Letak = "Kuadran IV" ;
            }
        
        } else if (x < 0) {
            if (y > 0) {
                Letak = "Kuadran II" ;
            } else {
                Letak = "Kuadran III" ;
            } 
        }else {
            Letak = " Titik berada pada sumbu X atau Y" ;
        }
        

        System.out.println("Titik koordinat (" + x + "," + y + ") berada pada " + Letak);
        System.out.println("                                                                    ");
        System.out.println("======= TERIMA KASIH TELAH MENGGUNAKAN PROGRAM KUADRAN TITIK KOORDINAT =======");
        System.out.println("===============================================================");

        sc.close();

    }

}
