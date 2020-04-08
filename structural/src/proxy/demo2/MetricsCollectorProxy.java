package proxy.demo2;

import proxy.MetricsCollector;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhoude
 * @date 2020/4/7 21:51
 */
public class MetricsCollectorProxy {

    private MetricsCollector metricsCollector;

    public MetricsCollectorProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    /**
     * 创建代理类
     *
     * @param target 被代理类
     * @return 代理类
     */
    public Object createProxy(Object target) {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        DynamicProxyHandler proxyHandler = new DynamicProxyHandler(target);
        return Proxy.newProxyInstance(classLoader, interfaces, proxyHandler);
    }

    private class DynamicProxyHandler implements InvocationHandler {
        private Object proxiedObject;

        DynamicProxyHandler(Object proxiedObject) {
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long start = System.currentTimeMillis();
            Object result = method.invoke(proxiedObject, args);
            long end = System.currentTimeMillis();
            long resTime = end - start;
            String apiName = proxiedObject.getClass().getName() + ":" + method.getName();
            metricsCollector.record(apiName, resTime);
            return result;
        }
    }
}
