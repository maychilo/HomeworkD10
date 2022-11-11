
public class MainTheFeast {

	public static void main(String[] args) {
		int n = 15;
		int c = 3;
		int m = 2;
		int chocolateNum = n / c;
		int wrapper = chocolateNum;
		chocolateNum = chocolateNum + wrapper / m;
		while (wrapper >= m) {
			wrapper = (wrapper / m) + (wrapper % m);
			chocolateNum = chocolateNum + wrapper / m;
		}
		System.out.println("The feast result " + chocolateNum);
	}

}
