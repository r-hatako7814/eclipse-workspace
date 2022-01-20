package jp.learningdesign.javastudy;

public class BmiCalc {
/*BMI(体格しい数を計算するプログラム)
 * BNI = 体重　/ (身長 * 体重)
 * 体重 kg、身長 cm
 */
	public static void main(String[] args) {
		double weight,height,bmi;
		
		height = 180;
		weight = 71;
		height /= 100;
		
		bmi = weight / (height * height);
		
		System.out.println(bmi);
		
		if (bmi < 18.5) {
			System.out.println("痩せ型です。");
		} else if(bmi < 25) {
			System.out.println("標準です。");
		} else {
			System.out.println("肥満です。");
		}

	}

}
