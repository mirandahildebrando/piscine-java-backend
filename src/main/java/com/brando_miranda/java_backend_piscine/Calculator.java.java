

import java.util.Scanner;

public class Main {

    public static double calcular(double num1, double num2, String operacao) throws OperacaoInvalidaException {

        switch (operacao) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new OperacaoInvalidaException("Divisão por zero não é permitida.");
                }
                return num1 / num2;
                default: 
                    throw new OperacaoInvalidaException("Operação inválida: " + operacao);
            
        }
    
    }
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Digite o primeiro número: ");
    double num1 = scanner.nextDouble();

    System.out.print("Digite o segundo número: ");
    double num2 = scanner.nextDouble();

    System.out.print("Digite a operação (+, -, *, /): ");
    String operacao = scanner.next();
        double resultado = calcular(num1, num2, operacao);
        System.out.println("Resultado: " + resultado);
    } catch (OperacaoInvalidaException e) {
        System.out.println("Erro: " + e.getMessage());
    } finally {

    scanner.close();
    }
    
    }
}