public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Soma: " + somarValores(num1, num2));
        System.out.println("Subtração: " + subtrairValores(num1, num2));
        System.out.println("Multiplicação: " + multiplicarValores(num1, num2));
        System.out.println("Divisão: " + dividirValores(num1, num2));

    }
    public static int somarValores(int x, int y){
        return x + y;
    };
    public static int subtrairValores(int x, int y){
        return x - y;
    };
    public static int multiplicarValores(int x, int y){
        return x*y;
    };
    public static int dividirValores(int x, int y){

        if (x > y){
            return x / y;
        }else{
            return y / x;
        }
    };

}