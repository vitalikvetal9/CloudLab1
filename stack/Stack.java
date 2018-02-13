package stack;

public class Stack {
	private int size;
	private int arr[];

	public Stack(int length) {
		this.size = length;
		arr = new int[size];
	}

	public Stack push(int elem) {
		int i = this.size - 1;
		while (i > 0) {
			this.arr[i] = this.arr[i - 1];
			i -= 1;
		}
		this.arr[0] = elem;
		return this;
	}

	public int pop() {
		int i = 0;
		int elem = this.arr[0];
		while (i < this.size - 1) {
			this.arr[i] = this.arr[i + 1];
			i += 1;
		}
		return elem;
	}

	public boolean isEmpty() {
		return (this.size == 0);
	}

	public int readHead() {
		return this.arr[0];
	}

	public Stack clear()
	{
		for(int i =0;i<this.size;i++)
			this.arr[i]= 0;
		return this;
	}
	
	public Stack boost(int mSize )
	{
		this.size+=mSize;
		int[] add = new int[this.size];
		for(int i = 0;i<this.arr.length;i++)
		{
			add[i] = this.arr[i];
		}
		this.arr = add;
		return this;
	}
	
	public int findElem(int elem)
	{
		for(int i = 0;i<this.size;i++)
		{
			if(this.arr[i]==elem)
				return i;
		}
		return -1;
	}
	
	public void show() {
		int i = 0;
		System.out.print('{');
		while (i < this.size) {
			System.out.print("  " + this.arr[i] + "  ");
			i += 1;
		}
		System.out.println('}');
	}
}
