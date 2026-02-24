import java.util.Scanner;
public class SumaNumeroDado {
    public static void main(String[] args) {
        int suma=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            suma+=i;
        }
        System.out.println(suma);
        System.out.println();
        System.out.println("Con formula: ");

        System.out.println((num*(num+1)/2));
    }
}