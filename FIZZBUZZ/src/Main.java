import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("sayi giriniz:");
    int x = new Scanner(System.in).nextInt();
    if (x%5==0 && x%3==0)
        System.out.println("FIZZBUZZ");
        else if (x%3 ==0)
        System.out.println("BUZZ");
        else if (x % 5== 0)
        System.out.println("FIZZ");
        else
            System.out.println(x);
/*programda bir yerde yanlislik var nerde 15 yaziyorum ama
fizzbuzz yerine sadece fizz yazior ve aslinda program hakli
15 5 e bolunuyor ama 3 e de bolunuyor neden ikisini bir almadi
bakalim bu gibi durumlarda en spesifik ve en genel kosullari en ust siraya
koymamiz gerekli
 */
    }
}