import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int x, maiores = 0, menores = 0, iguais = 0;

        System.out.println("Digite os 10 números do vetor:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite o número X: ");
        x = sc.nextInt();

        for (int num : vetor) {
            if (num > x) {
                maiores++;
            } else if (num < x) {
                menores++;
            } else {
                iguais++;
            }
        }

        System.out.println("Quantidade de números:");
        System.out.println("Maiores que X: " + maiores);
        System.out.println("Menores que X: " + menores);
        System.out.println("Iguais a X: " + iguais);
    }
}