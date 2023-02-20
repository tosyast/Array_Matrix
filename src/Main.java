import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива из N:");
        int N =scanner.nextInt();//Ввод числа N
        int[] array = new int[N];
        Random random = new Random();
        int size = 100;
        IntStream.range(0,N).forEach(index-> array[index] = random.nextInt(size));
        System.out.println(Arrays.toString(array));
        for (int i =0; i <= array.length + 1;i++){
            if(array[i] % 2 == 0 && array[i+1] % 2 == 0 || array[i] % 2 != 0 && array[i+1] % 2 != 0 ){
                System.out.println("Не чередуются -" + array[i] + "-" + i + "элемент массива.");
                break;
            }
            if(array[i] % 2 == 0 && array[i+1] % 2 != 0 || array[i] % 2 != 0 && array[i+1] % 2 == 0 ){
                System.out.println(0);
            }
        }
    }
}
