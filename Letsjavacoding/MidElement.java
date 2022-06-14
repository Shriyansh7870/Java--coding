package Letsjavacoding;
import java.util.*;

public class MidElement {
    
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int a []= new int[n];
        System.out.println("\n Enter element of the array");
        for(int i=0; i<n;i++){
            a[i]=sc.nextInt();
        }
        int low =0;
        int high=a.length;
        int mid=(low+high)/2;
        int b=a[mid];
        System.out.println("\nMid element is:\n");
        System.out.println(b);

    }
}
