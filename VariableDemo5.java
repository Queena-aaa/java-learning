//确定Scanner类所在的包位置
import java.util.Scanner;

public class VariableDemo5 {

    public static void main(String[] args) {
      /*键盘录入；
          第一步；找到Scanner这个打工人
          第二步；让Scanner干活 */
          
          //1.找到Scanner这个打工人
          Scanner sc = new Scanner(System.in);
          //2.让Scanner干活     
          //接收键盘录入的整数
         // int num = sc.nextInt(); 
         //System.out.println(num);

          //接收键盘录入的小数
          //double d = sc.nextDouble(); 
          //System.out.println(d);

          //接收键盘录入的字符
           String str =sc.next();
           System.out.println(str);

          //接收键盘录入的布尔值
          //boolean b = sc.nextBoolean(); 

    }
    
}
