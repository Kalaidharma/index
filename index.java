import java.util.Scanner;
public class index {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,a=-1,i,count=0;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
			count=0;
			if(i==arr[i]){
				count++;
				if(count==1){
				System.out.println(arr[i]);
				}
			else{
				System.out.println(a);
			}
				}
			}
			
		}
	}


