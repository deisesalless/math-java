public class Main {
    public static void main(String[] args) {
        // Exemplos de utilização dos métodos da classe Math e operações básicas
        double x = 45.67;
        double y = -12.34;

        // Potenciação
        System.out.println("2 elevado à potência de 5: " + Math.pow(2, 5));

        // Raiz quadrada
        System.out.println("Raiz quadrada de " + x + ": " + Math.sqrt(x));

        // Valor absoluto
        System.out.println("Valor absoluto de " + y + ": " + Math.abs(y));

        // Máximo e Mínimo
        System.out.println("Máximo entre " + x + " e " + y + ": " + Math.max(x, y));
        System.out.println("Mínimo entre " + x + " e " + y + ": " + Math.min(x, y));

        // Arredondamentos
        System.out.println("Arredonda " + x + " para o inteiro mais próximo: " + Math.round(x));
        System.out.println("Arredonda " + x + " para cima: " + Math.ceil(x));
        System.out.println("Arredonda " + x + " para baixo: " + Math.floor(x));

        // Arredondamento com precisão decimal (exemplo: arredondar para 2 casas decimais)
        double arredondado = Math.round(x * 100.0) / 100.0;
        System.out.println("Arredondado " + x + " para 2 casas decimais: " + arredondado);
    }
}