package Chapter7;

/**
 * 公交车价格计算策略
 */
public class BusStrategy implements CalculateStrategy {

    /**
     * 公交车收费：十公里之内一元钱，超过十公里之后每加一元钱可以乘五公里
     * @param km 公里
     * @return
     */
    @Override
    public int calculatePrice(int km) {
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
}
