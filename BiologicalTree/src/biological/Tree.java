package biological;

public abstract class Tree {
	String type;
	int treehight;
	Stem[] stems;

	public Tree(String type) {
		this.type = type;
		this.stems = new Stem[2]; // Tree has 2 branches
		for (int i = 0; i < branches.length; i++) {
			this.stems[i] = new Stem();
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Tree Type: ").append(type).append("\n");
		for (Stem stem : stems) {
			sb.append(stem.toString());
		}
		return sb.toString();
	}


}
