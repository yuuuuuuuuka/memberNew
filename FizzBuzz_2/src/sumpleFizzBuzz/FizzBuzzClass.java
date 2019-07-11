
package sumpleFizzBuzz;


/**
 * @class 引数をチェックしFizzかBuzzかFizzBuzzに分ける
 * @author yamada
 *
 */

public class FizzBuzzClass {

	public static void main(String[] args) {

		/**
		 * @param input 実行時に入力する数値を格納する
		 * @author yamada
		 *
		 */
		System.out.print("引数：");
		int input = new java.util.Scanner(System.in) .nextInt();

		/**
		 * @param setNum 入力された数値のチェック
		 * @author yamada
		 *
		 */
//		public void chacks(int num) {
//		    try {
//
//		    } catch (NumberFormatException e) {
//		        return false;
//		    }
//		}

		/**
		 * カウントiの初期値は1、数値以下まで、1回の処理ごとに＋1
		 * @author yamada
		 *
		 */
		for (int i = 1; i <= input; i++) {

			/**
			 * 3,5を割り切れるか判定する処理
			 * @author yamada
			 *
			 */
			if (i % 3 == 0 & i % 5 == 0) {
				System.out.println("FizzBuzz");
			}

			/**
			 * 5を割り切れるか判定する処理
			 * @author yamada
			 *
			 */
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}

			/**
			 * 3を割り切れるか判定する処理
			 * @author yamada
			 *
			 */
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}

			/**
			 * どちらも割れない数を表示させる処理
			 * @author yamada
			 *
			 */
			else {
				System.out.println(i);
			}
		}

	}
}
