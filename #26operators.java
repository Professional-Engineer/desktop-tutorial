public class Main {
    public static void main(String[] args) {
        int a = 20,b =10;
        int c = a&b;
        System.out.println(c);//1 1-->1
        int d = a|b;
        System.out.println(d); //1 1->1
        int e = ~a;
        System.out.println(e);
        int f = a^b; //1 1 -->0
        System.out.println(f);//eor its also different so it can be add but same value it can act as a and gate

    }
