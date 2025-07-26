import java.util.Scanner;
public class Ex5{    
    public static String checagem(int A, int B, int C){
    String triangulo;
    if (A < B + C && B < A + C && C < A + B) {
        if (A == B && B == C) {
            triangulo = "equilátero";
        } else if (A == B || A == C || B == C) {
            triangulo = "isósceles";
        } else {
            triangulo = "escaleno";
        }
    } else {
        triangulo = "Não se caracteriza como triângulo";
    }

    return triangulo;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int A, B, C;
    String checado; 
    
    System.out.println("Insira o primeiro lado do triangulo: ");
    A= sc.nextInt();
    
    System.out.println("Insira o segundo lado do triangulo: ");
    B= sc.nextInt();
    
    System.out.println("Insira o terceiro lado do triangulo: ");
    C= sc.nextInt();
    
    checado = checagem(A, B, C);
    
    System.out.format("O triangulo: %s", checado);
        
    }
}