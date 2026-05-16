public class sistemaRh {
    /**
     * @author Joao Pedro Sapalacio
     */

    public static void main(String[] args) {
        String[] nomes = { "Carlos", "Ana", "Bruno", "Diana", "Alice" };

        int n = nomes.length;

        System.out.println("Antes de ordenar:");
        for (int i = 0; i < n; i++) {
            System.out.println(nomes[i]);
        }

        for (int i = 0; i < n - 1; i++) {

            int indiceMenor = i;

            for (int j = i + 1; j < n; j++) {

                if (nomes[j].compareTo(nomes[indiceMenor]) < 0) {
                    indiceMenor = j;
                }
            }

            if (indiceMenor != i) {
                String temp = nomes[i];
                nomes[i] = nomes[indiceMenor];
                nomes[indiceMenor] = temp;
            }
        }

        System.out.println("Depois de ordenar:");
        for (int i = 0; i < n; i++) {
            System.out.println(nomes[i]);
        }
    }
}