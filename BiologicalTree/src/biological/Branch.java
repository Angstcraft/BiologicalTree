package biological;

public class Branch extends Stem {
	Twig[] twigs;

	public Branch() {
		this.twigs = new Twig[3]; // Each branch has 3 twigs
		for (int i = 0; i < twigs.length; i++) {
			this.twigs[i] = new Twig();
		}
	}

	@Override
	public String toString() {twigs = new
		StringBuilder sb = new StringBuilder();
		for (Twig twig : twigs) {
			sb.append(twig.toString()).append("\n");
		}
		return sb.toString();
	}
}
