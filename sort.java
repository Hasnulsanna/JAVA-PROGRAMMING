import java.util.Scanner;
class sort
{
    public static void main(String[] args)
    {	
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j;
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("before sorting array is:");
        for(i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
        int temp;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++){
                if(a[j]>a[j+1])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("After sorting array is :");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
