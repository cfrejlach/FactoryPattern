package chris;

import java.util.Scanner;

public class AppDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		CakeFactory cakeFactory = new CakeFactory();
		CakeStore store = new CakeStore(cakeFactory);
		System.out.println("type in one of the cakes you'd like to order: \n" + 
				"1-vanilla \n2-chocolate \n3-lemon \n ORDER:");
		String order = in.nextLine();
		if(order.equals("vanilla")||order.equals("1")) {
			store.onlineOrder("vanilla");
		}else if(order.equals("chocolate")||order.equals("2")) {
			store.onlineOrder("chocolate");
		}else{
			store.onlineOrder("lemon");
		}
		
	}

}
