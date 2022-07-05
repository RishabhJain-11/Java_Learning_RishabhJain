package com.dsajavarev;

import java.util.*;

public class SpiralMatrixOne {
    public static void main(String[] args) {

    }
    public ArrayList spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> list = new ArrayList();
        int row = A.size();

        if(row == 0){ // base condition.
            return list;
        }

        int col = A.get(0).size();
        int l = 0, r = col - 1, t = 0, b = row - 1, d = 0;

        while(l <= r && t <= b){
            if(d == 0){
                for(int i = l;i <= r;i++){
                    list.add(A.get(t).get(i));
                }
                d = 1;t++;
            }

            else if(d == 1){
                for(int i = t;i <= b;i++){
                    list.add(A.get(i).get(r));
                }
                d = 2;r--;
            }

            else if(d == 2){
                for(int i = r;i >= l;i--){
                    list.add(A.get(b).get(i));
                }
                d = 3;b--;
            }

            else {
                for(int i = b;i >= t;i--){
                    list.add(A.get(i).get(l));
                }
                d = 0;l++;
            }
        }
        return list;
    }
}

/*
public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> list = new ArrayList();
        int row = A.size();

        if(row == 0){ // base condition.
            return list;
        }

        int col = A.get(0).size();
        int l = 0, r = col - 1, t = 0, b = row - 1, d = 0;

        while(l <= r && t <= b){
            if(d == 0){
                for(int i = l;i <= r;i++){
                    list.add(A.get(t).get(i));
                }
                d = 1;t++;
            }

            else if(d == 1){
                for(int i = t;i <= b;i++){
                    list.add(A.get(i).get(r));
                }
                d = 2;r--;
            }

            else if(d == 2){
                for(int i = r;i >= l;i--){
                    list.add(A.get(b).get(i));
                }
                d = 3;b--;
            }

             else if(d == 3){
                for(int i = b;i >= t;i--){
                    list.add(A.get(i).get(l));
                }
                d = 0;l++;
            }
        }
        return list;
    }
 */