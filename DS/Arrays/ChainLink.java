package DS.Arrays;

import java.util.HashMap;
import java.util.Map;

enum Side {
	NONE, LEFT, RIGHT
}

public class ChainLink {

	private ChainLink left, right;

	public void append(ChainLink rightPart) {
		if (this.right != null)
			throw new IllegalStateException("Link is already connected.");
		this.right = rightPart;
		//rightPart.left = this;
	}

	public Side longerSide() {
		if (this == null) {
			return Side.NONE;
		}
		Map<ChainLink, ChainLink> visited = new HashMap<ChainLink, ChainLink>();
		int lh = 0, rh = 0;
		try {
			lh = getHeight(this.left, visited);

			rh = getHeight(this.right, visited);

		} catch (IllegalStateException e) {
			// System.out.println("Found Cyclic");
			return Side.NONE;
		}
		if (lh == rh) {
			return Side.NONE;
		}
		if (lh > rh) {
			return Side.LEFT;
		} else {
			return Side.RIGHT;
		}

	}

	private static int getHeight(ChainLink node,
			Map<ChainLink, ChainLink> visited) {
		if (node == null) {
			return 0;
		}
		if (visited.containsKey(node)) {
			throw new IllegalStateException("Found Cyclic");
		} else {
			visited.put(node, node);
		}
		int lh = getHeight(node.left, visited) + 1;
		int rh = getHeight(node.right, visited) + 1;
		return Math.max(lh, rh);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChainLink left = new ChainLink();
		ChainLink middle = new ChainLink();
		ChainLink right = new ChainLink();
		left.append(middle);
		middle.append(right);
		System.out.println(middle.longerSide());
	}

}
