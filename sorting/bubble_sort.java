package sorting;
import java.util.*;
public class bubble_sort {
    public static int[] bubble(int a[],int n)
    {
        
        for (int i=0;i<n;i++)
        {
            boolean flag = true;
            for (int j=0;j<n-i-1;j++)
            {
                if (a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag=false;
                }
            }
            if(flag)
            {
                break;
            }
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
        arr = bubble(arr, len);
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
