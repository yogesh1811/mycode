package DS.Tree;

import java.util.Arrays;

public class ArrayToBST {

	public static void main(String[] args) {
		int[] arr = { 7, 6, 5, 4, 3, 2, 1 };
		Arrays.sort(arr);
		TreeNode root = getBST(arr);
		TreeTraversal.preorderTraversal(root);
	}

	private static TreeNode getBST(int[] arr) {
		return createBST(arr, 0, arr.length - 1);
	}

	private static TreeNode createBST(int[] arr, int start, int end) {
		if (start > end)
			return null;
		int mid = (start + end) / 2;

		TreeNode root = new TreeNode(arr[mid]);
		root.left = createBST(arr, start, mid - 1);
		root.right = createBST(arr, mid + 1, end);
		return root;
	}

}
