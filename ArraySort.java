import java.lang.*;
import java.util.Scanner;
public class SortArray
{  
public static void main(String[] args)   
{ Scanner sc= new Scanner(System.in);

int n=sc.nextInt();
//int[] a = new int[] {78, 34, 1, 3,7}; 
int[] a = new int[n];

for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for (int i = 0; i < n; i++)   
{  
for (int j = i + 1; j <n; j++)   
{  
int t = 0;  
if (a[i] > a[j])   
{  
t = a[i];  
a[i] = a[j];  
a[j] = t;  
}  
}  
System.out.print(a[i]+" ");  

}  System.out.println();  
}  
}  
