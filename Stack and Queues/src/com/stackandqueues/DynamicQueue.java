package com.stackandqueues;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();//it will call CustomStack
    }
    public DynamicQueue(int size) {
        super(size);//it will call CustomStack(int size)
    }


    @Override
    public boolean insert(int item){
        if(this.isFull()){
            //double the size of array
            int[] temp  = new int[data.length * 2];
            //copy all the previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }

        //at this point we know that array is not full
        //insert item
        return super.insert(item);
    }
}
