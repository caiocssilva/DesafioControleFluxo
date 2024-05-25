import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            // Solicita o primeiro parâmetro ao usuário
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();

            // Solicita o segundo parâmetro ao usuário
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException e) {
                // Imprime a mensagem de exceção se os parâmetros forem inválidos
                System.out.println(e.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o segundo parâmetro é maior que o primeiro
        if (parametroUm >= parametroDois) {
            // Lança uma exceção se os parâmetros forem inválidos
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Calcula a contagem de números entre os parâmetros
        int contagem = parametroDois - parametroUm;
        // Realiza um loop para imprimir os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

// Classe de exceção customizada para parâmetros inválidos
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}