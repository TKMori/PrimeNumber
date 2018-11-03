import java.util.*;
public class primenum{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入第一個數：");
		int n=scan.nextInt();
		System.out.println("請輸入第二個數：");
		int m=scan.nextInt();
		for(int i=n;i<=m;i++){
			int j=1;
			for(int k=2;k<=(i/2);k++){
				if(i%k==0)
				j=0;
			}
			if(j==1)
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
