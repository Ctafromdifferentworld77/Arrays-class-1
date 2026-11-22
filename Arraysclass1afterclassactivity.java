import java.util.Scanner;
public class Main {
    public static void main (String[] args)
{
    Scanner sc = new
Scanner(System.in);
    int[] arr = new int[100];
    int n;
    System.out.print("Enter the size of the array: ");
    n = sc.nextInt();
    System.out.println("Enter the array elements:");
    for (int i = 0;i < n;i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("Inverse of the array:");
    for (int i = n - 1; i >= 0;i--) {
        System.out.println(arr[i]+"");
    }
    sc.close();
    }
}