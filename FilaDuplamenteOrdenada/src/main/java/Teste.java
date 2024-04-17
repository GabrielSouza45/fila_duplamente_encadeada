public class Teste {

    public static void main(String[] args) throws Exception {


        Fila<String> fila = new Fila<>();
        fila.adicionar(new No<>("Gabriel"));
        fila.adicionar(new No<>("Debora"));
        fila.adicionar(new No<>("Everton"));
        fila.adicionar(new No<>("Sofia"));
        fila.adicionar(new No<>("Vazio"));

        System.out.println(fila);

        fila.avancarFila();

        System.out.println(fila);

        fila.remover(3);

        System.out.println(fila);
        System.out.println(fila.getInicio());
        System.out.println(fila.getFim());
        System.out.println(fila.getTamanho());

        System.out.println();
        System.out.println(fila.espiar(3));
        System.out.println(fila.procurar("Everton"));
    }

}
