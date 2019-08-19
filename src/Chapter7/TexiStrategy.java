package Chapter7;

/**
 * 出租车计算策略
 */
public class TexiStrategy implements CalculateStrategy {

    /**
     * 价格计算简化为公里数 * 2
     * @param km 公里
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        return km * 2;
    }
}
