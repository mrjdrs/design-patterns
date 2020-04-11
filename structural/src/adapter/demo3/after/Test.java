package adapter.demo3.after;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoude
 * @date 2020/4/11 13:12
 */
public class Test {

    private List<IThirdFilter> filterList = new ArrayList<>();

    public void addFilter(IThirdFilter filter) {
        filterList.add(filter);
    }

    public String filter(String text) {
        String result = text;
        for (IThirdFilter filter : filterList) {
            result = filter.filter(result);
        }
        return result;
    }
}
