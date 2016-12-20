public class MatrixRotation {

  public static void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
    int tmp = matrix[i2][j2];
    matrix[i2][j2] = matrix[i1][j1];
    matrix[i1][j1] = tmp;
  }

  public static void rotate(int[][] matrix) {
    int vLength = matrix.length - 1;
    int hLength = matrix[0].length - 1;
    for(int i = 0; i <= vLength; i++) {
      for(int j = 0; j <= hLength; j++) {
        if (i == 0) {
          if ((j + 1) <= hLength) {
            swap(matrix, i, j+1, i, j);
          } else if ((i + 1) <= vLength) {
            swap(matrix, i, j, i+1, j);
          }
        }
      }
    }
  }

  public static void print(int[][] matrix) {
      for(int i = 0; i <= matrix.length - 1; i++) {
        for(int j = 0; j <= matrix[i].length - 1; j++) {
          System.out.print(" " + matrix[i][j]);
        }
        System.out.println();
      }
  }

  public static void main(String[] args) {
    int[][] matrix = {
      {0,1,0},
      {0,2,0},
      {0,0,0}
    };

    print(matrix);
    rotate(matrix);
    System.out.println();
    print(matrix);
  }
}
