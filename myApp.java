package MyApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class myApp {

	public static void main(String[] args) throws IOException {

		System.out.println("二つ整数を入力してください。");

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		if(num1 == num2){
			System.out.println(num1 + "と" + num2 +"は同じ数です。");
		}else if(num1 > num2){
			System.out.println(num1 + "は" + num2 +  "より大きいです。");
		}else{
			System.out.println(num1 + "は" + num2 +  "より小さいです。");
		}
	}

}
//System.out.println("");