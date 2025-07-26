import java.util.Scanner;
import java.util.ArrayList;
public class Ex9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        int numeral, escaneado, par, impar;
        boolean check;
        
        par = 0;
        impar = 0;
        numeral = 1;
        check = true;
        
        while(check == true){
            System.out.format("Insira o número %d: ", numeral);
            escaneado = sc.nextInt();
            if(escaneado < 0){
                check = false;
            }
            else{
                numeral++;
                listaNumeros.add(escaneado);
                if (escaneado % 2 == 0){
                par += escaneado;
                }
                else{
                impar += escaneado;
                }
            }    
        }
        System.out.format("Lista dos números: %s%n", listaNumeros);
        System.out.format("Soma números pares: %d%n", par);
        System.out.format("Soma números ímpares: %d%n", impar);
        
        sc.close();
    }
}