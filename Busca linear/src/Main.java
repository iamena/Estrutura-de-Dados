public class Main{
    public static void main(String[] args){

        double[][] boletim = new double[3][2];

        boletim[0][0]= 10;
        boletim[0][1]= 10;
        boletim[1][0]= 9;
        boletim[1][1]= 9.5;
        boletim[2][0]= 10;
        boletim[2][1]= 10;

        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 2; b++) {
                System.out.println(boletim[a][b]);
            }
        }


        String[] myhouse = new String[5];

        myhouse[0]= "Amenaídes";
        myhouse[1]= "Luana";
        myhouse[2]= "Assis";
        myhouse[3]= "Aristofo";
        myhouse[4]= "Ninho";

        for (String s : myhouse) {
            System.out.println(s);
        }

    }
}


/* outra aula dia 01.04.2024 */

