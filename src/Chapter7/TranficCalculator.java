package Chapter7;

public class TranficCalculator {
    public static void main(String[] args) {
        TranficCalculator calculator = new TranficCalculator();
        //设置出行方式（公交车价格计算策略）
        calculator.setStrategy(new BusStrategy());
        //计算价格
        System.out.println("16公里的公交车票价为：" + calculator.calculatePrice(16));

        //设置出行方式（出租车价格计算策略）
        calculator.setStrategy(new TexiStrategy());
        //计算价格
        System.out.println("16公里的出租车车票价为：" + calculator.calculatePrice(16));
    }

    //出行方式
    CalculateStrategy mStrategy;
    private void setStrategy(CalculateStrategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    private int calculatePrice(int km) {
        return mStrategy.calculatePrice(km);
    }
}
