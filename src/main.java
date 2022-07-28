import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyat,fiyat1,kdvsizTutar,kdvliTutar,kdvOrani,kdvOrani1 ;
        kdvOrani = 0.18;
        kdvOrani1 = 0.08;
        System.out.print("Lütfen hesaplanmasını istediğiniz miktarı girin :");
        fiyat = input.nextDouble();
        if (fiyat < 1000 ) {
            fiyat = fiyat + (fiyat*kdvOrani);
            System.out.println("Ürün Kdvli fiyatı :  " +  fiyat);
        }
        else {
            fiyat = fiyat + (fiyat*kdvOrani1);
            System.out.println("Ürün Kdvli fiyatı :  " +  fiyat);

        }
















    }
}
