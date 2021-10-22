package ba.unsa.etf.rpr;
import java.util.Scanner;

public class SumaCifara {
    public static int sumaCifara(int n){
        int sumacifara = 0;
        while(n!=0){
            int cifra = Math.abs(n%10);
            sumacifara = sumacifara + cifra;
            n = n/10;
        }
        return sumacifara;
    }

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n = ulaz.nextInt();
        for(int i = 1; i<=n; i++){
            if((i%sumaCifara(i))==0) System.out.print(i + " ");
        }
    }
}
