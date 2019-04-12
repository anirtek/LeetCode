public class MaxCoins {
  public static void main(String[] args) {
    int [][] arr = {{0, 3, 1, 1},
		    {2, 0, 0, 4},
   		    {1, 5, 3, 1}
		   };
    System.out.println("Maximum number of coins = " + countCoinsDFS(arr, 0, 0, 3, 4));
  }

  static int countCoinsDFS(int [][]arr, int i, int j, int row, int col) {
    if (i >= row || j >= col) 
      return 0;
    int max = arr[i][j];
    return Math.max(countCoinsDFS(arr, i, j+1, row, col) + max, countCoinsDFS(arr, i+1, j, row, col) + max);
  }
}
