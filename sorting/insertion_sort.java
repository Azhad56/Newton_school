package sorting;
import java.util.*;
public class insertion_sort {
    public static int[] insertion(int a[],int n)
    {
        
        for (int i=1;i<n;i++)
        {
            int value=a[i];
            int hole = i;
            while(hole > 0 && (a[hole-1] > value))
            {
                a[hole] = a[hole-1];
                hole--;
            }
            a[hole] = value;
        }
        return a;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
        arr = insertion(arr, len);
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}