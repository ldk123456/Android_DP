package Chapter7;

public class PriceCalculator {

    //公交车类型
    private static final int BUS = 1;
    //地铁类型
    private static final int SUBWAY = 2;

    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator();
        System.out.println("16公里的公交车票价为：" + calculator.calculatePrice(16, BUS));
        System.out.println("16公里地铁票价为：" + calculator.calculatePrice(16, SUBWAY));
    }

    /**
     * 公交车收费：十公里之内一元钱，超过十公里之后每加一元钱可以乘五公里
     * @param km 公里
     * @return
     */
    private int busPrice(int km) {
        //超过十公里的总距离
        int extraTotal = km - 10;
        //超过的距离是五公里的倍数
        int extraFactor = extraTotal / 5;
        //超过的距离对五公里取余
        int fraction = extraTotal % 5;
        extraFactor = fraction > 0 ? extraFactor + 1 : extraFactor;
        //计算价格
        int price = 1 + extraFactor * 1;
        return  price;
    }

    /**
     * @param km 公里
     * @return
     */
    private int subwayPrice(int km) {
        if (km <= 6) {
            return 3;
        }else if (km > 6 && km < 12) {
            return 4;
        }else if (km > 12 && km < 22) {
            return 5;
        }else if (km > 22 && km < 32) {
            return 6;
        }
        //其他距离简化为7元
        return 7;
    }

    int calculatePrice(int km, int type) {
        if (type == BUS) {
            return busPrice(km);
        }else if (type == SUBWAY) {
            return subwayPrice(km);
        }
        return 0;
    }
}
