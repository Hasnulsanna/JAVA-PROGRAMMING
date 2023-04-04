import java.util.Scanner;
class matrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in a metrix");
        int m=sc.nextInt();
        System.out.println("Enter the number oif columns in a metrix");
        int n=sc.nextInt();
        int i,j;
        int[][] a=new int [2][3];
        int[][] b=new int [2][3];
        int[][] c=new int [2][3];
        System.out.println("enter the first metrix");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the second metrix");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("the resultant metrix is");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.println(c[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
