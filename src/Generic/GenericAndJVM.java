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

//泛型在编译的时候会被擦除为第一个限定类型来替换，如果没有给定的限定类型，就为Object
public class GenericAndJVM {

    //限定类型为Comparable ，擦除为Comparable
    public static <T extends Comparable&Serializable> T getFirst(T... aa){
        return aa[0];
    }
    //擦除为Serializable
    //为了提高效率，将标签接口(没有方法的接口)放在边界表的末尾
    public static <T extends Serializable&Comparable> T getFirst2(T... aa){
        return aa[0];
    }

    public static void main(String[] args) {
        //擦除为Object后又被强转为Integer然后赋值给i
        Integer i=GenericAndJVM.getFirst(new Integer[]{1,2,3});

    }

}
