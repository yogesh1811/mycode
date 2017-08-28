package DS.Tree;

public class IsIsomorphicTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode a = new TreeNode(15);
		TreeNode b = new TreeNode(15);
		
		a.left = new TreeNode(12);
		a.left.left = new TreeNode(10);
		a.left.right = new TreeNode(13);

		a.right = new TreeNode(20);
		a.right.left = new TreeNode(18);
		a.right.right = new TreeNode(25);
		

		b.left = new TreeNode(12);
		b.left.left = new TreeNode(10);
		b.left.right = new TreeNode(13);

		b.right = new TreeNode(20);
		b.right.left = new TreeNode(25);
		b.right.right = new TreeNode(18);

		if (isIsomorphic(a, b)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	/**
	 * 
	 * https://www.youtube.com/watch?v=9Eo42meRcrY
	 * 
	 * 
	 * @param r1
	 * @param r2
	 * @return
	 */
	private static boolean isIsomorphic(TreeNode r1, TreeNode r2) {
		if (r1 == null && r2 == null) {
			return true;
		}
		if (r1 == null || r2 == null) {
			return false;
		}
		if (r1.data != r2.data) {
			return false;
		}
		if ((isIsomorphic(r1.left, r2.left) && isIsomorphic(r1.right, r2.right))
				|| (isIsomorphic(r1.left, r2.right) && isIsomorphic(r1.right,
						r2.left))) {
			return true;
		}
		return false;
	}

}
