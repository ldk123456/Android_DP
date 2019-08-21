package Chapter12;

import java.util.Observable;

/**
 * 被观察者，有更新是通知所有观察者（程序员）
 */
public class DevTechFrontier extends Observable {

    public void postNewPublication(String content) {
        //标志状态或者内容发送变化
        setChanged();
        //通知所有观察者
        notifyObservers(content);
    }

}
