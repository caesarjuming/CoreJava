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

import java.io.Serializable;

public class TypeQualified {
    //extends可以是类或者接口,多个用&分隔开
    //多个限定类型中最多一个类，而且必须在第一个位置
    public static <T extends Number&Comparable&Serializable> T getFirst(T[] a){
        return a[0];
    }

    public static void main(String[] args) {
        //必须是Integer，否则编译报错，因为int是基本类型，没有实现Comparable
        int i=TypeQualified.getFirst(new Integer[]{1,2,3});
        System.out.println(i);
    }
}
