package adapter.demo3.after;

/**
 * 第三方敏感词过滤统一接口
 *
 * @author zhoude
 * @date 2020/4/11 13:07
 */
public interface IThirdFilter {

    String filter(String text);
}
