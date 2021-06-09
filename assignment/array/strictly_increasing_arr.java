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
        boolean flag=false;
        int start=2;
        outerloop:
        for (int i=1;i<len-1;i++)
        {
            if (arr[i] <=arr[i-1])
            {
                flag=true;
                break;
            }
            else if (arr[i] >=arr[i+1])
            {
                for(int j=start;j<=arr[i]/2;j++)
                {
                    if ((arr[i]%j==0) && (j > arr[i-1]) && (j<arr[i+1]))
                    {
                        arr[i]=j;
                        start=j+1;
                        flag=false;
                        break;
                    }
                    else {
                        flag=true;
                    }
                }
            }
            else if (arr[i]<arr[i+1])
            {
                for(int j=start;j<=arr[i];j++)
                {
                    if ((arr[i]%j==0) && (j > arr[i-1]) && (j<arr[i+1]))
                    {
                        arr[i]=j;
                        start=j+1;
                        flag=false;
                        break;
                    }
                    else {
                        flag=true;
                    }
                }
            }
            if (flag)
            {
                break outerloop;
            }   
        }
        if (flag==true)
        {
            System.out.println("NO");
        }
        else if (flag==false)
        {
            System.out.println("YES");
        }
    }
}