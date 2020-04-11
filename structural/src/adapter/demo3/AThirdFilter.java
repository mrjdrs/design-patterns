package adapter.demo3;

/**
 * A系统敏感词过滤
 *
 * @author zhoude
 * @date 2020/4/11 13:00
 */
public class AThirdFilter {

    /**
     * text是原始文本，函数输出用***替换敏感词之后的文本
     */
    public String filterSexyWords(String text) {
        // 伪实现
        return "***";
    }

    public String filterPoliticalWords(String text) {
        // 伪实现
        return "+++";
    }
}
