package IO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by caesar on 16/4/4.
 */
public class MyFile {
    public static void main(String[] args) {
        // File 可以表示文件和文件夹
        File path = new File(".");
        String[]list;
        // 过滤文件
        list=path.list(new DirFilter(""));
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String dirItem:list){
            System.out.println(dirItem);
        }
    }
}

class DirFilter implements FilenameFilter{
    private Pattern pattern;

    public DirFilter(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }

}
