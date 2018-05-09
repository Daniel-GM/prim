package prim;

import java.util.ArrayList;

public class Prim {

    public int[][] prim(int grafo[][]) {
        ArrayList<Boolean> vertices = new ArrayList<Boolean>();
        ArrayList<Integer> relativa = new ArrayList<Integer>();
        ArrayList<Integer> vizinhos = new ArrayList<Integer>();

        for (int i = 0; i < grafo[0].length; i++) {
            vertices.add(false);
            vizinhos.add(0);
            relativa.add(99);
        }

        relativa.set(0, new Integer(0));
        int avaliado = 0;

        for (int i = 0; i < grafo[0].length; i++) { //contador avaliado
            for (int j = 0; j < grafo[0].length; j++) { //contador vizinho

                if ((vertices.get(j)) || (j == avaliado)) {
                    continue;
                }
                if (grafo[avaliado][j] < 99 && ((grafo[avaliado][j] < relativa.get(j)))) {
                    relativa.set(j, grafo[avaliado][j]);
                    vizinhos.set(j, avaliado);
                }
            }

            vertices.set(avaliado, true);
            avaliado = new Integer(0);

            Integer comparacao = new Integer(Integer.MAX_VALUE);

            for (int j = 0; j < vertices.size(); j++) {
                if (vertices.get(j)) {
                    continue;
                }
                if (relativa.get(j) < comparacao) {
                    comparacao = relativa.get(j);
                    avaliado = j;
                }
            }
        }

        int[][] resposta = new int[grafo[0].length][grafo[0].length];
        
        for (int i = 0; i < grafo[0].length; i++) {
            for (int j = 0; j < grafo[0].length; j++) {
                resposta[i][j] = 99;
            }
        }
        
        for (int i = 1; i < vizinhos.size(); i++) {
            resposta[i][vizinhos.get(i)] = grafo[i][vizinhos.get(i)];
            resposta[vizinhos.get(i)][i] = resposta[i][vizinhos.get(i)];
        }

        return resposta;
    }
}