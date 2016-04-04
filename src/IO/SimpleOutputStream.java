package IO;

import java.io.*;

/**
 * Created by caesar on 16/4/4.
 */
// 面向字节
public class SimpleOutputStream {
    // ByteArrayOutputStream    内存
    // FileOutputStream         文件
    // PipedOutputStream        管道

    // FilterOutputStream 为被修饰的类提供通用接口
    // 子类通过继承它,修改其中的方法,然后进行装饰
    //          |
    //          |
    //         \|/
    // DataOutputStream         基本数据类型操作
    // PrintStream              格式化输出
    // BufferedOutputStream     缓冲区

}
