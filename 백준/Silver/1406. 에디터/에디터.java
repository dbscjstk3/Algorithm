import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
	Node pre;
	char data;
	Node next;

	Node() {
	}

	Node(char data, Node pre) {
		this.data = data;
		this.pre = pre;
	}
}

class Main {
	static Node head, current, node;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		head = new Node();
		current = head;

		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			node = new Node(str.charAt(i),current);
			node.next = current.next;
			current.next = node;
			current = node;
		}

		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			String[] input = br.readLine().split(" ");
			char ch = input[0].charAt(0);
			switch (ch) {
			case 'L':
				if (current.pre == null)
					break;
				current = current.pre;
				break;
			case 'D':
				if (current.next == null)
					break;
				current = current.next;
				break;
			case 'B':
				if (current.pre == null)
					break;
				current.pre.next = current.next;
				if (current.next != null)
					current.next.pre = current.pre;
				current = current.pre;
				break;
			case 'P':
				node = new Node(input[1].charAt(0), current);
				node.next = current.next;
				if (current.next != null)
					current.next.pre = node;
				current.next = node;
				current = node;
				break;
			}
			}

		head = head.next;
		while (head != null) {
			sb.append(head.data);
			head = head.next;
		}
		
		System.out.println(sb.toString());
	}
}