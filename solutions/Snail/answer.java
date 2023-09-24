  public class Snail {

        public static int[] snail(int[][] array) {
            int len = array.length;
            if(array[0].length <= 0) {
                return new int[0];
            }
            String str = len % 2 == 0 ? Snail.mapit(array, len, 0, 0, 0) : Snail.mapit(array, len, 0, 0, 0) + array[len/2][len/2];
            String[] strer = str.split(" ");
            int[] narr = new int[strer.length];
            for (int i=0; i<strer.length; i++) {
                narr[i] = Integer.parseInt(strer[i]);
            }
            return narr;
        }
        public static String mapit(int[][] array, int n, int t, int i, int j) {
            if (array.length/2<n) {
                StringBuilder str = new StringBuilder();
                for (;j<n-1;j++){
                    str.append(array[i][j] + " ");
                }
                for (;i<n-1;i++){
                    str.append(array[i][j] + " ");
                }
                for (;t<j;j--){
                    str.append(array[i][j] + " ");
                }
                for (;t<i;i--){
                    str.append(array[i][j] + " ");
                }
                n--;
                t++;
                return str.toString() + mapit(array, n, t, i+1, j+1);
            } else {
                return "";
            }

        }

    }
