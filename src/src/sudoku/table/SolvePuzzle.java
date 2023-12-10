package sudoku.table;

public class SolvePuzzle extends GenerateTable{


    public void solve(int[] a, int k){
        int []c = new int[maxCandidates];
        int nc=1;
        if(isASolution(a,k))
            processSolution(a,k);
        else{
            constructCandidates(a,k+1, c, nc);
            for(int i=0;i<nc;i++){
                a[k+1]=c[i];
                makeMove(a,k+1);
                solve(a,k+1);
                unmakeMove(a,k+1);

                if(finished)
                    return;
            }
        }
    }

    private void processSolution(int[] a, int k) {
    }

    private void constructCandidates(int[] a, int i, int[] c, int nc) {
        boolean []possible = new boolean[maxCandidates];

    }

    private void unmakeMove(int[] a, int k) {
    }

    private void makeMove(int[] a, int k) {
    }

    private boolean isASolution(int[] a, int k) {
    }
}
