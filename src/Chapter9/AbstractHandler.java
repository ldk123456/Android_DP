package Chapter9;

public abstract class AbstractHandler {

    //下一节点上的处理者对象
    protected AbstractHandler nextHandler;

    /**
     * 处理请求
     * @param request 请求对象
     */
    public final void handleRequest(AbstractRequest request) {
        //判断当前处理者对象的处理级别是否与请求者的处理级别一致
        if (getHandleLevel() == request.getRequestLevel()) {
            //一致则由该处理对象处理
            handle(request);
        } else {
            //否则将该请求转发给下一节点上的请求对象
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                //当所有处理者对象均不能处理该请求时输出
                System.out.println("All of handler can not handle the request");
            }
        }
    }

    /**
     * 获取处理者对象的处理级别
     * @return 处理级别
     */
    protected abstract int getHandleLevel();

    /**
     * 每个处理者对象的具体处理方式
     * @param request 请求者对象
     */
    protected abstract void handle(AbstractRequest request);

}
