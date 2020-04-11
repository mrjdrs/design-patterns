package adapter.demo3.before;

import adapter.demo3.AThirdFilter;
import adapter.demo3.BThirdFilter;
import adapter.demo3.CThirdFilter;

/**
 * @author zhoude
 * @date 2020/4/11 13:04
 */
public class Test {

    private AThirdFilter aThirdFilter = new AThirdFilter();
    private BThirdFilter bThirdFilter = new BThirdFilter();
    private CThirdFilter cThirdFilter = new CThirdFilter();

    public String filter(String text) {
        // 未使用适配器模式之前的代码：代码的可测试性、扩展性不好
        String result = aThirdFilter.filterPoliticalWords(text);
        result = aThirdFilter.filterSexyWords(result);
        result = bThirdFilter.filter(result);
        result = cThirdFilter.filter(result, "***");
        return result;
    }
}
