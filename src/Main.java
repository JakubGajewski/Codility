import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] A = {5,1,2,3};
        int[] B = new int[5];

        for (int i = 0; i < A.length; i++) {
            System.out.println("dupa");
        }


        System.out.println(B[4]);

        Arrays.sort(A);

        System.out.println(A[0]);
    }
}
