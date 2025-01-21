public class stack {
    int arr[] = new int[10];
    int tos;

    stack(){
        tos = -1;
    }

    void push(int items){
        if(tos == 9)
            System.out.println("Stack is full");
        else
        arr[++tos] = items;
    }
    int pop(){
        if(tos>0)
        return arr[tos--];
        else
            System.out.println("Stack is empty");

        return 0;
    }


}


public class stackdemo {
    public static void main(String[] args) {
        stack s1 = new stack();

        s1.push(8);
        s1.push(10);
        s1.push(4);

        System.out.println(s1.pop());
    }
}
