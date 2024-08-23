import java.util.*;
public class removeGivenElementFromArray{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be removed: ");
        int val=sc.nextInt();
        List<Integer> l = new ArrayList<Integer>();
         for(int i=0;i<a.length;i++)
         {
            if(a[i]!=val)
            {
               l.add(a[i]);
            } 
            else{
                 l.add(null);
            }  
         }
         System.out.println(l);
    }
}