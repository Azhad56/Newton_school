import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
        // consider that first element should be replaced by one 
        arr[0] = 1;
        
        for (int i=1;i<len;i++)
        {
          
                
                    for (int k=a[i-1] + 1;k<=arr[i]/2;k++)
                    {
                        if ( arr[i] % k == 0 )
                        {
                                arr[i] = k;
                                break;
                        }
                     
                    }
                    
                    if ((arr[i] <= arr[i-1]))
                    {
                        System.out.println("No");
                        System.exit(0);
                    }
                
            }
      
            System.out.println("Yes");
    }
}
