import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PilhaseFilas{
    public static void main(String[] args){
        //Fila
        Queue<String> carros = new LinkedList<>();

        carros.add("Fiat Pálio");

        carros.add("Peugeot");

        carros.add("Honda Civic");

        carros.add("Fiat Uno");


        System.out.println(carros.poll());

        System.out.println(carros);

        System.out.println(carros.peek());

        System.out.println(carros.isEmpty());

        //Pilha
        Stack<String> carros2 = new Stack<>();

        carros2.push("Nissan GT-R 35");

        carros2.push("Toyota Supra");

        carros2.push("Ferrari FXXK");

        carros2.push("Ferrari 296 GTB");


        System.out.println(carros2.pop());

        System.out.println(carros2);

        System.out.println(carros2.peek());

        System.out.println(carros2.empty());
    }
}