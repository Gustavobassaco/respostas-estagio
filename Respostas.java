import java.util.Scanner;

public class Respostas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int questao;

        do {
            System.out.println("Digite o número da questão (1 a 5) para visualizar sua respectiva resposta ou digite 0 para sair:");
            questao = scanner.nextInt();

            switch (questao) {
                case 1:
                    fibonacci();
                    break;
                case 2:
                    verificarLetraA();
                    break;
                case 3:
                    somaIndice();
                    break;
                case 4:
                    completarSequencia();
                    break;
                case 5:
                    interruptores();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Questão inválida! Tente novamente.");
                    break;
            }

        } while (questao != 0);

        scanner.close();
    }

    // Questão 1: Verificar se um número pertence à sequência de Fibonacci
    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número para verificar se ele pertence à sequência de Fibonacci:");
        int num = scanner.nextInt();

        int a = 0, b = 1, soma;
        boolean pertence = false;

        if (num == a || num == b) {
            pertence = true;
        } else {
            while (b <= num) {
                soma = a + b;
                a = b;
                b = soma;
                if (num == b) {
                    pertence = true;
                    break;
                }
            }
        }

        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }

    // Questão 2: Verificar existência da letra 'a' (maiúscula ou minúscula) em uma string
    public static void verificarLetraA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma string:");
        String str = scanner.nextLine();

        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }

    // Questão 3: Calcular o valor final da variável SOMA
    public static void somaIndice() {
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor da variável SOMA é: " + SOMA);
    }

    // Questão 4: Completar as sequências lógicas
    public static void completarSequencia() {
        System.out.println("Sequências lógicas:");
        System.out.println("a) 1, 3, 5, 7 -> 9");
        System.out.println("b) 2, 4, 8, 16, 32, 64 -> 128");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36 -> 49");
        System.out.println("d) 4, 16, 36, 64 -> 100");
        System.out.println("e) 1, 1, 2, 3, 5, 8 -> 13");
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19 -> 200");
    }

    // Questão 5: Solução do problema dos interruptores
    public static void interruptores() {
        System.out.println("Solução do problema dos interruptores:");
        System.out.println("1. Ligue o primeiro interruptor e deixe-o ligado por um tempo.");
        System.out.println("2. Desligue o primeiro e ligue o segundo interruptor.");
        System.out.println("3. Vá até a sala das lâmpadas.");
        System.out.println(" - A lâmpada acesa corresponde ao segundo interruptor.");
        System.out.println(" - A lâmpada apagada que está quente corresponde ao primeiro interruptor.");
        System.out.println(" - A lâmpada apagada e fria corresponde ao terceiro interruptor.");
    }
}
