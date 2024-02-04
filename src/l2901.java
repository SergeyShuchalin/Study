import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class l2901 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*String s = "one\ntwo";
//        String pattern = "one.\\w+";
        // . - любой символ
//        Pattern regex = Pattern.compile(pattern, Pattern.DOTALL);
        String pattern = "one$";
        Pattern regex = Pattern.compile(pattern, Pattern.MULTILINE); // многострочный поиск
        Matcher matcher = regex.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group() + "\t\t");
        }*/

        /*String s = "Goods - $500";
        String pattern = "$500";
        Pattern regex = Pattern.compile(pattern, Pattern.LITERAL); // поиск по спецсимволам
        Matcher matcher = regex.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group() + "\t\t");
        }*/

        /*String s = "Java,\njava,\nJAVA";
        String pattern = "(?im)^java"; // (?i) - игнорировать регистр, (?m)(Pattern.MULTILINE) поиск по всем строкам
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()) {
            System.out.print(matcher.group() + "...");
        }*/

/*//        String s = "123456@i.ru, 123_456@ru.name.ru, login@i.ru, логин-1@i.ru, login.3@i.ru, login.3-67@i.ru, 1login@ru.name.ru";
//        String pattern = "[\\wА-яЁе.-]+@[\\w.]+.ru";
//        String s = "<body>пример жадного соответствия регулярных выражений</body>";
//        String pattern = "<.*?>";
//        String s = "12 сентября 2024 года 23456789";
//        String pattern = "\\d{2,4}?"; // ? - минимальное количество
        String s = "Егорова Алиса Александровна";
        String pattern = "Е.+а"; //
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()) {
            System.out.print(matcher.group() + "...");
        }*/

        /*String s = "World2016, PS6, AI5";
        String pattern = "((?i)[a-z]+)(\\d*)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }*/

       /* String s = "abc";
        String pattern = "(.(.(.)))";
        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = regex.matcher(s);
        matcher.find();
        System.out.println(matcher.groupCount());
        for (int i = 0; i <= matcher.groupCount(); i++) {
            System.out.println(i + ": " + matcher.group(i));
        }*/

/*//        String s = "Ольга и Виталий отлично учатся!";
//        String pattern = "Петр|Ольга|Виталий";
        String s = "int = 4, float = 4.0f, double = 8.0";
//        String pattern = "\\w+\\s*=\\s*\\d\\.?\\d?\\w*";
//        String pattern = "\\w+\\s*=\\s*\\d[.\\w]*";
//        String pattern = "int\\s*=\\s*\\d[.\\w]*|float\\s*=\\s*\\d[.\\w]*";
//        String pattern = "(int|float)\\s*=\\s*\\d[.\\w]*";
        String pattern = "(int|float)\\s*=\\s*(\\d[.\\w]*)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()) {
//            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
//            System.out.println(matcher.group(2));
        }*/

/*//        String s = "127.0.0.1";
        String s = "127.168.255.255";
//        String pattern = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";
        String pattern = "(\\d{1,3}.){3}\\d{1,3}";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }*/
        /*String s = "01-10-2024";
        String pattern = "(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(19[0-9][0-9]|20[0-9][0-9])";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }*/

       /* String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта.";
//        String[] arr = s.split("\\.");
        String[] arr = s.split("[.]");
        for (String temp : arr) {
            System.out.println(temp);*/

       /* Pattern p = Pattern.compile(",\\s");
        String[] arr = p.split("Суворова Виктория, Россия, г. Сочи, +7 999 555-77-33");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        /*String s = "05-03-1987 // Дата рождения";
//        String s2 = s.replaceAll("\\s//.*","");
//        System.out.println("Дата рождения: " + s2); //Дата рождения: 05-03-1987
        String s2 = s.replaceAll("\\s//.*", "").replaceAll("-", ".");
        System.out.println("Дата рождения: " + s2); //Дата рождения: 05.03.1987*/

        // Побитовые операторы

       /* System.out.println(0b111 & 0b000); // 0b - префекс, & - амперсан
        System.out.println(0b111 & 0b001);
        System.out.println(0b111 & 0b010);
        System.out.println(7 & 0);
        System.out.println(7 & 1);
        System.out.println(7 & 2);*/

        /*System.out.println(0b101 | 0b010);
        System.out.println(0b011 | 0b100);
        System.out.println(0b010 | 0b100);*/

//        System.out.println(0b110 ^ 0b101);
//        System.out.println(0b101 ^ 0b010);
//        System.out.println(0b100 ^ 0b111);

        /*System.out.println(~0b0);
        System.out.println(~0b1);
        System.out.println(~0);
        System.out.println(~1);*/

        /*System.out.print("Введи число: ");
        int number = input.nextInt();
        if ((number & 1) == 0){
            System.out.println(number + " - четное число");
        }
        if ((number & 2) == 1){
            System.out.println(number + " - нечетное число");
        }*/

        /*int x = 1;
        double y = 3.1515;
//        x = (int) (x + y);
//        x = x + (int)y;
        x +=y;
        System.out.println(x);*/

        /*int x = 5, y = 7;
        System.out.println("x = " + x + ", y = " + y);
        *//*x = x^y;
        y = x^y;
        x = x^y;*//*
        y ^= (x ^= y);
        x ^= y;
        System.out.println("x = " + x + ", y = " + y);*/

        System.out.println(0b101 >> 1);
        System.out.println(5 >> 1);
        System.out.println(5 >> 2);

    }
}
