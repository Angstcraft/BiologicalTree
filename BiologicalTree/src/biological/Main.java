package biological;


public class Main {
	public static void main(String[] args) {
		// Creating a Birch tree
		Birch birch = new Birch();
		System.out.println("Birch Tree:");
		System.out.println(birch);

		// Creating an Oak tree
		Oak oak = new Oak();
		System.out.println("Oak Tree:");
		System.out.println(oak);


	/**
	 * @param args
	 */

		Leaf  leaf1 = new Leaf("Oak");
		Leaf leaf2 = new Leaf("Birch");
		Leaf leaf;
		leaf = leaf1;

		if(leaf == (leaf1))
		{
			System.out.println("The Oak tree has more leaves");
		}

		if (leaf1.equals(leaf2))
		{
			System.out.println("The Birch tree has more leaves");
		}

	}
}
