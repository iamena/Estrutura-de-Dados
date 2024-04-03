public class BuscaLinear{
    public static String buscaLinear(String[] friends, String objetivo) {
        for (int i = 0; i < friends.length; i++) {
            if (friends[i] == objetivo) {
                return String.valueOf(i);

            }
        }
        return String.valueOf(-1);

    }
    public static void main(String[] args) {
        String[] friends = {"Mother" , "God", "Boyfriend", "classromates"} ;

        String objetivo = "Boyfriend";
        String indice = buscaLinear(friends, objetivo);
        if(indice != objetivo){
            System.out.println("O objetivo "+objetivo+" foi encontrado no índice: "+indice);
        }
        else {
            System.out.println("O objetivo "+objetivo+" não foi encontrado");
        }
    }
}
