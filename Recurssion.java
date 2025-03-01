public class Recurssion {
    // print number from n=>1
    public static void Recurssions(int n) {
        if (n == 0) {
            return;
        }
        Recurssions(n - 1);
        System.out.println(n);

    }

    public static void calculateSum(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        calculateSum(n - 1, sum);

    }

    public static int calculateFcat(int n) {
        if (n == 0) {
            return 1;
        }

        return n * calculateFcat(n - 1);

    }

    public static void calculateFabo(int first, int second, int n) {
        if (n == 0) {
            return;
        }
        System.err.print(first + " ");
        calculateFabo(second, first + second, n - 1);

    }

    public static int claculateExpo(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
        return 0;
        }
        // int x_m = claculateExpo(x, n - 1); // this calculate x^(n-1)
        // int ans = x_m * x; // we multiply x^(n-1) with x to get x^n
        // return ans;
        if (n % 2 == 0) {
            return claculateExpo(x, n / 2) * claculateExpo(x, n / 2);
           
        } else {
            return x * claculateExpo(x, n / 2) * claculateExpo(x, n / 2);
           
        }
    }

    public static void main(String[] args) {

        int n = 5;
        int sum = 0;
        int first = 0;
        int second = 1;
        int x = 2;

        // Recurssions(n);
        // calculateSum(n, sum);
        // System.out.println(calculateFcat(n));
        // calculateFabo(first, second,n);
        System.err.println(claculateExpo(x, n));

    }

}
