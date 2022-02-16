package com.stackandqueues;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();//it will call CustomStack
    }
    public DynamicStack(int size) {
        super(size);//it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){
            //double the size of array
            int[] temp  = new int[data.length * 2];
            //copy all the previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        //at this point we know that array is not full
        //insert item
        return super.push(item);
    }
}
