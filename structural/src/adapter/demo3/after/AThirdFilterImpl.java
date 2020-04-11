package adapter.demo3.after;

import adapter.demo3.AThirdFilter;

/**
 * @author zhoude
 * @date 2020/4/11 13:09
 */
public class AThirdFilterImpl implements IThirdFilter {

    private AThirdFilter filter;

    public AThirdFilterImpl(AThirdFilter aThirdFilter) {
        this.filter = aThirdFilter;
    }

    @Override
    public String filter(String text) {
        String result = filter.filterPoliticalWords(text);
        result = filter.filterSexyWords(result);
        return result;
    }
}
