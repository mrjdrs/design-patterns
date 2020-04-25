package visitors.demo1;

/**
 * @author zhoude
 * @date 2020/4/25 11:50
 */
public abstract class ResourceFile {
    /**
     * 读取文件地址
     */
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 接受提取器并提取数据转为txt
     *
     * @param visitor 游客类
     */
    protected abstract void accept(Visitor visitor);
}
