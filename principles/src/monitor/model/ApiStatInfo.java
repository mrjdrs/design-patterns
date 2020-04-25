package monitor.model;

/**
 * api统计model
 *
 * @author zhoude
 * @date 2020/4/25 17:24
 */
public class ApiStatInfo {
    /**
     * api url
     */
    private String api;

    /**
     * 请求次数
     */
    private long requestCount;

    /**
     * 错误次数
     */
    private long errCount;

    /**
     * 超时时间
     */
    private long timeout;

    /**
     * 持续时间（单位秒）
     */
    private long durationOfSeconds;

//  getter and setter

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public long getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(long requestCount) {
        this.requestCount = requestCount;
    }

    public long getErrCount() {
        return errCount;
    }

    public void setErrCount(long errCount) {
        this.errCount = errCount;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public long getDurationOfSeconds() {
        return durationOfSeconds;
    }

    public void setDurationOfSeconds(long durationOfSeconds) {
        this.durationOfSeconds = durationOfSeconds;
    }
}
