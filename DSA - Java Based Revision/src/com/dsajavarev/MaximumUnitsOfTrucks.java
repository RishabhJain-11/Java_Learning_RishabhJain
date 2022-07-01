package com.dsajavarev;

import java.util.Arrays;

public class MaximumUnitsOfTrucks {
    public static void main(String[] args) {
        int[][] boxTypes = {{1,3},{2,2},{3,1}};
        int truckSize = 4;
        System.out.println(maximumUnits(boxTypes,truckSize));
    }
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int boxes = 0;
        for (int[] box : boxTypes) {
            if (truckSize >= box[0]) {
                boxes += box[0] * box[1];
                truckSize -= box[0];
            }else {
                boxes += truckSize * box[1];
                return boxes;
            }
        }
        return boxes;
    }
}
