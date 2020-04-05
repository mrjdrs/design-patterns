package singleton.demo1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 日志
 *
 * @author zhoude
 * @date 2020/4/4 15:41
 */
public class Logger {

    private FileWriter fileWriter;

    public Logger() throws IOException {
        File file = new File("E:\\codeTest\\log.txt");
        // true >>> 写入的字符追加到文件末尾
        fileWriter = new FileWriter(file, true);
    }

    public void log(String message) throws IOException {
        synchronized (Logger.class) {
            fileWriter.write(message);
        }
    }
}
