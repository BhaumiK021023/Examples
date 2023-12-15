package Math.Easy;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public static boolean checkTree(TreeNode root) {
		if (root == null)
			return true;
		if (root.left == null && root.right == null)
			return true;

		int sum = 0;
		if (root.left != null)
			sum += root.left.val;
		if (root.right != null)
			sum += root.right.val;

		return (root.val == sum && checkTree(root.left) && checkTree(root.right));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(10);
		TreeNode tempLeft=root;
		TreeNode  tempRight=root;
		int i=0;
		while(i<=2) {
			tempLeft.left= new TreeNode(5+i);
			tempRight.right= new TreeNode(5+i);
			tempLeft=tempLeft.left;
			tempRight=tempRight.right;
			i++;
		}
		
		System.out.println(checkTree(root));
		
	}

	class Solution {

	}

}
