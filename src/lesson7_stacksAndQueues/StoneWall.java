package lesson7_stacksAndQueues;

import java.util.ArrayDeque;

class StoneWall {
    public int solution(int[] H) {
        ArrayDeque<Integer> fulfilledTo = new ArrayDeque<>();
        fulfilledTo.add(Integer.valueOf(H[0]));
        Integer previousHeight = Integer.valueOf(H[0]);

        int result = 1;

        for (int i = 0; i<H.length; i++) {

            Integer currentHeight = Integer.valueOf(H[i]);

            if (currentHeight.intValue() == previousHeight.intValue()){
                continue;
            }

            if (currentHeight > previousHeight) {
                fulfilledTo.addFirst(currentHeight);
                result++;
                previousHeight = currentHeight;
                continue;
            }

            while (!fulfilledTo.isEmpty() && currentHeight < fulfilledTo.getFirst()) {
                fulfilledTo.removeFirst();
            }

            if (!fulfilledTo.isEmpty() && fulfilledTo.getFirst().intValue() == currentHeight.intValue()) {
                previousHeight = currentHeight;
                continue;
            }

            fulfilledTo.addFirst(currentHeight);
            previousHeight = currentHeight;
            result++;
        }


        return result;
    }
}
