public class busca {

    public static int buscaLinear(int a[], int objetivo) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == objetivo) {
                return i;

            }
        }
        return -1;

    }
}

