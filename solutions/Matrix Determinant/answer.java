public class Matrix {

        public static int determinant(int[][] Matrix) {
            int n = Matrix.length;
            if (n == 1){
                return Matrix[0][0];
            }
            int ans = 0;
            for (int z=0; z<n; z++) {
                ans += (z%2 == 0? 1 : -1) * (Matrix[z][0]) * determinant(matCreater(Matrix, z));
            }
            return ans;
        }

        public static int[][] matCreater(int[][] mat, int y){
            int n = mat.length;
            int[][] newMat = new int[n-1][n-1];
            int a=0, b=0;
            for (int j=0; j<n; j++) {
                if (j != 0) {
                    for (int i=0; i<n; i++) {
                        if (i != y) {
                            newMat[a][b] = mat[i][j];
                            a++;
                        }
                    }
                    a = 0;
                    b++;
                }
            }
            return newMat;
        }
        
    }
