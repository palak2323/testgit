import java.util.*;

class second
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int i,n,sum=0,ln,sn,sln,counte=0,sumalt=0,j,k;
		int arr[]= new int[5];
		int fre[]= {0,0,0,0,0};
		System.out.println("Enter 5 integer nos.");
		for(i=0;i<5;i++)
		{
			arr[i]= scan.nextInt();
		}
		ln=arr[0];
		for(i=1;i<5;i++)
			{
				if(arr[i]>ln)
				{
					ln=arr[i];
				}
			}
		sn=arr[0];
		for(i=1;i<5;i++)
			{
				if(arr[i]<sn)
				{
					sn=arr[i];
				}
			}
    }
 }   			