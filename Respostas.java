import java.util.Scanner;

public class Respostas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int questao;

        do {
            System.out.println("Digite o n�mero da quest�o (1 a 5) para visualizar sua respectiva resposta ou digite 0 para sair:");
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
                    System.out.println("Quest�o inv�lida! Tente novamente.");
                    break;
            }

        } while (questao != 0);

        scanner.close();
    }

    // Quest�o 1: Verificar se um n�mero pertence � sequ�ncia de Fibonacci
    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um n�mero para verificar se ele pertence � sequ�ncia de Fibonacci:");
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
            System.out.println(num + " pertence � sequ�ncia de Fibonacci.");
        } else {
            System.out.println(num + " n�o pertence � sequ�ncia de Fibonacci.");
        }
    }

    // Quest�o 2: Verificar exist�ncia da letra 'a' (mai�scula ou min�scula) em uma string
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
            System.out.println("A letra 'a' n�o aparece na string.");
        }
    }

    // Quest�o 3: Calcular o valor final da vari�vel SOMA
    public static void somaIndice() {
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor da vari�vel SOMA �: " + SOMA);
    }

    // Quest�o 4: Completar as sequ�ncias l�gicas
    public static void completarSequencia() {
        System.out.println("Sequ�ncias l�gicas:");
        System.out.println("a) 1, 3, 5, 7 -> 9");
        System.out.println("b) 2, 4, 8, 16, 32, 64 -> 128");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36 -> 49");
        System.out.println("d) 4, 16, 36, 64 -> 100");
        System.out.println("e) 1, 1, 2, 3, 5, 8 -> 13");
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19 -> 200");
    }

    // Quest�o 5: Solu��o do problema dos interruptores
    public static void interruptores() {
        System.out.println("Solu��o do problema dos interruptores:");
        System.out.println("1. Ligue o primeiro interruptor e deixe-o ligado por um tempo.");
        System.out.println("2. Desligue o primeiro e ligue o segundo interruptor.");
        System.out.println("3. V� at� a sala das l�mpadas.");
        System.out.println(" - A l�mpada acesa corresponde ao segundo interruptor.");
        System.out.println(" - A l�mpada apagada que est� quente corresponde ao primeiro interruptor.");
        System.out.println(" - A l�mpada apagada e fria corresponde ao terceiro interruptor.");
    }
}
