package exercicio;

public class Cronometro {
    public static void main(String[] args) throws InterruptedException {
        
        for (int segundos = 0; segundos <= 60; segundos++) {
            System.out.println("Cronômetro: " + segundos + " segundos");

            
            Thread.sleep(1000);
        }
        
        System.out.println("Tempo esgotado!");
    }
}
