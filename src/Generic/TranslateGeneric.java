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
         ���汣��       ����BUG
         Create by Caesar,2016/2/18
*/

import java.util.Comparator;

public class TranslateGeneric<K,V> {
    private K a;
    private V b;

    TranslateGeneric(K a,V b){
        this.a=a;
        this.b=b;
    }
    public K getA() {
        return a;
    }

    public void setA(K a) {
        this.a = a;
    }

    public V getB() {
        return b;
    }

    public void setB(V b) {
        this.b = b;
    }

    //�˷����������Ϊ
    //public static Comparator T getFirst()
    public static <T extends Comparable>  T getFirst(){
        return null;
    }

    public static void main(String[] args) {
        //<>�Զ��ƶ�����
        TranslateGeneric tg=new TranslateGeneric<>("aaa",22);
        //��ȡ��ʱ����Object��Ȼ��ǿת��
        System.out.println(tg.a instanceof String);
        System.out.println(tg.b instanceof Integer);

        //null�������κ�����ʵ��
        System.out.println(null instanceof Integer);
        System.out.println(null instanceof Object);
    }
}
