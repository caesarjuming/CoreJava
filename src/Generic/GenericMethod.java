package Generic;/*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
         佛祖保佑       永无BUG
         Create by Caesar,2016/2/17
*/

public class GenericMethod {

    //普通方法也可以定义泛型方法
    public static <T> T getFirst(T... a){
        return a[0];
    }

    public static void main(String[] args) {

        //调用泛型方法时，在方法名前
        String str=GenericMethod.<String>getFirst("aa","bb","cc");
        System.out.println(str);
        //也可以省略泛型，可以自动推断
        Integer inter=GenericMethod.getFirst(1,2,3,4);
        System.out.println(inter);

        //但是有歧义的地方就不能够推断了,编译错误，会寻找int和double共同的超类
        //Integer inter2=GenericMethod.getFirst(1,2.0,3.111,4);

        //任何对象类型可以用null
        String str2=GenericMethod.getFirst(null,"a","b");
        System.out.println(str2);

    }
}
