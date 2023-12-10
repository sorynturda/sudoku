package sudoku.table;


import java.util.ArrayList;
import java.util.Collections;

public class GenerateTable {
    protected int[][] a;
    protected static boolean finished;
    protected static final int dimension = 9;
    protected static final int numberOfCells = dimension * dimension;
    protected static final int maxCandidates = dimension + 1;
    protected int input;
    public GenerateTable() {
        a = new int[9][9];
        ArrayList<Integer> line = new ArrayList<>();
        for (int i = 1; i < 10; i++)
            line.add(i);
        Collections.shuffle(line);
        int r = (int) (Math.random() * 10) % 10;
        for (int i = 0; i < 9; i++)
            a[r][i] = line.get(i);

    }

    public void showTable() {
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
