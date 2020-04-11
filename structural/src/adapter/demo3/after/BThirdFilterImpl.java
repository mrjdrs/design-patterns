package adapter.demo3.after;

import adapter.demo3.BThirdFilter;

/**
 * @author zhoude
 * @date 2020/4/11 13:10
 */
public class BThirdFilterImpl implements IThirdFilter {

    private BThirdFilter filter;

    public BThirdFilterImpl(BThirdFilter aThirdFilter) {
        this.filter = aThirdFilter;
    }

    @Override
    public String filter(String text) {
        return filter.filter(text);
    }
}
