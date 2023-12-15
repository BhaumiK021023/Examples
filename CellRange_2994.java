package Math.Easy;

public class CellRange_2994 {

	
	/*
	 * Input: s = "K1:L2"
	   Output: ["K1","K2","L1","L2"]
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s= "A1:F3";
			char[] ch = s.toCharArray();
			
			int start_i= (int)ch[0];
			int end_i = (int)ch[3];
			int start_j= (int)ch[1];
			int end_j = (int)ch[4];
			
			for(int i=start_i;i<=end_i;i++) {
				for(int j=start_j;j<=end_j;j++) {
					char ch1 =(char)i;
					char ch2 = (char)j;
					System.out.print(ch1 +""+ ch2);
				}
			}
			int a = 65;
			//a = a+1;
			char ch3 = (char)a;
			System.out.println(ch3);
		
	}

}
