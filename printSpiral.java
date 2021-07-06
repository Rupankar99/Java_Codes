public class printSpiral {
    public static void main(String[] args) {
        int[][] m = { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 }, { 15, 24, 25, 20, 7 }, { 14, 23, 22, 21, 8 },
                { 13, 12, 11, 10, 9 } };

        int r = 5;
        int c = 5;
        solve(m, r, c);
    }

    public static void solve(int[][] m, int r, int c) {
        int top = 0;
        int down = r - 1;
        int right = c - 1;
        int left = 0;

        while (right > left) {
            for (int i = left; i <= right; i++) {
                System.out.print(m[top][i] + " ");
            }
            top++;
            for (int i = top; i <= down; i++) {
                System.out.print(m[i][right] + " ");
            }
            right--;
            for (int i = right; i >= left; i--) {
                System.out.print(m[down][i] + " ");
            }
            down--;
            for (int i = down; i >= top; i--) {
                System.out.print(m[i][left] + " ");
            }
            left++;
            // System.out.println("top = " + top + " left = " + left + " right = " + right +
            // " down = " + down);
        }
    }
}
