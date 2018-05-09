package prim;

public class Grafo {

    public static void main(String[] args) {
        int grafo1[][] = {
            //     1   2   3   4   5   6
            /*1*/{99, 1, 3, 99, 99, 99},
            /*2*/ {1, 99, 1, 2, 3, 99},
            /*3*/ {3, 1, 99, 99, 2, 99},
            /*4*/ {99, 2, 99, 99, -3, 3},
            /*5*/ {99, 3, 2, -3, 99, 2},
            /*6*/ {99, 99, 99, 3, 2, 99}};

        Prim prim1 = new Prim();

        int[][] resultado1 = prim1.prim(grafo1);

        System.out.println("grafo 1");
        for (int i = 0; i < resultado1[0].length; i++) {
            for (int j = 0; j < resultado1[0].length; j++) {
                if (resultado1[i][j] == 99) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print(resultado1[i][j] + " ");
                }
            }
            System.out.println("");
        }

        int grafo2[][] = {
            //     1   2   3   4   5   6   7   8   9  10 
            /*1*/{99, 11, 1, 14, 99, 99, 99, 99, 99, 99,},
            /*2*/ {11, 99, 10, 99, 6, 8, 99, 99, 99, 99,},
            /*3*/ {1, 10, 99, 7, 99, 7, 99, 99, 99, 99,},
            /*4*/ {14, 99, 7, 99, 99, 9, 6, 99, 99, 99,},
            /*5*/ {99, 6, 99, 99, 99, 5, 99, 3, 99, 99,},
            /*6*/ {99, 8, 7, 9, 5, 99, 2, 6, 5, 99,},
            /*7*/ {99, 99, 99, 6, 99, 2, 99, 99, 99, 3,},
            /*8*/ {99, 99, 99, 99, 3, 6, 99, 99, 1, 99,},
            /*9*/ {99, 99, 99, 99, 99, 5, 99, 1, 99, 4,},
            /*10*/ {99, 99, 99, 99, 99, 99, 3, 99, 4, 99,},};

        Prim prim2 = new Prim();

        int[][] resultado2 = prim2.prim(grafo2);

        System.out.println("\ngrafo 2");
        for (int i = 0; i < resultado2[0].length; i++) {
            for (int j = 0; j < resultado2[0].length; j++) {
                if (resultado2[i][j] == 99) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print(resultado2[i][j] + " ");
                }
            }
            System.out.println("");
        }

        int grafo3[][] = {
            //     a   b   c   d   e   f   g   h   i   j   k   l   m
            /*a*/ {99,  5, 99, 99, 99, 99,  1,  3, 99, 99, 99, 99, 99,},
            /*b*/ { 5, 99,  1, 99, 99,  4,  1, 99, 99, 99, 99, 99, 99,},
            /*c*/ {99,  1, 99,  7, 99,  2, 99, 99, 99, 99, 99, 99, 99,},
            /*d*/ {99, 99,  7, 99,  2,  6, 99, 99, 99, 99, 99, 99, 99,},
            /*e*/ {99, 99, 99,  2, 99,  7, 99, 99, 99,  3, 99, 99, 99,},
            /*f*/ {99,  4,  2,  6,  7, 99,  1, 99,  2,  3, 99, 99, 99,},
            /*g*/ { 1,  1, 99, 99, 99,  1, 99,  6,  5, 99, 99, 99, 99,},
            /*h*/ { 3, 99, 99, 99, 99, 99,  6, 99,  4, 99,  8, 99, 99,},
            /*i*/ {99, 99, 99, 99, 99,  2,  5,  4, 99,  8,  7,  4, 99,},
            /*j*/ {99, 99, 99, 99,  3,  3, 99, 99,  8, 99, 99,  3,  4,},
            /*k*/ {99, 99, 99, 99, 99, 99, 99,  8,  7, 99, 99,  2, 99,},
            /*l*/ {99, 99, 99, 99, 99, 99, 99, 99,  4,  3, 2, 99,  3,},
            /*m*/ {99, 99, 99, 99, 99, 99, 99, 99, 99,  4, 99, 3, 99,},};
            
        Prim prim3 = new Prim();

        int[][] resultado3 = prim3.prim(grafo3);

        System.out.println("\ngrafo 3");
        for (int i = 0; i < resultado3[0].length; i++) {
            for (int j = 0; j < resultado3[0].length; j++) {
                if (resultado3[i][j] == 99) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print(resultado3[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}