package Programs;

public class RecursiveCalling {

	static void disp(int no) {
		
	//	int (no<=10);
		{
			System.out.println(no);
			no++;
			disp(no);
		}
		
	}

	public static void main(String[] args) {
		disp(1);
	}

}