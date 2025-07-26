import java.util.Scanner;
public class Ex3{
    private static int modulo(int num1){
    int modulo;   
    
    if (num1 >= 0){
    modulo = num1;
    }
    
    else{
    modulo = num1 * -1;
    }
    
    return modulo;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num1, resultado;
    
    System.out.println("Insira o número inteiro: ");
    num1 = sc.nextInt();
    
    resultado = modulo(num1);
    
    System.out.format("O módulo de %d é %d", num1, resultado);
    }
}