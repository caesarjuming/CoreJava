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

public class GenericMethod {

    //��ͨ����Ҳ���Զ��巺�ͷ���
    public static <T> T getFirst(T... a){
        return a[0];
    }

    public static void main(String[] args) {

        //���÷��ͷ���ʱ���ڷ�����ǰ
        String str=GenericMethod.<String>getFirst("aa","bb","cc");
        System.out.println(str);
        //Ҳ����ʡ�Է��ͣ������Զ��ƶ�
        Integer inter=GenericMethod.getFirst(1,2,3,4);
        System.out.println(inter);

        //����������ĵط��Ͳ��ܹ��ƶ���,������󣬻�Ѱ��int��double��ͬ�ĳ���
        //Integer inter2=GenericMethod.getFirst(1,2.0,3.111,4);

        //�κζ������Ϳ�����null
        String str2=GenericMethod.getFirst(null,"a","b");
        System.out.println(str2);

    }
}
