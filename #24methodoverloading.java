public class Main {
    static int max(int a,int b){
        return a>b?a:b;
    }

    static double max(double a,double b) {
        return a > b ? a : b;
    }
        public static void main(String[] args) {
            System.out.println(max(5, 9));
            System.out.println(max(6.5,7.4));
            System.out.println(Math.abs(-4.5));
            System.out.println(Math.abs(10));

        }
    }

// output:
// 9
// 7.4
// 4.5
// 10
