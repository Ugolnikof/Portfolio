import java.util.Scanner;

// Программа принимает на вход 2 числа, строит двумерный массив, и заполняет его числами по спирали
public class SpiralArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер матрицы А: ");
        int a = input.nextInt();
        System.out.print("Введите размер матрицы B: ");
        int b = input.nextInt();
        int[][] arr = new int[a][b];
        int k = 1;
        int x = 0;
        int y = -1;
        int go_right = 1; // 1 0 -1
        int go_down = 0; // 1 0 -1

        // Заполнение двумерного массива
        while (k <= a * b) {
            if ((x + go_down >= 0 && x + go_down < a) && (y + go_right >= 0 && y + go_right < b) && arr[x + go_down][y + go_right] == 0) {
                x += go_down;
                y += go_right;
                arr[x][y] = k;
                k++;
            }
            else {                              // смена направления заполнения двумерного массива
                if (go_right == 1) {            // движение направо сменяется на движение вниз
                    go_right = 0;
                    go_down = 1;
                } else if (go_down == 1) {      // движение вниз сменяется на движение влево
                    go_down = 0;
                    go_right = -1;
                } else if (go_right == -1) {    // движение влево сменяется на движение вверх
                    go_right = 0;
                    go_down = -1;
                } else if (go_down == -1) {     // движение вверх сменяется на движение вправо
                    go_down = 0;
                    go_right = 1;
                }
            }
        }


        // Вывод двумерного массива в консоль
        System.out.println();
        System.out.println("Результат заполненной по спирали матрицы:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (j != b - 1) {
                  System.out.printf("%2d ", arr[i][j]);
                } else {
                  System.out.printf("%2d", arr[i][j]);
                }
            }
            System.out.println();
        }


    }
}
