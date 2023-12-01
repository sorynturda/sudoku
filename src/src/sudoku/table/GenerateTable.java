package sudoku.table;

public class GenerateTable {
    private int[][] a;

    public GenerateTable() {
        a = new int[9][9];
        for (int i = 0; i < 9; i++) { //genereaza un rand aleator si afla solutia => asa faci un puzzle sudoku
            int num = getNubmber();
            while (!checkLine(0, num) || !checkColumn(i, num))
                num = getNubmber();
            a[0][i] = num;
        }
    }

    private boolean checkColumn(int column, int num) {
        for (int i = 0; i < 9; i++)
            if (a[i][column] == num)
                return false;
        return true;
    }

    private boolean checkLine(int line, int num) {
        for (int i = 0; i < 9; i++)
            if (a[line][i] == num)
                return false;
        return true;
    }

    private int getNubmber() {
        return (int) (Math.random() * 10) % 9 + 1;
    }

    public void showTable() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
