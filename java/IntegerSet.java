package hw_8_13;
import java.util.*;
public class IntegerSet
{
	private static final int limit = 101;
	private boolean[] set = new boolean[limit];


	public void insert(int i) { if (checkingfunc(i)) set[i] = true;  }
	public void delete(int i) { if (checkingfunc(i)) set[i] = false; }

	public String toString() {
		String result = "";
		for (int i = 0; i < limit; i++)
			if (set[i])
				result += i+" ";
		return result.equals("") ? "---" : result;
	}

	
	private boolean checkingfunc(int i) {
		if (i < 0 || limit < i)
			throw new IllegalArgumentException(
				"Set elements range from 0 to "+(limit-1)+" only.");
		return true;
	}

	public boolean isEqualto(IntegerSet s) {
		for (int i = 0; i < limit; i++)
			if (set[i] != s.set[i])
				return false;
		return true;
	}

	public static IntegerSet intersection(IntegerSet seriesone, IntegerSet seriestwo) {
		IntegerSet ret_set = new IntegerSet();
		for (int i = 0; i < limit; i++)
			if (seriesone.set[i] && seriestwo.set[i])
				ret_set.set[i] = true;
		return ret_set;
	}
	public IntegerSet() { Arrays.fill(set, false); }
}
