import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class l2401 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Регулярные выражения
      /*        String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. 98765 Ели[-ели]";
//        String pattern = "[204]"; //[...] - один символ из перечисленных
//        String pattern = "[0-9]";// [0-9] - диапазон символов
//        String pattern = "[12][0-9][0-9][0-9]";
//        String pattern = "[А-Яа-яЁё\\]]"; // . - один любой символ
//        String pattern = "[^А-Яа-яЁё]"; // [^...] выводит все кроме заданных символов
//        String pattern = "[а-я&&[к-н]]"; // "[а-я&&[к-н]]" - пересечение символов
//        String pattern = "[а-д[к-н]]"; //объединение символов
        String pattern = "[а-я&&[^к-н]]"; //удаление символов


        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
//        System.out.println(matcher.find());
        while (matcher.find()) {
//            System.out.println("Шаблон совпадения найден с " + matcher.start() + " по " + (matcher.end()-1));3
//            System.out.println(s.substring(matcher.start() + matcher.end()));
            System.out.println(matcher.group());

        }
        System.out.println();
        String str = "ЁАЯаяё";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + ": " + str.codePointAt(i));
        }*/
//Задача поиск времени
        /*try {

            String s = "Час в 24-часовом формате от 00 до 23. 2021-06-15Т21:45. Минуты, в диапазоне от 00 до 59. 2021-06-15Т01:09";
            String pattern = "[0-2][0-9]:[0-5][0-9]";
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(s);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException pse) {
            System.err.println("Неправильное регулярное выражение: " + pse.getMessage());
            System.err.println("Описание: " + pse.getDescription());
            System.err.println("Позиция: " + pse.getIndex());
            System.err.println("Неправильный шаблон: " + pse.getPattern());


        }*/
        /*// String s = "Час в 24-часовом формате от 00 до 23. 2021-06-15Т21:45. Минуты, в диапазоне от 00 до 59. 2021-06-15Т01:09. Hello_World";
        // String s = "Цифры: 7, +17, -42, 0013, 0.3";
        String s = "author=Пушкин А.С.; title  = Евгений Онегин; price =200; year= 1830";
        String pattern = "\\w+\\s*=\\s*[^;]+";
        // String pattern = "\\w+\\s*=\\s*[А-я0-9\\s*.]+";
        // String pattern = "[+-]?[\\d.]+";
        // + - от 1 повторения до бесконечности
        // * - от 0 до бесконечности
        // ? - от 0 до 1
        // \\d == [0-9] - одна любая цифра
        // \\s == [ ] - один пробельный символ
        // \\w == [A-Za-z0-9_] - один символ (буквы (только англ., регистр), цифры и символ подчёркивания)
        // \\s\\d - цифра после пробела
        // \\A - поиск шаблона в начале строки
        // \\Z - поиск шаблона в цонце строки
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }*/
        /*String s = "12 сентября 2024 года 23456";
        String pattern = "\\d{2,4}";
        // {4} - 4 повторения
        //{2,} - от 2 повторений до бесконечности
        //{2,} - от 2 повторений до 4(включительно)
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()) {
            System.out.print(matcher.group()+ " ");
        }*/

        // String s = "+7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 74994564578";
        // String pattern = "\\+?7\\d{10}";
        /*String s = "I learning Java";
//        String pattern = "^\\w+\\s\\w+";  // ^ - строка должна начинаться с заданного шаблона
        String pattern = "^\\w+\\s\\w+\\s\\w+$"; // $ - строка должная заканчиваться на заданный шаблон
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()) {
            System.out.print(matcher.group()+ "...");
        }*/
        /*String s = "Java_master";
        String pattern = "^[\\w-]{3,16}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        System.out.print(matcher.find());*/


        /*String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. Hello_World";
        String pattern = "я";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE); // игнорирует регистр английских символов
        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE); // добавляет коды других языков
        Matcher matcher = regex.matcher(s);
        while (matcher.find()) {
            System.out.print(matcher.group() + "...");
        }*/

        System.out.println("Введите текст с цифрами: ");
        String s = input.nextLine();
        String pattern = "\\d #поиск цифр"; // # - добавление комментария с указанием константы Pattern.COMMENTS
        Pattern regex = Pattern.compile(pattern, Pattern.COMMENTS);
        Matcher matcher = regex.matcher(s);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Количество цифр в введенном тексте: " + count);
    }
}

