import java.util.Scanner;

//Даны целые положительные числа M, N, число D и набор из M чи-
//сел. Сформировать матрицу размера M × N, у которой первый столбец
//совпадает с исходным набором чисел, а элементы каждого следующего
//столбца равны сумме соответствующего элемента предыдущего столбца
//и числа D (в результате каждая строка матрицы будет содержать элементы
//арифметической прогрессии).
//Matrix5
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число M: ");
        int m = scanner.nextInt();
        System.out.print("Введите целое положительное число N: ");
        int n = scanner.nextInt();
        System.out.print("Введите число D: ");
        int d = scanner.nextInt();
        int i, j;
        int[][] array = new int[m][n];
        System.out.println("Введите набор из M чисел: ");
        for (i = 0; i < m; i++) {
            System.out.print(i + 1 + ":");
            array[i][0] = scanner.nextInt();
        }
        for (i = 0; i < m; i++) {
            for (j = 1; j < n; j++) {
                array[i][j] = array[i][j - 1] + d;
            }
        }
        System.out.println("Получившаяся матрица:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

