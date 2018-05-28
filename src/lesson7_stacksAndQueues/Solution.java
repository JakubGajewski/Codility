package lesson7_stacksAndQueues;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

///wszystko WSZYSTKO ŹLE, przecież konfrontacja jest tylko, jak PO jedynce jest 0!!!

class Solution {
    public int solution(int[] A, int[] B) {
        int j = 0;
        int l = 0;
        int x = 0;

        do {
            x = 0;
            for (int i = 0; i < A.length; i++) {
                printAndWait(A,B);
                if (B[j] == B[i]) {
                    j = i;
                    continue;
                } else {
                    x++;
                    int[] A1 = new int[A.length - 1];
                    int[] B1 = new int[B.length - 1];
                    if (A[j] < A[i]) {
                        System.out.println("nastepna wieksza");
                        for (int k = 0; k < A.length; k++) {
                            if (k == i) {
                                continue;
                            }
                            A1[l] = A[k];
                            B1[l] = B[k];
                            l++;
                        }
                    } else {
                        System.out.println("poprzednia wieksza");
                        for (int k = 0; k < A.length; k++) {
                            if (k == j) {
                                continue;
                            }
                            A1[l] = A[k];
                            B1[l] = B[k];
                            l++;
                        }
                    }
                    A = A1;
                    B = B1;
                }
            }
        } while (x != 0);
        return A.length;
    }



    public static void printAndWait(int[]A, int[]B) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i]);
        }
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}



/*
class Solution {
    public int solution(int[] A, int[] B) {

        List<Integer> sizes = new ArrayList(A.length);
        List<Integer> directions = new ArrayList(A.length);

        for (int i = 0; i < A.length; i++) {
            sizes.add(A[i]);
            directions.add(B[i]);
        }

        int count = 0;
        do {
            count = 0;
            Integer j = directions.get(0);

            for (Integer i : directions) {
                if (i == j) {
                    count++;
                    continue;
                } else if (sizes.get(i) > sizes.get(j)) {
                    directions.remove(count);
                    sizes.remove(count);
                } else {
                    directions.remove(count - 1);
                    sizes.remove(count - 1);
                }
            }
        } while (count != sizes.size());

        return sizes.size();
    }
}
*/


//
//            Integer j = 0;
//            for (Integer i = 1; i<sizes.size(); i++) {
//                int i1 = sizes.get(i-1);
//                int i2 = sizes.get(i);
//                if (sizes.get(i) > sizes.get(j)) {
//
//                } else if (sizes.get(i) < sizes.get(j))
//                }
//                j++;
//
//            }
//        } while (1 == 1);
//        return A.length;
