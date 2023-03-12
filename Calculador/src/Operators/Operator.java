package Operators;

import RepositoryOperator.OperatorRepository;

public class Operator implements  OperatorRepository{




    public int sum(int a, int b){
        return  a+ b;
    }

    public int division(int a, int b){
        return  a / b;

    }
    public  int multiply(int a, int b){
       return   a * b;
    }
    public int subtraction(int a,int b){
        return  a - b;
    }

}
