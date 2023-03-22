package coding.leetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascal2 {
	public static List<Integer> getRow(int rowIndex) {
		ArrayList<Integer> row= null, prev = null;
		for (int i = 0; i <= rowIndex; i++) {
			row = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				row.add(j == 0 || i == j ? 1 : prev.get(j) + prev.get(j-1));
			}
			prev = row;
		}
		return row;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int row=4;		
		   System.out.println(getRow(row));

	}

}
