import java.util.Scanner;

public class VariableDemo7 {
    public static void main(String[] args) {
       //BMI=体重/身高的平方


        Scanner sc = new Scanner(System.in);
       //1.键盘录入体重
        System.out.println("请输入体重(kg):");
       double weight =sc.nextDouble();
       System.out.println(weight);
       //2.键盘录入身高
      System.out.println("请输入身高");
       double height=sc.nextDouble();
       System.out.println(height);
       //3.计算bim
       double BIM = weight/(height*height);
       System.out.println(BIM);

      
    }
}
