package member;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * member.csvにデータを追記する
 * @author yuuka
 */
public class memberWIterJava {

	public static void main(String[] args) {

		/**
		 * member.csvを読み込む
		 * @author yuuka
		 */
		File file = new File("member.csv");

		try {
			/**
			 * 文字コードを指定する
			 * @author yuuka
			 */
			PrintWriter p_writer = new PrintWriter(
					new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "Shift-JIS")));
			/**
			 * ファイルに鹿島のデータを書き込む
			 * @author yuuka
			 */
			p_writer.println("鹿島" + "," + 5 + "," + "第五システム統括部" + "," + 1);

			/**
			 * ファイルをクローズする
			 * @author yuuka
			 */
			p_writer.close();
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
