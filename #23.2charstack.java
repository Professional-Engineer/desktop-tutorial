public class stack {
    char arr[] = new char[10];
    char tos;

    stack() {
        tos = (char) -1;
    }

   void push(char item){
        if(tos ==9)
            System.out.println("Stack is full");
        else
    {
        tos = (char) (tos + 1);
        arr[tos] = item;
    }

    }

       char pop(){
            if(tos>=0)
                return arr[tos--];
            else{
                System.out.println("Stack is empty");
                return '\0';
            }
        }


}


public class stackdemo{
    public static void main(String[] args) {
        stack s1 = new stack();
        s1.push('A');
        s1.push('B');
        s1.push('C');
        s1.push('D');
        s1.push('E');
        s1.push('F');

       System.out.println(s1.pop());

    }
}
