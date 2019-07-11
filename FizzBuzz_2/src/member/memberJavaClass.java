package member;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * member.csvを読み込み出力する
 * @author yuuka
 */
public class memberJavaClass {

	public static void main(String[] args) {

		/**
		 * BufferedReaderを使いファイル読み込み。
		 * 文字コード指定
		 * @param br ファイルを格納
		 *
		 * @author yuuka
		 */
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("member.csv"), "SJIS"));
			String s;

			// ファイルを行単位で読む
			while ((s = br.readLine()) != null) {
				// カンマで分割したString配列を得る
				String array[] = s.split(",");
				// データ数をチェックしたあと代入、プリントする。

				if (array.length != 4)
					throw new NumberFormatException();
				String name = array[0];
				int num = Integer.parseInt(array[1]);
				String busho = array[2];

				int xxy = Integer.parseInt(array[3]);

				/**
				 * 読み込みを出力する
				 * String.format 番号を4桁で0埋めする。
				 * @if 数値をif文で判断し出力する
				 * @author yuuka
				 */
				System.out.println("--------------------");
				System.out.println("名前：" + name);
				System.out.println("番号：" + (String.format("%04d", num)));
				System.out.println("部署：" + busho);
				if (xxy == 0) {
					System.out.println("性別：" + "女");
				} else if (xxy == 1) {
					System.out.println("性別：" + "男");
				} else {
					System.out.println("性別：" + "不明");
				}
			}
			br.close();
		} catch (IOException e) {
			System.out.println("入出力エラーがありました");
		} catch (NumberFormatException e) {
			System.out.println("フォーマットエラーがありました");
		}
	}

}


