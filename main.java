import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    // Объявляем объект класса PrintStream для вывода данных
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args)  {
        // Считывание четырех целых чисел x,y,w,z из консоли
        out.println("Введите 4 различных целых числа");
        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int z = in.nextInt();
        // Объявили минимум и максимум области значений
        int min = -(int)Math.pow(10, 9);
        int max = (int)Math.pow(10, 9);
        // Проверка, входит ли число в диапазон
        while (x <= min || x >= max || y<= min || y>=max ||w<= min || w>=max ||z<= min || z>=max) {
             out.println("В последовательности присутствует число, которое не входит в диапазон `-10^9 < ваше число < 10^9`. " +
                      "Введите последовательность, в которой каждое число в ходит в диапазон допустимых значений:");
             x = in.nextInt();
             y = in.nextInt();
             w = in.nextInt();
             z = in.nextInt();}
        //рассматриваем первый случай - x>y
        if (x>y)
            //начинаем проверку остальных условий
            if (y>w)
                if (w>z)
                    out.print(w);
                else
                    if (y>z)
                        out.print(z);
                    else
                        out.print(y);
            else
                if (x>w)
                    if (x>z)
                        if (w>z)
                            if (z>y)
                                out.print(z);
                            else
                                out.print(y);
                        else
                            out.print(w);
                    else
                        out.print(w);
                else
                    if (z>w)
                        out.print(x);
                    else
                        if (z>x)
                            out.print(x);
                        else
                            if (z>y)
                                out.print(z);
                            else
                                out.print(y);
        //Рассматриваем второй случай - x<y
        else
            //начинаем проверку остальных условий
            if (y>w)
                if (w>x)
                    if (y>z)
                        if (w>z)
                            out.print(z);
                        else
                            out.print(w);
                    else
                        out.print(w);
                else
                    if (y>z)
                        if (x>z)
                            out.print(z);
                        else
                            out.print(x);
                    else
                        out.print(x);
            else
                if (z>w)
                    out.print(y);
                else
                    if (z>y)
                        out.print(y);
                    else
                        if (z>x)
                            out.print(z);
                        else
                            out.print(x);


    }

}
