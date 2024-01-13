import java.sql.SQLOutput;
import java.util.Scanner;

// Программа принимает на вход 2 числа, строит двумерный массив, и выводит результат его транспонирования
public class TransponentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер матрицы А: ");
        int a = sc.nextInt();
        System.out.print("Введите размер матрицы B: ");
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        int k = 1;

        // Заполнение двумерного массива
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = k;
                k++;
            }
        }

        // Вывод транспонированного двумерного массива в консоль
        System.out.println();
        System.out.println("Результат транспонированной матрицы:");
        for (int j = 0; j < b; j++) {
            for (int i = 0; i < a; i++) {
                if (i != a - 1) {
                    System.out.printf("%2d ", arr[i][j]);
                } else {
                    System.out.printf("%2d", arr[i][j]);
                }
            }
            System.out.println();
        }


    }
}

