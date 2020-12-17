package Logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ToSortAndCountStats {
    private ArrayList<String> ArrList;
    private TreeMap<String, Integer> ArrMap;
    private Comparator<String> comparator;
    private int max = 0;

    public ToSortAndCountStats(String fileName) throws IOException {
        initCollections(fileName);
        initComparator();
    }
// Инициализируем коллекции, считываем строку из файла и заполняем коллекции
    private void initCollections(String fileName) throws IOException {
        this.ArrList = new ArrayList<>();
        this.ArrMap = new TreeMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while (reader.ready()){
                String str = reader.readLine();
                String[] arrStr = str.split(" ");
                // Строка -> в список для дальнейшей сортировки
                ArrList.addAll(Arrays.asList(arrStr));
                // Перебираем карту по содержимому элементов массива строк
                for (int i = 0; i < arrStr.length; i++) {
                    if(this.ArrMap.containsKey(arrStr[i]))
                        ArrMap.put(arrStr[i], ArrMap.get(arrStr[i]) + 1);
                    else{
                        ArrMap.put(arrStr[i], 1);
                    }
                }
            }
        }
    }
//Инициализируем компаратор со сравнением без учета регистра
    private void initComparator() {
        this.comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        };
    }

    public ArrayList<String> sort(){
        ArrList.sort(this.comparator);
        return this.ArrList;
    }
//Подсчет статистики
    public TreeMap<String, Integer> getCounts(){
        return this.ArrMap;
    }
//Подсчет слова с максимальным количеством повторений
    public String maxCountWord(){
        for(Map.Entry<String, Integer> i : this.ArrMap.entrySet()){
            if(i.getValue() > max)
                max = i.getValue();
        }
        for(Map.Entry<String, Integer> i : this.ArrMap.entrySet()){
            if(i.getValue() == max)
                return i.getKey();
        }
        return null;
    }

    public int getMax() {
        return max;
    }
}
