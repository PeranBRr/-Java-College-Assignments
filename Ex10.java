import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o tamanho da sequência: ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        
        System.out.println("Digite os números da sequência:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }
        
        System.out.println("Sequência na ordem inversa:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}