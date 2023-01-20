public class Recursion {
    public void printNumbers(int A, int B) {
        if (A == B) {
            System.out.println(A);
            return;
        }
        if (A < B) {
            System.out.println(A);
            printNumbers(A + 1, B);
        } else {
            System.out.println(A);
            printNumbers(A - 1, B);
        }
    }
}