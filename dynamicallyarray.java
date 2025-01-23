public class Main{

    static int[] mark(int a,int b){
        return new int[]{a,b};
    }
    public static void main(String[] args) {
        int marks[] = mark(100, 70);
        System.out.println(marks[0]+","+marks[1]);
    }
}

