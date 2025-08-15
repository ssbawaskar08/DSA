import java.util.*;

class PairsOfArray {
    public static void printSA (int arr[]){
        System.out.println("The Pairs's are: ");
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                System.out.print("["+arr[i]+","+arr[j]+"]\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr [] = new int [10];

        Scanner sc = new Scanner(System.in);

        for (int i=0;i<arr.length;i++){
            System.out.print("please enter the number to be inserted at the position "+ (i+1) + ": ");
            arr[i]=sc.nextInt();
            System.out.println();
        }
        sc.close();
        printSA(arr);
    }
}