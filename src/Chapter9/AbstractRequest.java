package Chapter9;

public abstract class AbstractRequest {

    //处理对象
    private Object obj;

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    /**
     * 获取处理的内容对象
     * @return 具体的内容对象
     */
    public Object getContent() {
        return obj;
    }

    /**
     * 获取请求等级
     * @return 请求等级
     */
    public abstract int getRequestLevel();

}
