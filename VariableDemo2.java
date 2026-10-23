public class VariableDemo2 {
    public static void main(String[] args) {
        //我方攻击伤害220
        int attack1 =220;
        //敌方攻击伤害210
      //  int attack2 =210;
        //我方防御85
       // int defense1 =85;
        //敌方防御80
        int defense2 =80;
        //我方血量1012.5;
       // double blood1 =1012.5;
        //敌方血量1223.3;
        double blood2 =1223.3;
        //我放技能加成1.2;
        double skill1 =1.2;
        //敌方技能加成1.3;
        //double skill2 =1.3;
        //技能伤害计算公式:伤害*技能加成-对方防御
       
        //普工造成伤害公式；攻击力-对方防御力
        double damage3 = attack1-defense2;
      
    //计算我方第一次进行普通攻击，造成多少伤害，对方还剩多少血量？
    double remainingBlood = blood2-damage3;
    //输出对方第一次攻击后剩余血量
    System.out.println("对方剩余血量是:"+remainingBlood);
    //我方进行第二次技能攻击，造成多少伤害，对方还剩多少血量？
    double remainingBlood2 = remainingBlood- skill1*attack1+defense2;  
   //输出对方两次攻击后剩余血量
    System.out.println("对方剩余血量是:"+remainingBlood2);
//注意事项 1.变量只能存一个值 2.变量名不能重复定义 3.变量在使用前一定要进行复制4.一条语句可以定义多个变量，也可以连续赋值

    

    }
    
}
