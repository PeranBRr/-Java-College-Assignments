                                                                                                                                                                                                                                                     import java.util.Scanner;
public class Ex2{
    private static int converter(int C){
        int F;
        F = (9 * C + 160) / 5;
        return F;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int C, F;
        
        System.out.format("Insira a temperatura em graus Celsius: %n");
        C = sc.nextInt();
        F= converter(C);

        System.out.format("Temperatura em Celsius: %d%nTemperatura em Fahrenheit: %d", C, F);
    }
}