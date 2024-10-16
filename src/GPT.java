
public class GPT {
    public static void main(String[] args) {
        double temperatura = 100;
        char escala = 'C'; // 'C' para Celsius ou 'F' para Fahrenheit
        converterTemperatura(temperatura, escala);
    }

    public static void converterTemperatura(double temp, char escala){
        double temperaturaConvertida = 0;
        if (escala == 'C') {
            temperaturaConvertida = (temp * 9/5) + 32;
            System.out.println(temp + " graus Celsius é igual a " + temperaturaConvertida + " graus Fahrenheit.");
        } else if (escala == 'F') {
            temperaturaConvertida = (temp - 32) * 5/9;
            System.out.println(temp + " graus Fahrenheit é igual a " + temperaturaConvertida + " graus Celsius.");
        } else {
            System.out.println("Escala de temperatura inválida.");
        }
    }
}