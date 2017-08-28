package DS.Tree;

public class CheckMirrorBST {

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

		TreeNode b = new TreeNode(15);

		b.left = new TreeNode(12);
		b.left.left = new TreeNode(10);
		b.left.right = new TreeNode(13);

		b.right = new TreeNode(20);
		b.right.left = new TreeNode(18);
		b.right.right = new TreeNode(25);

		CreateMirrorBST.getMirorTree(b);

		if (checkMirrorBST(a, b)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	private static boolean checkMirrorBST(TreeNode a, TreeNode b) {
		if (a == null && b == null) {
			return true;
		}
		if (a == null || b == null) {
			return false;
		}

		return a.data == b.data && checkMirrorBST(a.left, b.right)
				&& checkMirrorBST(a.right, b.left);

	}
}
