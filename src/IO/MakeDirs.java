package IO;

import java.io.File;

/**
 * Created by caesar on 16/4/4.
 */
public class MakeDirs {
    private static void fileData(File file) {
        System.err.println(file.getAbsolutePath() + "\n"
                + file.canRead() + "\n"
                + file.canWrite() + "\n"
                + file.getName()+"\n"
                + file.getParent()+"\n"
                + file.lastModified()+"\n"
        );
    }

    private static boolean makeDirs(String path){
        return new File(path).mkdirs();
    }


}
