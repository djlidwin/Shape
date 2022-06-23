import java.util.Scanner;
public class array2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        int i,s=0;
        double avg;
        System.out.print("Enter a positive integer: ");
        for(i=0;;i++)
        {
            n=sc.nextInt(); // enter positive integer
            if(n<=0) // error checking
            {
                System.out.print("Number entered is negative. Enter again: ");
                continue;
            }
            else
            {
                break;
            }
        }
        int a[]=new int[n];
        System.out.println("Enter array: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt(); // enter array
            s=s+a[i];
        }
        System.out.println("The array elements are: ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");  // display array
        }
        System.out.println();
        int max=a[0],min=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        avg=(double)s/n;
        System.out.println("The maximum integer entered is "+max); // display message
        System.out.println("The minimum integer entered is "+min);
        System.out.println("The average of all integers entered is "+avg);
        System.out.println("The elements that are greater than the average are: ");
        for(i=0;i<n;i++)
        {
            if(a[i]>avg)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        System.out.println("The elements that are greater than the last element are: ");
        for(i=0;i<n;i++)
        {
            if(a[i]>a[n-1])
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        System.out.println("The array elements in reverse are: ");
        for(i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}

