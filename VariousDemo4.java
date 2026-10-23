public class VariousDemo4 {
    public static void main(String[] args) {
       //BMI=体重(kg)/身高(m)*身高(m)
       //定义身高变量
         double height = 1.61;
         //定义体重变量
            double weight = 47;
            //计算BMI
            double BMI = weight/(height*height);
            //输出BMI   
            System.out.println(BMI);


    //扩展；
    //计算出你当前身高，在标准bmi，最多是多少千克？正常bmi范围是18.5-23.9，计算出你当前身高，在标准bmi，最多是多少千克？
    //体重=标准bmi*身高*身高
    //定义你的身高
    double height1 = 1.61;
    //定义标准bmi的最大值   
    double standardBMI = 23.9;
    //计算出你当前身高，在标准bmi，最多是多少千克？ 
    double weight1 = standardBMI*height1*height1;
    //输出结果
    System.out.println(weight1);


    }
}
