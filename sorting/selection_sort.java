package sorting;
import java.util.*;
public class selection_sort {
    public static int[] selection(int a[],int n)
    {
        
        for (int i=0;i<n-1;i++)
        {
            int min_index=i;
            for (int j=i+1;j<n;j++)
            {
                if(a[min_index]>a[j])
                {
                        min_index=j;
                }
            }
            int temp = a[min_index];
            a[min_index] = a[i];
            a[i] = temp;
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
        arr = selection(arr, len);
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
