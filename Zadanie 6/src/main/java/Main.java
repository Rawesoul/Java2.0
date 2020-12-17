import Logic.ToSortAndCountStats;

import java.io.IOException;

/**
 * Created by Georgii Zadvornov 16.12.2020
 * @see ToSortAndCountStats
 */

public class Main {
    public static void main(String[] args) {
        try {
            ToSortAndCountStats stats = new ToSortAndCountStats("test.txt");
            System.out.println("Слова, отсортированные по алфавиту \n"+stats.sort());
            System.out.println("Статистика слов: \n"+stats.getCounts());
            System.out.println("Самое часто встречающееся слово: "+stats.maxCountWord());
            System.out.println("Слово '"+stats.maxCountWord()+"' встретилось "+stats.getMax()+" раз");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
