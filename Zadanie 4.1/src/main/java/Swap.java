import java.util.Arrays;
public class Swap {
/**
 * Created by Zadvornov Georgii 27.11.2020
 * @see #ToFillArrayRandomVar(int[], int)
 */
    public static void main(String[] args) {
        //Определяем массив и заполняем его случайными числами с помощью отдельного метода
        int[] arr = new int[20];
        System.out.println("Случайный массив: ");
        ToFillArrayRandomVar(arr, 20);
        //Определяем максимальный отрицательный и минимальный положительный элементы массива
        int max_minus = -10, min_plus = 10, Nmax_minus = 21, Nmin_plus = 21;
        for (int i = 0; i < 20; i++) {
            if (arr[i] != 0) {
                if (arr[i] < min_plus & arr[i] > 0) {
                    min_plus = arr[i];
                    Nmin_plus = i;
                };
                if (arr[i] > max_minus & arr[i] < 0) {
                    max_minus = arr[i];
                    Nmax_minus = i;
                }
            }
        }
        //Меняем местами максимальный отрицательный и минимальный положительный элементы массива
        arr[Nmin_plus] += arr[Nmax_minus];
        arr[Nmax_minus] = arr[Nmin_plus]-arr[Nmax_minus];
        arr[Nmin_plus] = arr[Nmin_plus]-arr[Nmax_minus];
        //Выводим на экран
        System.out.println("Поменяны местами элемент №"+Nmax_minus+" и элемент №"+Nmin_plus+" массива");
        System.out.println(Arrays.toString(arr));
    }
    public static void ToFillArrayRandomVar ( int[] array, int num){
        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * (num + 1)) - 10;
            if (i != num-1) {
                System.out.print(+array[i]+", ");
            } else System.out.println(+array[i]);
        };
    }
}
