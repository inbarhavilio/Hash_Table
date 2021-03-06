// Inbar Havilio, username inbarhavilio, ID 209243252
// Yuval Bloom, username yuvalbloom, ID 312486806

public class HashTableElement{
	private long key;
	private long value;
	
	public HashTableElement(long key, long value) {
		this.key = key;
		this.value = value;
	}
	
	public long GetKey() { return this.key;}
	
	public long GetValue() { return this.value;}

	public String toString() {
		return "key: " + key + ", value: " + value;
	}
}