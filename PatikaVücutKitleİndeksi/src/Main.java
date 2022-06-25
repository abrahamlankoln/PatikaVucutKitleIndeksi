import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double boy,kilo,VKI;
		Scanner deger = new Scanner(System.in);
		System.out.print("lutfen kilonuzu kilogram cinsinden giriniz: ");
		kilo=deger.nextDouble();
		System.out.print("lutfen boyunuzu metre cinsinden giriniz: ");
		boy= deger.nextDouble();
		VKI=kilo/boy*boy;
		System.out.print("vucut kitle indeksiniz: "+VKI);
	}

}
