package java_task_5;

public class main {
    public static void main(String[] args) {
        System.out.println("rec_2 >> ");
        System.out.println(rec_2(50));
        System.out.println("rec_3 >> ");
        System.out.println(rec_3(13, 66));
        System.out.println("rec_4 >> ");
        System.out.println(rec_4(0, 0, 3, 15));
        System.out.println("rec_5 >> ");
        System.out.println(rec_5(123456789));
    }

    public static String rec_2(int n){
        if (n == 1) return String.valueOf(n);
        else return rec_2(n - 1) + " " + n;
    }

    public static String rec_3(int A, int B) {
        if (A > B) {
            return A + " " + rec_3(A - 1, B);
        }
        else
            {
                if (A == B) return Integer.toString(A);
                final String s = A + " " + rec_3(A + 1, B);
                return s;
            }
    }

    public static int rec_4(int length, int count, int k, int s) {
        if (length == k) if (count == s) return 1;
        else return 0;
        int c = (length == 0) ? 1 : 0;
        int res = 0;
        for (int i = c; i < 10; i++) res += rec_4(length + 1, count + i, k, s);
        return res;
    }

    public static int rec_5(int N) {
        if (N < 10) return N;
        else return (N % 10) + rec_5(N / 10);
    }
}
