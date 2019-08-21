package Chapter12;

public class Test {
    public static void main(String[] args) {
        //被观察者
        DevTechFrontier devTechFrontier = new DevTechFrontier();
        //观察者
        Coder mrSimple = new Coder("mr.simple");
        Coder coder1 = new Coder("coder1");
        Coder coder2 = new Coder("coder2");
        Coder coder3 = new Coder("coder3");

        //将观察者注册到被观察者的观察者列表中
        devTechFrontier.addObserver(mrSimple);
        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder2);

        //发布消息
        devTechFrontier.postNewPublication("新一期的开发技术前线周报发布啦！");

    }
}
