// Inbar Havilio, username inbarhavilio, ID 209243252
// Yuval Bloom, username yuvalbloom, ID 312486806

public class ModHash {

	private int m;
	private long p;
	private long a;
	private long b;

	/**
	 * ModHash(int m, long p)
	 * Constructor for class ModHash.
	 * Complexity: O(1)
	 * @param m - Length of the hash table.
	 * @param p - random prime number.
	 */
	public ModHash(int m, long p) {
		this.a = randA(p);
		this.b = randB(p);
		this.p = p;
		this.m = m;
	}

	/**
	 * randA(long p)
	 * Helper function.
	 * Calculates random value for element a.
	 * Complexity: O(1)
	 * @param p - random prime number.
	 * @return random value between 1 and p.
	 */
	public long randA(long p) {
		long leftLimitA = 1;
		return leftLimitA + (long) (Math.random() * (p - leftLimitA));
	}

	/**
	 * randB(long p)
	 * Helper function.
	 * Calculates random value for element b.
	 * Complexity: O(1)
	 * @param p - random prime number.
	 * @return random value between 0 and p.
	 */
	public long randB(long p) {
		long leftLimitB = 0;
		return leftLimitB + (long) (Math.random() * (p - leftLimitB));
	}

	/**
	 * GetFunc(int m, long p)
	 * Complexity: O(1)
	 * @param m - Length of the hash table.
	 * @param p - random prime number.
	 * @return new Hash function.
	 */
	public static ModHash GetFunc(int m, long p){
		return new ModHash(m,p);
	}

	/**
	 * Hash(long key)
	 * Complexity: O(1)
	 * @param key - value for calculating hash index.
	 * @return hash index
	 */
	public int Hash(long key) {
		return (int) Math.floorMod(Math.floorMod(((a*key) + b), p),m);
	}
}
