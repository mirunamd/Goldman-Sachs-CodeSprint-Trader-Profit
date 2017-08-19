import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("/home/meep/eclipse-workspace/Trader Profit/src/in.txt"));

		int q = Integer.parseInt(br.readLine()); // sets

		while (q-- != 0) {
			int k = Integer.parseInt(br.readLine()); // max nr of trans
			int n = Integer.parseInt(br.readLine()); // prices
			int[] arr = new int[n + 1]; // prices array
			int i = 1;

			for (String s : br.readLine().split("\\s")) {
				arr[i++] = Integer.parseInt(s);
			}

			buyMaxProfit(k, n, arr);
		}

	}

	private static void buyMaxProfit(int maxTrans, int pricesNr, int[] price) {
		int[][] T = new int[maxTrans + 1][pricesNr + 1];

		for (int i = 1; i <= maxTrans; i++) {
			int maxDiff = -price[1];

			for (int j = 1; j <= pricesNr; j++) {
				T[i][j] = Math.max(T[i][j - 1], price[j] + maxDiff);
				maxDiff = Math.max(maxDiff, T[i - 1][j] - price[j]);
			}
		}

		System.out.println(T[maxTrans][pricesNr]);
	}
}
