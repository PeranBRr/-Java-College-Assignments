public class Ex8{
    private static void impares(){
        int i,retorno;
        
        for(i = 200; i >= 100; i--){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String [] args){
        impares();
        
    }
}