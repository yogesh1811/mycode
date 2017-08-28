package DS.Tree;

public class CountLeafNodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode a = new TreeNode(15);

		a.left = new TreeNode(12);
		a.left.left = new TreeNode(10);
		a.left.right = new TreeNode(13);

		a.right = new TreeNode(20);
		a.right.left = new TreeNode(18);
		a.right.right = new TreeNode(25);
		a.right.right.right = new TreeNode(50);

		System.out.println("Number of Leafs => " + countLeafNodes(a, 0));
	}

	private static int countLeafNodes(TreeNode root, int cnt) {
		if(root==null){
			return cnt;
		}
		if (root.left == null && root.right == null) {
			cnt++;
			return cnt;
		} else {
			
			int leftCnt = countLeafNodes(root.left, cnt);
			int totalCnt = countLeafNodes(root.right, leftCnt);
			return totalCnt;
		}

	}

}
