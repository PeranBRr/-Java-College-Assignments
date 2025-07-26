import java.util.Scanner;
public class Ex4{
    private static String checagem(int CODIGO){
    String resposta;
    switch (CODIGO){
    case 1:
        resposta = "um";
        break;
    case 2:
        resposta = "dois";
        break;
    case 3:
        resposta = "três";
        break;
    default:
        resposta = "Código Inválido";
        break;
        
    }
    return resposta;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int CODIGO;
    String retornado;
    
    System.out.println("Insira o Código: ");
    CODIGO = sc.nextInt();
    
    retornado = checagem(CODIGO);
    System.out.format("O código é: %s", retornado);    
    }
}