import java.util.Scanner;

public class Ex1 {
    private static int calculo_distancia(int tempo, int velocidade_media) {
        return tempo * velocidade_media;
    }
    
    private static double calculo_litros(int distancia) {
        return distancia / 12.0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o tempo da viagem (horas): ");
        int tempo = sc.nextInt();
        
        System.out.println("Insira a velocidade média (km/h): ");
        int velocidade_media = sc.nextInt();
        
        int distancia = calculo_distancia(tempo, velocidade_media);
        double litros = calculo_litros(distancia);    
        
        System.out.println("\nResultados da viagem:");
        System.out.println("Velocidade média: " + velocidade_media + " km/h");
        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.printf("Litros usados: %.2f litros%n", litros);
    } 
}