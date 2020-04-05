package singleton.demo1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 日志增强模式-单例
 *
 * @author zhoude
 * @date 2020/4/4 15:41
 */
public class LoggerBuff {

    private FileWriter fileWriter;
    private static LoggerBuff INSTANCE;

    static {
        try {
            INSTANCE = new LoggerBuff();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public LoggerBuff() throws IOException {
        File file = new File("E:\\codeTest\\log.txt");
        // true >>> 写入的字符追加到文件末尾
        fileWriter = new FileWriter(file, true);
    }

    public LoggerBuff getInstance() {
        return INSTANCE;
    }

    public void log(String message) throws IOException {
        synchronized (LoggerBuff.class) {
            fileWriter.write(message);
        }
    }
}
