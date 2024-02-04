import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class l2201 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Сравнение строк на равенство
        /*String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLO";
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3)); // игнорировать регистр*/

        /*System.out.println("I learning Java".endsWith("Java"));// Проверка окончания строки
        System.out.println("I learning Java".startsWith("I"));// Проверка начала строки
        System.out.println("I learning Java".contains("I"));// Проверка содержит ли заданную подстроку
*/

        /*System.out.print("Введите название документа: ");
        String patch= input.nextLine();
        if (patch.endsWith(".jpg")|| patch.endsWith(".jpeg")||patch.endsWith(".png")){
            System.out.println("Это изображение");
        } else if (patch.endsWith(".docx")||patch.endsWith(".doc")){
            System.out.println("Это документ Words");
        }else {
            System.out.println("Неизвестный формат");
        }*/

        //  Код символа по его индексу
        /*String s = "I learning Java";
        int n;
        n = s.codePointAt(5); // код символа по его индексу в строке
        System.out.println(n);
        n = s.codePointBefore(5);
        System.out.println(n);*/

// Преобразование типов данных в строку
        /*String s;
        double d = 3.8567;
        s = String.valueOf(d); // Преобразование в строку
        System.out.println(s);*/

// Лексикографическое сравнение двух строк
        /*String str = "a";
        System.out.println("a > d : " + str.compareToIgnoreCase("b")); // Игнорировать верхний регистр
        str = "d";
        System.out.println("d > a : " + str.compareTo("a"));
        System.out.println("d == d : " + str.compareTo("d"));*/

        /*StringBuilder sb = new StringBuilder();
           //  sb.append('a');
           //  sb.append(10);
           //  sb.append(123456L);
           //  sb.append(12.34);
           //  sb.append(12.34f);
           //  System.out.println(sb);
        sb.append("Hello").append(" ").append("World");
        System.out.println(sb);
        sb.insert(5, "_!");
        System.out.println(sb);
        sb.delete(5, 7);
        System.out.println(sb);
        sb.replace(5,10,"Java");
        System.out.println(sb);
        String st = sb.substring(5);
        System.out.println(st);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.indexOf("l"));
        System.out.println(sb.indexOf("l", 7));*/

        /*StringBuilder sb1 = createStr(5, 3);
        modifySr(sb1,"=","равно");
        modifySr(sb1, "+","плюс");
        modifySr(sb1, "-","минус");
        modifySr(sb1, "*","умножить");
        System.out.println(sb1);

    }

    public static StringBuilder modifySr(StringBuilder stBuild, String oldStr, String newStr) {
        int pos;
        while ((pos = stBuild.indexOf(oldStr)) != -1) {

            stBuild.replace(pos, pos + 1, newStr);
        }
        return stBuild;

    }

    public static StringBuilder createStr(int a, int b) {
        StringBuilder res = new StringBuilder();
        res.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        res.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        res.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return res;
    }*/

        /*StringBuilder modStr = getStringBuilbert();
        System.out.println("Измененная строка - \"" + modStr + "\"");

    }
    public static StringBuilder getStringBuilbert(){
        System.out.print("Измененная строка - \"");
        String str = "Текст с повторяющимся символами";
        System.out.println(str + "\"");
        StringBuilder modify = new StringBuilder(str.replace(" ", ""));
        for (int i = 0; i < modify.length(); i++) {
            for (int j = modify.length()-1; j > i; j--) {
                if (modify.charAt(i)== modify.charAt(j)){
                    modify.deleteCharAt(j);

                }

            }

        }
        return modify;*/

        // Регулярные выражения
        String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. 98765";
//        String pattern = "[204]"; //[...] - один символ из перечисленных
//        String pattern = "[0-9]";// [0-9] - диапазон символов
//        String pattern = "[12][0-9][0-9][0-9]";
        String pattern = "[а-я]";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        /*System.out.println(matcher.find());*/
        while (matcher.find()) {
//            System.out.println("Шаблон совпадения найден с " + matcher.start() + " по " + (matcher.end()-1));3
//            System.out.println(s.substring(matcher.start() + matcher.end()));
            System.out.print(matcher.group());

        }
        String str = "абяё";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+": " + str.codePointAt(i));

        }

    }
}
