public class VariableDemo3 {
        public static void main(String[] args) {
            /*  
            定义8种数据类型的变量
               整数类型；byte,short,int,long
               浮点数类型；float,double
               字符类型；char
               布尔类型；boolean  
            
               变量的定义格式；
                         数据类型 变量名 =数据值；   */
        //1.定义byte类型变量
        byte a = 10;
        System.out.println(a);
     //2.定义short类型的变量
        short b = 20;
        System.out.println(b);
    //定义int类型的变量
        int c = 30;
        System.out.println(c);
        //定义long类型的变量
        //细节；long类型数据必须以L结尾，否则会报错，l可以大写也可以小写，但是建议使用大写L，避免和数字1混淆
        long d = 40000000000L;
        System.out.println(d);
        //定义float类型的变量
        //细节；float类型数据必须以F结尾，否则会报错，f可以大写也可以小写
        float e = 3.14F;
        System.out.println(e);  
        //6.字符类型char
        char f = 'A';
        System.out.println(f);
        //7.布尔类型boolean
        boolean g = true;
        System.out.println(g);  
}}

