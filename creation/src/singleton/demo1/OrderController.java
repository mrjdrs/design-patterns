package singleton.demo1;

import java.io.IOException;
import java.text.MessageFormat;

/**
 * @author zhoude
 * @date 2020/4/4 15:45
 */
public class OrderController {

    private Logger log = new Logger();

    public OrderController() throws IOException {
    }

    public void find(long orderId) throws IOException {
        log.log(MessageFormat.format("find orderId={0}", orderId));
    }
}
