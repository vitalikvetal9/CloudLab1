package stack;

public class Main {

	public static void main(String[] args) {
		Stack st = new Stack(8);
		st.push(3);
		st.push(6);
		st.push(9);
		st.push(4);
		st.push(14);
		st.push(43);
		st.push(1);
		st.show();
		int x = 3;
		System.out.println(x + " is on " + st.findElem(x) + " place");
		System.out.println(st.pop());
		st.show();
		System.out.println(st.readHead());
		st.boost(4);
		st.show();
		st.clear();
		st.show();
		System.out.println(st.findElem(9));
	}

}
