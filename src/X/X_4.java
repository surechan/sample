package X;

import java.util.Scanner;

public class X_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);

		System.out.print("曜日:");
		int a=scanner.nextInt();
		System.out.print("時間:");
		int b=scanner.nextInt();

		int c=0;

		if(a==0){//日曜日はc=0
		}else if(a==1){//月曜日はc=1
			c=1;
		}else if(a==2||a==5){//火曜、金曜は同じ
			if(b==0){
			}else{
				c=1;
			}
		}else if(a==3){//水曜日
			if(b==2){
			}else{
				c=1;
			}
		}else if(a==4){//木曜日
			c=1;
		}else{//土曜日
			if(b==0){
				c=1;
			}else{
			}
		}

		if(c==0){
			System.out.println("休診です。");
		}else{
			System.out.println("診察しています。");
		}
		scanner.close();
	}
}

