import java.util.Scanner;
public class array4
{
    //get max function to find the maximum value from array of elements
    int getMax(int arr[])
    {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    //get min function to find the minimum value from array of elements
    int getMin(int arr[])
    {
        int min = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }
    //sumValues function to find the sum of array of elements
    int sumValues(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int n;//declaring required variables
        array4 m = new array4();//creating the object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        n = sc.nextInt();//reading user input
        while(n<0) {//error checking loop repeats until user enters a positive number

            System.out.print("Enter a positive number: ");
            n = sc.nextInt();
        }
        int arr[] = new int[n];
        for(int i = 0; i <arr.length; i++) {//loop to generate the array of random integers between 1 and 500

            arr[i] = (int) (Math.random()*(500-1)) + 1;
            System.out.println("Random integer at position "+ i +" is: "+arr[i]);
        }
        //calling the method and printing the outputs
        System.out.println("max value is: "+m.getMax(arr));
        System.out.println("min value is: "+m.getMin(arr));
        System.out.println("sum of array values is: "+m.sumValues(arr));
    }
}

