package Math.Easy;

public class GoodPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Solution sol = new Solution();
			
			int count =sol.numIdenticalPairs(new int[]{1,2,3,1,1,3});
			System.out.println(count);
			
			int a=7,b=8;
			//a= a^20000;
			a=a^b;
			a=a^5;
			System.out.println(a);
	}

}


//OPTIMAL SOLUTION
class Solution {
    public int numIdenticalPairs(int[] nums) {
    	 int ans = 0;
         int[] temp = new int[101];
         
         for (int i = 0; i < nums.length; i++) {
             ans += temp[nums[i]]++;
         }
        
         
         return ans;           
        
    }
}
