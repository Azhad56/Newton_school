import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class moving_right {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
		int b[] = arr;
		int totaljumps = 0,count=0;
        for (int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
		for (int i=0;i<len-1;i++)
		{
			if(arr[i]>=arr[i+1])
			{
				count +=1;
				if (totaljumps<count)
				{
					totaljumps = count;
				}
			}
			else{
				count=0;
			}		
		}
		System.out.println(totaljumps);
	}
}