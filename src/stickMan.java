public class stickMan{
	public static void main(String[] args) {

		int stickmanHeight = Integer.parseInt(args[0]);
		int stairHeight = Integer.parseInt(args[1]);
		
		for (int a = 0; a <= stairHeight; a++) {
			int step;
			step = a;
			general(step, stickmanHeight, stairHeight);
		}
	}

	public static void spaces(int strt, int end) {
		for (int a = strt; a < end; a++)
			System.out.print(" ");
	}

	public static void general(int step, int stickmanHeight, int stairHeight) {
		for (int i = step; i <= stairHeight; i++)
			System.out.println();
		spaces(0, 3 * step);
		System.out.println(" O ");
		spaces(0, 3 * step);
		System.out.println("/|\\");
		for (int a = 0; a < stickmanHeight - stairHeight - 3 + step; a++) {
			spaces(0, 3 * step);
			System.out.println(" | ");
		}
		stairs1(step, stairHeight);
		stairs2(step, stairHeight);
		stairs3(step, stairHeight);
		for (int i = 0; i < 3; i++)
			System.out.println();
	}

	public static void stairs1(int step, int stairHeight) {
		for (int line = 0; line < stairHeight - step; line++) {
			spaces(0, 3 * step);
			System.out.print(" | ");
			spaces(0, 3 * stairHeight - 3 * line - 3 * step);
			for (int i = 0; i < 3; i++)
				System.out.print("_");
			System.out.print("|");
			for (int i = 0; i < line * 3; i++)
				System.out.print("*");
			System.out.println("|");
		}
	}

	public static void stairs2(int step, int stairHeight) {
		spaces(0, 3 * step);
		System.out.print("/ \\");
		for (int i = 0; i < 3; i++)
			System.out.print("_");
		System.out.print("|");
		for (int i = 0; i < -3 * step + 3 * stairHeight; i++)
			System.out.print("*");
		System.out.println("|");
	}

	public static void stairs3(int step, int stairHeight) {
		for (int line = step; line > 0; line--) {
			spaces(0, line * 3);
			for (int i = 0; i < 3; i++)
				System.out.print("_");
			System.out.print("|");
			for (int i = 0; i < -3 * line + 3 * stairHeight + 3; i++)
				System.out.print("*");
			System.out.println("|");
		}
	}
}
