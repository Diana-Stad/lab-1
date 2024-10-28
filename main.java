import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    // Объявляем объект класса PrintStream для вывода данных
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
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
            //начинаем проверку остальных условий,сейчас у нас есть варианты xywz/xyzw/xwyz/xwzy/xzyw/xzwy/zxwy/zxyw/zwxy/wzxy/wxyz/wxzy
            if (y>w)
              //далее в комментариях будут написаны варианты,которые предполагаются на данном моменте. xywz/xyzw/xzyw/zxyw
                if (w>z)
                //xyWz
                    out.print(w);
                else
                // xyzw/xzyw/zxyw
                    if (y>z)
                    //xyZw
                        out.print(z);
                    else
                      //xzYw/zxYw
                        out.print(y);
            else
            //xwyz/xwzy/xzwy/zxwy/zwxy/wzxy
                if (x>w)
                  //xwyz/xwzy/xzwy/zxwy
                    if (x>z)
                     //xwyz/xwzy/xzwy
                        if (w>z)
                      //xwyz/xwzy
                            if (z>y)
                              //xwZy
                                out.print(z);
                            else
                             //xwYz 
                                out.print(y);
                        else
                          //xzWy
                            out.print(w);
                    else
                  //zxWy
                        out.print(w);
                else
                  //zwxy/wzxy/wzxy
                    if (z>w)
                     //zwXy
                        out.print(x);
                    else
                    ///wzxy/wxzy/wxyz
                      if (z>x)
                      //wzXy
                            out.print(x);
                        else
                          //wxzy/wxyz
                            if (z>y)
                             //wxZy 
                                out.print(z);
                            else
                                //wxyz
                                out.print(y);
        //Рассматриваем второй случай - x<y
        else
          //yxwz/yxzw/ywxz/ywzx/yzxw/yzwx/zywx/zyxw/zwyx/wzyx/wyxz/wyzx
            //начинаем проверку остальных условий
            if (y>w)
          //yxwz/yxzw/ywxz/ywzx/yzxw/yzwx/zywx/zyxw
                if (w>x)
                    //ywxz/ywzx/yzwx/zywx
                    if (y>z)
                        //ywxz/ywzx/yzwx
                        if (w>z)
                          //ywxz/ywzx
                            if (z>x)
                              //ywZx
                              out.print(z);
                            else
                            //ywXz
                              out.print(x);
                        else
                        //yzWx
                            out.print(w);
                    else
                      //zyWx
                        out.print(w);
                else
                //yxwz/yxzw/yzxw/zyxw
                    if (y>z)
                    //yxwz/yxzw/yzxw
                        if (x>z)
                        //yxwz/yxzw
                           if (z>w)
                              //yxZw
                              out.print(z);
                           else
                            //yxWz
                            out.print(w);   
                        else
                        //yzXw
                            out.print(x);
                    else
                    //zyXw
                        out.print(x);
            else
            //zwyx/wzyx/wyxz/wyzx
                if (z>w)
                  //zwYx
                    out.print(y);
                else
                  //wzyx/wyxz/wyzx
                    if (z>y)
                    //wzYx
                        out.print(y);
                    else
                      //wyxz/wyzx
                        if (z>x)
                          //wyZx
                            out.print(z);
                        else
                          //wyXz
                            out.print(x);


    }
}
