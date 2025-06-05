import java.util.Scanner;

public class DispositivoTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DispositivoEletronico smartphone = new Smartphone();
        DispositivoEletronico tv = new Televisao();

        System.out.println("Escolha o dispositivo:");
        System.out.println("1 - Smartphone");
        System.out.println("2 - Televisão");
        int escolha = scanner.nextInt();

        System.out.println("1 - Ligar");
        System.out.println("2 - Desligar");
        int acao = scanner.nextInt();

        if (escolha == 1) {
            if (acao == 1) smartphone.ligar();
            else smartphone.desligar();
        } else if (escolha == 2) {
            if (acao == 1) tv.ligar();
            else tv.desligar();
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
