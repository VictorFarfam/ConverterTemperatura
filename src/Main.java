import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Linha para receber dados de input do usuario
        System.out.println("Digite a temperatura em Celcius: ");
        double celsius = scanner.nextDouble();
        scanner.close();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius+ " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit");
    }
}