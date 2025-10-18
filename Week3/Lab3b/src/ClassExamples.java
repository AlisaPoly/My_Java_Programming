public class ClassExamples {
    void addNum(double c, double d) {
        double result = c + d;
        System.out.println("This is double addNum" + result);
    }

    int addNum(int int1, int int2, int int3) {
        int result = int1 + int2 + int3;
        return result;


    }

    int product(int int1, int int2, int int3) {
        int result = int1 * int2 * int3;
        return result;
    }

    int max(int int1, int int2, int int3) {
        if (int1 > int2 && int1 > int3)
        {
            return int1;
        }
        else if (int2 > int3 && int2 > int1)
        {
            return int2;
        }
        else
        {
            return int3;

        }
    }
    int factorialRecursion(int n) {
        if (n == 0) return 1;
        return n * factorialRecursion(n - 1);
    }

    int factorialloop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = i * result;
        }
        return result;
    }
}

