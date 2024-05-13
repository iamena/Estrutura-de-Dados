
//import java.util.ArrayList;
//import java.util.List;
//
//public class ListaSimples {
//    public  static void main (String[] args) {
//
//        List<String> myfamily= new ArrayList<>()
//        {{
//            add("Me");
//            add("My Father");
//            add("My Mother");
//            add("My Uncle");
//            add("My Pet, Ninho");
//        }};
//
//        System.out.println("This is my family:");
//        System.out.println(myfamily);
//
//        System.out.println(myfamily.get(4));
//        System.out.println("he is my favorite member.");
//    }
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaSimples {
    public static void main(String[] args){

        List<String> nome = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<3; i++){
            System.out.println("*Digite o nome do aluno:");
            nome.add(sc.nextLine());
        }
        List<Integer> matricula = new ArrayList<>();
        for (int a = 0; a<3; a++){
            System.out.println("*Digite a matricula do aluno");
            nome.add(sc.nextLine());
    }
}