package com.dsajavarev;

public class SearchInA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchInTwoDMatrix(matrix, target));
    }
    public static boolean searchInTwoDMatrix(int[][] matrix, int target){
        int i = 0, j = matrix[0].length - 1;

        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
