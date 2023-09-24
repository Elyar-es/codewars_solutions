import java.util.Objects;
    

    class Lcs {

        static String lcs(String a, String b) {
            int i = a.length();
            int j = b.length();
            String[] x = a.split("");
            String[] y = b.split("");
            return backtrack(LCStable(x, y), x, y, i, j);
        }
        
        static String backtrack(int[][] c, String[] x, String[] y, int i, int j) {
            if (i==0 || j==0){
                return "";
            }
            if (Objects.equals(x[i - 1], y[j - 1])){
                return backtrack(c, x, y, i-1, j-1) + x[i-1];
            }
            if (c[i][j-1] > c[i-1][j]){
                return backtrack(c, x, y, i, j-1);
            }
            return backtrack(c, x, y, i-1, j);
        }
        static int[][] LCStable(String[] X, String[] Y){
            int m = X.length;
            int n = Y.length;
            int[][] C = new int[m+1][n+1];
            for(int i=0;i<=m;i++){
                C[i][0] = 0;
            }
            for(int j=0;j<=n;j++){
                C[0][j] = 0;
            }
            for(int i=0;i<=m;i++){
                for(int j=0;j<=n;j++){
                    if (i>=1 && j>=1) {
                        if (Objects.equals(X[i-1], Y[j-1])) {
                            C[i][j] = C[i - 1][j - 1]+1;
                        } else {
                            C[i][j] = Math.max(C[i][j - 1],C[i - 1][j]);
                        }
                    }
                }
            }
            return C;
        }
    }

