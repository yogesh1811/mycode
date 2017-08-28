package DS.Tree;

public class MaxLevelSumBT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);

		root.left = new TreeNode(12);
		root.left.left = new TreeNode(10);
		root.left.right = new TreeNode(13);

		root.right = new TreeNode(20);
		root.right.left = new TreeNode(18);
		root.right.right = new TreeNode(25);

		int h = getHeight(root);
		printSumForAll(root, h);

	}

	private static void printSumForAll(TreeNode root, int h) {
		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= h; i++) {
			System.out.println("\n" + "level-" + i);
			max = Math.max(printSumKLelel(root, i, 0,0), max);

		}

	}

	private static int printSumKLelel(TreeNode node, int level, int sum,int gsum) {
		if (node == null) {
			return 0;
		}
		if (level == 1) {
			System.out.println(node.data);
			sum += node.data;
			System.out.println(sum);
			gsum = Math.max(gsum, sum);
			return sum;

		} else if (level > 1) {
			int lsum = printSumKLelel(node.left, level - 1, sum,gsum);

			sum = printSumKLelel(node.right, level - 1, lsum,gsum);

		}
		
		return sum;
	}

	private static int getHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int lh = getHeight(root.left);
		int rh = getHeight(root.right);
		return Math.max(lh, rh) + 1;
	}

}
