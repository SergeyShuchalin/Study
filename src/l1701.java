import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class l1701 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Простые исключения
        /*try {

            int[] numbers = new int[3];
            numbers[4] = 9;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Введен некорректный индекс");
        }*/
        /*int res = getFactorial(-5);
        System.out.println(res);
    }

    public static int getFactorial(int num) {
        int res = 1;
        try {
            if (num < 1) {
                throw new Exception("Число меньше 1 указывать нельзя");
            }
            for (int i = 1; i <= num; i++) {
                res *= i;
            }

    } catch (Exception e){
            System.out.println(e.getMessage());
            res = num;
        }
        return res;
    }*/
        //Взаимодействие String с другими типами данными
        /*String str1 = "Hello";
        String str2 = "Work";
        String message = str1 + " " + str2;
        System.out.println(message);

        char[] helloArr = {'п', 'р', 'и', 'в', 'е', 'т'};
        String helloString = new String(helloArr);
        System.out.println(helloString);

        String str = "2";
        int a = 5;
        String newStr = str + a;
        System.out.println(newStr);

        int b = 3;
        String st = b + "";
        System.out.println(st);*/
        /*String str = "2";
        int a = Integer.parseInt(str);
        System.out.println(a+str);

        int b = Integer.parseInt("789");
        System.out.println(b);*/
        /*String name = "Hello";
        int count = name.length();
        System.out.println(count);*/
        /*String name = "Nikita";
//        String name2 = name.toLowerCase();
//        String name2 = name.toUpperCase();
//        System.out.println(name2);
        char res = name.charAt(2);
        System.out.println(res);*/

        //Задача пары
        /*String text = "Частотный словарь букв русского алфавита. Создадим массив нужной длины, и будем хранить в соответствующих позициях количество вхождений символов:";
        text = text.toLowerCase();
        int[] result = new int['я' - 'а' + 1];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'а' && ch <= 'я') {
                result[ch - 'а']++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println((char) (i + 'а') + " = " + result[i]);
        }*/
        /*String s1 = "";
        if (s1.isEmpty()){
            System.out.println("Пустая строка");
        }*/
        // Преобразование строки в массив символов
        /*String str = "ABC";
        char[] res = str.toCharArray();
        for (int i = 0; i < res.length; i++) {
            System.out.println("Элемент [" + i + "]:" + res[i]);*/
        //Пример
        /*System.out.print("Введите адрес сайта: ");
        String path = input.nextLine();
        char[] chars = path.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '/') {
                chars[i] = '\\';
            }
        }
        String res = new String(chars);
        System.out.println(res);*/
        //Поиск символа по строке .indexOf
        /*String str = "I learning Java";
        System.out.println(str);
        System.out.println(str.indexOf('a', 5));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.indexOf("Java1"));*/
        //Удаление пробельных симолов в начале и конце
        /*System.out.println(" Hello Word   ".trim());*/
        //Получение части строки
        /*String str = "I learning Java";
        System.out.println(str.substring(2));//начало индекса
        System.out.println(str.substring(2, 12));//начало и конец индекса*/
        //Разбив строки по символу(элементу) и удаление его
        /*String str = "I learning Java";
        String [] words = str.split(" ");
        for (String word: words) {
            System.out.println(word);}*/
        //Пример
        /*Scanner input = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String name = input.nextLine();
        String[] res = name.split(" ");
        System.out.println(res[0] + " " + res[1].charAt(0) + "." + res[2].charAt(0) + ".");*/
        /*String res = String.join(":","00", "23", "30");
        System.out.println(res);

        String[] text= new String[]{"Hello","Word"};
        String str = String.join(" ", text);
        System.out.println(str);*/
        String text = "Я изучаю С. Мне нравится С";
        System.out.println(text);
        String [] array = text.split("С");
        String res = String.join("Java", array);
        System.out.println(res);
        /*String tx = text.replace("С++","Java");
        System.out.println(tx);*/




    }
}
