public class ClassExamples {
    void addNum(double c, double d) {
        double result = c + d;
        System.out.println("This is double addNum" + result);
    }
    int addNum(int int1, int int2, int int3) {
        int result = int1 + int2 + int3;
        return result;


    }
    public int factorialRecursion(int n){
        if(n==0) return 1;
        return n*factorialRecursion(n-1);
        }
        public int factorialloop(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=i*result;
        }
        return result;
    }
}
