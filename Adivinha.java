import java.util.Random;
import java.util.Scanner;

class Adivinha {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num = random.nextInt(0, 101);
        int tentativa = 0;
        int nTentativas = 0;

        do {
            nTentativas++;
            System.out.print("Digite um número de 0 a 100: ");
            tentativa = scanner.nextInt();
            if(tentativa < num) {
                System.out.println("O número está para cima!");
            } else if (tentativa > num) {
                System.out.println("O número está para baixo!");
            }
        } while(tentativa != num);
        
        System.out.println("\nParabéns! Você ganhou o jogo.");
        System.out.println("Número de tentativas: "+nTentativas);
        System.out.println("Número acertado: "+num);
        
        scanner.close();
    }
}