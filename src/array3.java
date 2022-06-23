public class array3 {
    public static void main (String[] args)
    {
        int [] arr = {2, 3, 9, 17, 32, 40, 73, 40, 21, 10};
        int n = 1;

        System.out.println("Original array: ");
        for(int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i] + "");
        }
        for(int i =0; i< n; i++)
        {
            int x=0,first;
            first = arr[x+1];
            for(x=0; x < arr.length-1;x++)
            {
                arr[x] = arr[x+1];
            }
            arr[x] = first;
        }
        System.out.println("Array after left rotation: ");
        for(int i =0;i < arr.length; i++)
        {
            System.out.print(arr[i] + "");
        }
    }
}
