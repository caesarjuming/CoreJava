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
         Create by Caesar,2016/2/17
*/

import java.io.Serializable;

public class TypeQualified {
    //extends����������߽ӿ�,�����&�ָ���
    //����޶����������һ���࣬���ұ����ڵ�һ��λ��
    public static <T extends Number&Comparable&Serializable> T getFirst(T[] a){
        return a[0];
    }

    public static void main(String[] args) {
        //������Integer��������뱨����Ϊint�ǻ������ͣ�û��ʵ��Comparable
        int i=TypeQualified.getFirst(new Integer[]{1,2,3});
        System.out.println(i);
    }
}
