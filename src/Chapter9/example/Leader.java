package Chapter9.example;

public abstract class Leader {

    //上一级领导处理者
    protected Leader nextHandler;

    /**
     * 处理报账请求
     * @param money 报销的钱数
     */
    public final void handleRequest(int money) {
        if (money <= limit()) {
            handle(money);
        } else {
            if (null != nextHandler) {
                nextHandler.handleRequest(money);
            }
        }
    }

    /**
     * 自身能批复的额度
     * @return 额度
     */
    public abstract int limit();

    /**
     * 处理报账
     * @param money 具体金额
     */
    public abstract void handle(int money);

}
