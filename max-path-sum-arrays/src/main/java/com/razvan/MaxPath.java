package com.razvan;

import java.util.ArrayList;
import java.util.List;

public class MaxPath {
    private final int array1[];
    private final int array2[];

    public MaxPath(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public List<Integer> getMaxPath() {

        AIte aIte = new AIte(array1, array2);
        while (aIte.hasMore()) {
            aIte.proceed();
        }

        return aIte.result;
    }

    public static class AIte {
        private final int[] array1;
        private final int[] array2;

        private int i;
        private int j;

        private boolean done;

        private List<Integer> result;

        public AIte(int[] array1, int[] array2) {
            this.array1 = array1;
            this.array2 = array2;
            i = 0;
            j = 0;
            done = false;
            result = new ArrayList<>();
        }

        public void proceed() {

            List<Integer> partialList1 = new ArrayList<>();
            List<Integer> partialList2 = new ArrayList<>();

            while (i < array1.length && j < array2.length && array1[i] != array2[j]) {
                if (array1[i] < array2[j]) {
                    partialList1.add(array1[i++]);
                } else {
                    partialList2.add(array2[j++]);
                }
            }
            if (i == array1.length || j == array2.length) {
                if (i == array1.length) {
                    while (j < array2.length) {
                        partialList2.add(array2[j++]);
                    }
                } else {
                    while (i < array1.length) {
                        partialList1.add(array1[i++]);
                    }
                }
                done = true;
            } else {
                partialList1.add(array1[i++]);
                partialList2.add(array2[j++]);
            }

            if (sum(partialList1) < sum(partialList2)) {
                result.addAll(partialList2);
            } else {
                result.addAll(partialList1);
            }
        }

        public List<Integer> getResult() {
            return result;
        }

        private int sum(List<Integer> list) {
            System.out.println("partial sum is "+ list.stream()
            .reduce(0, Integer::sum));
            return list.stream()
                .reduce(0, Integer::sum);
        }

        public boolean hasMore() {
            if (array1.length == 0 && array2.length == 0) {
                return false;
            }
            return !done;
        }
    }
}
