public class Main {
    public static void main(String[] args) {
        Taffe taffe = new Taffe();
        String fala = taffe.dizerOi();
        System.out.println(fala);
        taffe.dizerOi();

        taffe.falar("Grêmio melhor que inter.");
        taffe.falar("Aprendendo Classes em java");

        taffe.andar(10,true );
        taffe.andar(10, true);
        taffe.andar(10, false);
        taffe.retornarPosicao();




    }
}