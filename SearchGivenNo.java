import java.util.Scanner;
class SearchGivenNo
{
    public static void main(String args[])
    {

    
        int size;
        System.out.print("Enter size of Array: ");
        Scanner sc= new Scanner(System.in);
        size=sc.nextInt();
        int arr[]= new int[size];
         System.out.print("\tEnter Elemenmts:- \n");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter no: ");
            arr[i]=sc.nextInt();

        }
         System.out.print("Enter number you want to find: ");
        int targ=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]==targ){
                System.out.println("Found at index: "+i);
                found =true;
            }
        }
        if(found==false)
            System.out.print("Not found in array.");
    }
}      