package com.dsajavarev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;


//https://leetcode.com/problems/flatten-nested-list-iterator/
public class FlattenNestedListIterator {
    public static void main(String[] args) {

    }
//    Deque<NestedInteger> stack = new ArrayDeque<>();
//    public void NestedIterator(List<NestedInteger> nestedList) {
//        prepareStack(nestedList);
//    }
//
////    @Override
//    public Integer next() {
//        if(!hasNext()){
//            return null;
//        }
//        return stack.pop().getInteger();
//    }
//
////    @Override
//    public boolean hasNext() {
//        while(!stack.isEmpty() && !stack.peek().isInteger()){
//            List<NestedInteger> list = stack.pop().getList();
//            prepareStack(list);
//        }
//        return !stack.isEmpty();
//    }
//    private void prepareStack(List<NestedInteger> nestedList) {
//        for (int i = nestedList.size() - 1; i >= 0; i--) {
//            stack.push(nestedList.get(i));
//        }
//    }
}
