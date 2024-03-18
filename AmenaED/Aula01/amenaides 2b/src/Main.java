import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        String[] nomes = new String[10];
        nomes[0] = "amitay";
        nomes[1] = "amenaídes";
        nomes[2] = "malu";
        nomes[3] = "carlos";
        nomes[4] = "ginaldo";
        nomes[5] = "clara";
        nomes[6] = "paulo";
        nomes[7] = "rodrigues";
        nomes[8] = "vitu";
        nomes[9] = "fernanda";

        Double[] notas = new Double[10];
        notas[0] = 10.0;
        notas[1] = 10.0;
        notas[2] = 8.3;
        notas[3] = 5.7;
        notas[4] = 9.0;
        notas[5] = 7.0;
        notas[6] = 2.0;
        notas[7] = 4.4;
        notas[8] = 5.5;
        notas[9] = 7.5;
        for (int i = 0; i <= 9; i++ ) {
            System.out.println("O aluno "+nomes[i] +" teve nota: "+ notas[i]);
        }
    }
}