package muhasebe;
import  java.util.*;
public class kullanici {
    Scanner klavye=new Scanner(System.in);
    Bakiye bakiye = new Bakiye();
    Gelir gelir = new Gelir();
    Gider gider = new Gider();
    public void kullanıcıBul(int kullaniciNo) {
        String[] kullaniciNolari = {"Talha Gürle", "Ecrin GÜRLE", "Nergis ARABACI", "Muhammet Talha SEZGİN", "Barış KILIÇ"};
        System.out.println(kullaniciNolari[kullaniciNo]+" için işlem yapıryorsunuz.");
        islemler(kullaniciNo);
    }

    public void islemler(int kullaniciNo){


        System.out.println("Hangi işlemi yapmak istersiniz\n" +
                "1.Bakiye bilgisi\n" +
                "2.Gelir işlemi\n" +
                "3.Gider işlemi\n" +
                "4.Çıkış");
        int islemNo= klavye.nextInt();

        if(islemNo == 1){
            bakiye.bakiyeOgren(kullaniciNo);

        } else if (islemNo == 2) {


        } else if (islemNo ==3) {

        }else if (islemNo==4){

        }else {
            System.out.println("Geçersiz işlem algılandı sistemden çıkartılıyorsunuz...");
        }


    }

}
