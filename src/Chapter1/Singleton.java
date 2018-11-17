package Chapter1;

/*//懒汉模式
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}*/

/*
//DCL
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null){
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}*/

/*
public class Singleton {
    private Singleton() {}
    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
    //静态内部类
    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }
}*/

/*
//枚举单例
public enum Singleton {
    INSTANCE;
}*/

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class Singleton implements Serializable {
    private static final long serialVersionUID = 0L;
    private static final Singleton INSTANCE = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return INSTANCE;
    }
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}

class SingletonManager {
    private static Map<String, Object> objMap = new HashMap<>();
    private SingletonManager() {}
    public static void registerService(String key, Object instance) {
        if (!objMap.containsKey(key)) {
            objMap.put(key, instance);
        }
    }
    public static Object getService(String key) {
        return objMap.get(key);
    }
}