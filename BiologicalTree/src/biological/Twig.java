package biological;

public class Twig {
	Leaf[] leaves;

	public Twig() {
		this.leaves = new Leaf[4]; // Each twig has 4 leaves
		for (int i = 0; i < leaves.length; i++) {
			this.leaves[i] = new Leaf("Leaf " + (i + 1));
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Leaf leaf : leaves) {
			sb.append(leaf.toString()).append(" ");
		}
		return sb.toString();
	}
}
