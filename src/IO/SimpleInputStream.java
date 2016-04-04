package IO;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.io.*;

/**
 * Created by caesar on 16/4/4.
 */
// 面向字节
public class SimpleInputStream {

    // PushbackInputStream           能弹出一个字节的缓冲区

    // ByteArrayInputStream          内存的缓冲区
    // StringBufferInputStream       String转化为InputStream
    // FileInputStream               文件读取信息
    // PipedInputStream              管道,多线程的数据源
    // SequenceInputStream           将两个多个InputStream转换成一个
    // FilterInputStream             为其他的InputStream提供有用的功能
    //          |
    //          |
    //         \|/
    // DataInputStream               读取流的基本类型
    // BufferedInputStream           使用缓冲区
    // LineNumberInputStream         根据输入流中的行号
    public static String read(String filename) throws IOException {
        BufferedReader in=new BufferedReader(new FileReader(filename));
        // readLine 已经删除掉了换行符
        String s;
        StringBuilder sb=new StringBuilder();
        while((s=in.readLine())!=null){
            sb.append(s+"\n");
        }
        in.close();
        return sb.toString();
    }

    public static String convertByteRead(String filename) throws IOException {
        try {
            DataInputStream dataInputStream=new DataInputStream(new ByteArrayInputStream(read("src/IO/abc.txt").getBytes()));

            while (dataInputStream.available()!=0){
                System.out.println(dataInputStream.readByte());
            }

            dataInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        try {
            System.out.println(read("src/IO/abc.txt"));
            convertByteRead("src/IO/abc.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
