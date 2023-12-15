package muhasebe;
import javax.swing.*;
import java.util.*;




public class muhasabe {

    public static void main(String[] args){

        kullanici person=new kullanici();
        Scanner klavye=new Scanner(System.in);
        System.out.println("---Muhasebe 0.1---");
        System.out.println("Kullanıcı no:");
        int kullaniciNo=klavye.nextInt();
        person.kullanıcıBul(kullaniciNo);









    }


}
