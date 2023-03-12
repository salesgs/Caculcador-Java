package RepositoryOperator;

public interface OperatorRepository {

    public static  int sum(int a, int b){
        return  a+ b;
    }
    public static float division(float a, float b){
        return  a / b;
    }
    public  static int multiply(int a, int b){
        return  a * b;
    }
    public static int subtraction(int a, int b){
        return  a - b;
    }

}
