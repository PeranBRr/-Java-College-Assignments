import java.util.Scanner;

public class Ex6{
    private static String posOrNeg(int num){
    String resp;
    if(num > 0){
        resp = "Positivo!\n";
    }
    else if(num < 0){
        resp = "Negativo!\n";
    }
    else{
        resp = "Zero!\n";
    }
    return resp;
    }
    
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num, check, check2;
    String resposta;
    
    check = 1;
    
    while(check == 1){
        System.out.println("O que deseja fazer?\n1. Analisar\n2. Fechar o programa\n");
        check2 = sc.nextInt();
        
        switch(check2){
            case 1: 
                System.out.println("Insira o número a ser analisado: \n");
                num = sc.nextInt();
        
                resposta = posOrNeg(num);
                System.out.format("O número é %s\n", resposta);
                break;
                
            case 2:
                System.out.println("Fechando...\n");
                check = 0;
                break;
                
            default:
                System.out.println("Insira uma opção válida!\n");
                break;
        }  
        }      
    }
}