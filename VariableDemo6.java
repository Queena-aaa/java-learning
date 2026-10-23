
import java.util.Scanner;

public class VariableDemo6 {
    public static void main(String[] args) {
       /*定义两个整数类型的变量num1和num2,键盘录入数据分别为两个变量赋值。
       求两个数的和并打印 */

       //找到Scanner这个打工人
       Scanner sc = new Scanner(System.in);
       //2. 让Scanner这个打工人干活,让他去键盘录入数据
       System.out.println("请输入第一个整数:");
         int num1 = sc.nextInt();
         System.out.println(num1);
        
         System.out.println("请输入第二个整数:");
         int num2 = sc.nextInt();
         System.out.println(num2);
        
        
         int sum = num1 + num2;
         System.out.println("两个数的和是: " + sum);

    }
    
}
