package MyApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class myApp {

	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください。");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		int ans = res % 2;
		if(ans == 0){
			System.out.println(res + "は偶数です。");
		}else{
			System.out.println(res + "は奇数です。");
		}
	}

}
//System.out.println("");