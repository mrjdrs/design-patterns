package adapter.demo3.after;

import adapter.demo3.CThirdFilter;

/**
 * @author zhoude
 * @date 2020/4/11 13:10
 */
public class CThirdFilterImpl implements IThirdFilter {

    private CThirdFilter filter;

    public CThirdFilterImpl(CThirdFilter aThirdFilter) {
        this.filter = aThirdFilter;
    }

    @Override
    public String filter(String text) {
        return filter.filter(text, "***");
    }
}
