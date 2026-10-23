public class VariableDemo1 {
    //定义一个变量 定义格式: 数据类型 变量名 = 变量值;整数类型限定 关键字 int；浮点数 double；字符串 String；字符 char
    public static void main(String[] args) {
      /*微信余额；0元
      支付宝余额；10元
      银行卡余额；20
      问题一；请问现在一共有多少钱？
      问题二；微信收了10元红包，又发了2元红包余额是多少？ */

      //1.定义一个变量记录微信的余额
         double a  = 0;
    //2.定义一个变量记录支付宝的余额
            double b = 10;
    //定义一个变量记录银行卡的余额
            double c = 20;
    //4.输出现在总共多少钱
            System.out.println("现在总共的钱数是:"+(a+b+c));    
    //5.微信收了10元红包，又发了2元红包余额是多少？
            a = a + 10 - 2;
    //6.输出现在微信的余额
            System.out.println("现在微信的余额是:"+a);
    }

}
