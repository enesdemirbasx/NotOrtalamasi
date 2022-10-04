import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int f,k,b,t,m,i;
        double ort=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Kimya notunuzu giriniz: ");
        k=input.nextInt();
        System.out.print("\nMatematik notunuzu giriniz: ");
        m=input.nextInt();
        System.out.print("\nFizik notunuzu giriniz: ");
        f=input.nextInt();
        System.out.print("\nBiyoloji notunuzu giriniz: ");
        b=input.nextInt();
        System.out.print("\nİngilizce notunuzu giriniz: ");
        i=input.nextInt();
        System.out.print("\nTürkçe notunuzu giriniz: ");
        t=input.nextInt();
        ort=((f+k+m+b+i+t)/6);
        boolean kosul=(ort>=60);
        System.out.println("\nÖğrenci Ortalaması: "+ort+"\n");
        String st=kosul ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.print(st);


        /*    int n=5,m=1,l=5;
        boolean kosul1=(n==l);
        boolean kosul2=(n>=m);
        boolean sonuc1=(kosul1 && kosul2);
        boolean sonuc2=((n==m) && (n<=m));
        System.out.println(kosul1);
        System.out.println(kosul2);
        System.out.println(sonuc1);
        System.out.println(sonuc2);

        String stl= n==l ? "Enes":"Ahmet";
*/
    }
}