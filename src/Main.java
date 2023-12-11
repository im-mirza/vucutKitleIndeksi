import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //degiskenleri tanimladim
        float kilo,boy,vki;
        //kullaniciden boy ve kilosunu aldim
        Scanner sc= new Scanner(System.in);
        System.out.println("Vucut Kitle Indeksi Hesaplayan program");
        System.out.println("Lutfen Cekinizi Giriniz");
        kilo= sc.nextFloat();
        System.out.println("Lutfen Boyunuzu Giriniz");
        boy= sc.nextFloat();
       vki=kilo/(boy*boy);
        System.out.println("Vucut Kitle Indeksiniz: "+vki);
        if(vki<18.5){
            System.out.println("Zayif");
        }else if((18.5 <= vki )&& (vki < 24.9)){
            System.out.println("Normal");
        }else if((25 <= vki)&& (vki < 29.9)){
            System.out.println("Fazla Kilolu");
        }else if ( vki>= 30){
            System.out.println("Obez");
        }




    }
}