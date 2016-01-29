//Adam Barszczak, Alex Bulanov

public class Randp {
	private int numsLeft;
	private int n;
	private int[] RandArray;

	public Randp(int n){
		RandArray = new int[n];
		numsLeft = n;
		for (int i = 0; i < RandArray.length; i++) {
			RandArray[i] = i + 1;
		}
	}

	public int nextInt() {
		int randIndex = (int) Math.ceil(Math.random() * numsLeft) - 1;
		int returnval;
		if (numsLeft < 1) {
			returnval = 0;
		} else {
			returnval = RandArray[randIndex];
			RandArray[randIndex] = RandArray[numsLeft - 1];
			numsLeft--;
		}
		return returnval;
	}

	public static void main(String[] args) {
		Randp a = new Randp(10);
		System.out.println(a.nextInt());
		System.out.println(a.nextInt());
		System.out.println(a.nextInt());
		System.out.println(a.nextInt());
		System.out.println(a.nextInt());
		System.out.println(a.nextInt());
		System.out.println(a.nextInt());
		System.out.println(a.nextInt());
		System.out.println(a.nextInt());
		System.out.println(a.nextInt());
		System.out.println(a.nextInt());
	}

}
