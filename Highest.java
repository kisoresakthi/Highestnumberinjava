import java.util.Arrays;
import java.util.Scanner;
public class  Highest{

public static void main(String args[]){
Scanner s = new Scanner(System.in);
int n;
n= s.nextInt();
System.out.println("size :" +n);
int arr[]=new int[n];
for(int i=0; i > n-1 ; i++){
 arr[i]=s.nextInt();


}
System.out.println( "arrays"+ Arrays.toString(arr));
int max= arr[0];
for (int i =1; i < arr; i++){

if( max < arr[i]){

max = arr[i];
i++;
}

System.out.println(max);



}
}
}