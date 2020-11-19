/*開発：上野
 * 日付：R2/10/07
 *
 *
 */
public class HighAndLow {

	public static void main(String[] args) {
		System.out.println("サイコロ版 HighAndLow にようこそ\n"
				+ "このプログラムではサイコロを使ったハイアンドローを楽しめます\n"
				+ "では、ごゆっくり\n"
				+ "\n"
				+ "スタート：1\n"
				+ "ヘルプ  ：2\n\n");
		int help = new java.util.Scanner(System.in).nextInt();
		switch (help) {
		case 2:
			System.out.println("/* \n 1投目の数字より大きいか小さいかをあてるゲームです\n"
					+ "同じ数字の時は、あなたの勝ちになります\n*/ \n\n");
		case 1:
			int r = new java.util.Random().nextInt(5) + 1;
			int r2 = new java.util.Random().nextInt(5) + 1;
			System.out.println("一投目は" + r + "です\n"
					+ "大きいと思ったら：1\n"
					+ "小さいと思ったら：2\n"
					+ "\n");
			int highLow = new java.util.Scanner(System.in).nextInt();
			System.out.println("二投目は" + r2 + "でした");
			if (r > r2) {//Low
				switch (highLow) {
				case 2://勝ち
					System.out.println("あなたの勝ちです");
					break;
				case 1://負け
					System.out.println("あなたの負けです");
					break;
				default://入力異常
					System.out.println("入力異常です。終了します。");
					break;
				}
			} else if (r < r2) {//High
				switch (highLow) {
				case 2://負け
					System.out.println("あなたの負けです");
					break;
				case 1://勝ち
					System.out.println("あなたの勝ちです");
					break;
				default://入力異常
					System.out.println("入力異常です。終了します。");
					break;
				}
			} else {//同じ数・・・
				switch (highLow) {
				case 2://勝ち
				case 1://勝ち
					System.out.println("あなたの勝ちです");
					break;
				default://入力異常
					System.out.println("入力異常です。終了します。");
					break;
				}

			}
			break;

		default:
			System.out.println("入力異常です。終了します");
			break;

		}
	}
}
/*
サイコロ版 HighAndLow にようこそ
このプログラムではサイコロを使ったハイアンドローを楽しめます
では、ごゆっくり

スタート：1
ヘルプ  ：2


2
 1投目の数字より大きいか小さいかをあてるゲームです
同じ数字の時は、あなたの勝ちになります



一投目は2です
大きいと思ったら：1
小さいと思ったら：2


2
二投目は2でした
あなたの勝ちです

*/