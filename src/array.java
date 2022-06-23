
import java.util.Scanner;
public class array
{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number between 1 and 20: ");
        int n=sc.nextInt();
        int [] intArray = new int[n];
        for(int i = 0; i < intArray.length; i++){
            intArray[i]= (int) Math.pow(2,i);
            System.out.println(intArray[i]);
        }
    }
}

