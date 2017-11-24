package heap.sort;
import java.util.Scanner;
import java.util.Arrays;

public class HEAPSORT {

    private static int m;

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,j;
        
        System.out.println("How many Data?");
        n=s.nextInt();
        int [] heap =new int[n];
        
        System.out.println("Enter Data");
        for(i=0;i<n;i++)
        {
            heap[i]=s.nextInt();
        }
        buildHeap(heap,n);
         System.out.println("After Building Max Heap");
        for(i=0;i<n;i++)
       System.out.println(heap[i]);

        ///////////////
        for(m=n-1;m>0;m--)
        {
            removeRoot(heap,m);
            buildHeap(heap,m);
        }
        System.out.println("After Sorting");
         for(i=0;i<n;i++)
            System.out.println(heap[i]);

        
    }
    
    
    public  static void buildHeap(int heap[],int N)
{
    int i, c, temp, root;
    for(i=1;i<N;i++)
    {
      c=i;
      do
      {
          root=(c-1)/2;
          if (heap[c]>heap[root])
          {
              temp=heap[c];
              heap[c]=heap[root];
              heap[root]=temp;
          }
          c=root;


      } while(c!=0);


    }// outer for loop;

}
   public static void removeRoot(int heap[],int m)
{

    int temp ;
    temp=heap[0];
    heap[0]=heap[m];
    heap[m]=temp;
    return;
}
    
}
