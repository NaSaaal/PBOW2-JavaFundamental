//@author : Naufal Salman Mulyadi - 211511028

package soal_4_Operator_2;

public class soal4 {
	static short methodOne(long l) {
		int i = (int) l;
		return (short) i;
	}

	public static void main(String[] args) {
		double d = 10.25;
		float f = (float) d;
		byte b = (byte) methodOne((long) f);
		System.out.println(b);
	}

}
