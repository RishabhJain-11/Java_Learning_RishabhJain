package com.company;

public class SampleAssignmentNo11Example {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = "+context.executeStrategy(10,5));
        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = "+context.executeStrategy(10,5));
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = "+context.executeStrategy(10,5));

    }
}
interface Strategy{
    public int doOperation(int num1,int num2);
}

class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1,int num2){
        return num1+num2;
    }
}
class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int num1,int num2){
        return num1-num2;
    }
}

class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1,int num2){
        return num1*num2;
    }
}

class Context{
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
