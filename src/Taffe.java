public class Taffe {

    public int numeracao;

    public String versao;

    public int posicaoAtual;

    public String dizerOi(){
        return "Oi pessoal";
    }
    public void falar(String oqueFalar){
        System.out.println(oqueFalar);
    }

   public void andar (int quantidadePassos, boolean paraFrente) {

       for (int i = 1; i <= quantidadePassos; i++) {
           System.out.println("Passo " + i);

           if (paraFrente == true) {
               posicaoAtual += quantidadePassos;
           } else if (paraFrente == false) {
               posicaoAtual -= quantidadePassos;
           }

       }
   }

   public void retornarPosicao() {
       System.out.println("Minha posição é " + posicaoAtual);
   }



    //andar
    //falar
    //dizer oi
    //mandar mensagem bravo
    //limpar casa
    //cantar musica
    //mudar idioma
}
