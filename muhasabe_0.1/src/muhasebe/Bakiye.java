package muhasebe;

import java.util.Scanner;

public class Bakiye {
    public void bakiyeOgren(int kullaniciNo){
        kullanici islem=new kullanici();
        Scanner klavye=new Scanner(System.in);
        int[] kullaniciBakiyeleri={895,7897,5643,7896,1559};
        System.out.println(kullaniciNo+" nolu kullanıcının bakiye bilgileri.\n" +
                kullaniciBakiyeleri[kullaniciNo]+" TL\n" +
                " \n" +
                "  \n" +
                "Ana menüye dönmek için herhangi bir harfe basın...");
        klavye.next();
        islem.islemler(kullaniciNo);




    }
}
