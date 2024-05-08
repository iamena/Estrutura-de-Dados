import java.util.ArrayList;
import java.util.List;

public class MyFavoriteTeachers {

     public static void main(String[] args) {

          List <String> lista = new ArrayList<>()
          {{
               // adcionando elementos

               add("Cassiano");
               add("Thaíse");
               add("Edineide");
               add("Everton");
               add("Jonas");
               add("Aniedja");

          }};
          System.out.println("Essa é a lista dos professores favoritos:");
          System.out.println(lista);

          // buscando elementos

          System.out.println("Esses é o elemento da posição 0 ");

          System.out.println(lista.get(0));

          // removendo elementos com o indice

          System.out.println("Essa é a lista sem o elemento da posição 0 e ");

          lista.remove(0);


          System.out.println(lista);

          // substituindo um elemento por outro (usando set)

          lista.set(2, "João Paulo");

          System.out.println( lista);

          // descobri que nao da pra ter duas funções de remove em sequência

          System.out.println( "Não dá pra tirar dois elementos sem intervalos, por isso fiz essa outra impressão de teste");
          
          lista.remove(3);

          System.out.println(lista);






     }
}

