import java.util.Scanner;

/**
 * @author Ayşe Memiş
 * @since 1.0.0
 */
public class DaireDilimiHesaplayanUygulama {
    public static void main(String[] args) {
        int r ;
        double a ;
        double pi = 3.14 ;

        Scanner inp = new Scanner(System.in) ;
        System.out.println("Dairenin yarıçapını giriniz:");
        r=inp.nextInt();

        System.out.println("Dairenin merkez açısını giriniz :");
        a= inp.nextInt();

        double daireDilimininAlani = (pi*(r*r)*a)/360;

        System.out.println("Daire diliminin alanı :"+daireDilimininAlani);



        }
    }

