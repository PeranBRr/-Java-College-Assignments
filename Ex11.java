import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o tamanho dos vetores: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        
        System.out.println("Digite os elementos do vetor x:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        
        System.out.println("Digite os elementos do vetor y:");
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }
        
        int produtoEscalar = 0;
        for (int i = 0; i < n; i++) {
            produtoEscalar += x[i] * y[i];
        }
        
        System.out.println("Produto escalar: " + produtoEscalar);
    }
}