import java.util.Scanner;

public class Arrays {
    public static void main(String[]args){
        int n,sum,neg=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements");
        n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            array[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            sum=0;
            for (int k = j; k <n; k++)
            {
                sum=array[k]+sum;
                if(sum<0) {
                    neg = neg + 1;
                }
            }
        }
        System.out.println(neg);
    }
}