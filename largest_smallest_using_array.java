import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int arr[] = new int[5];

        Scanner se = new Scanner(System.in);
        System.out.print("Enter the number: ");
        for(int i = 0;i < arr.length; i++){
            arr[i] = se.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];

        for(int i = 0 ; i<arr.length-1;i++){
            if(largest < arr[i]){
                largest = arr[i];

            }

            if(smallest > arr[i]){
                smallest =arr[i];
            }
        }

        System.out.println(largest);

            System.out.println(smallest);


    }
}
