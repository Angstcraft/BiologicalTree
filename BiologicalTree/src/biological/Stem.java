package biological;

public class Stem extends Tree {
	Branch[] branches;

	public Stem() {
		this.branches = new Branch[3]; // Each branch has 3 twigs
		for (int i = 0; i < branches.length; i++) {
			this.branches[i] = new Branch();
		}
	}

	@Override
	public String toString() {twigs = new
			StringBuilder sb = new StringBuilder();
		for (Branch branch : branches) {
			sb.append(branch.toString()).append("\n");
		}
		return sb.toString();
	}
}
