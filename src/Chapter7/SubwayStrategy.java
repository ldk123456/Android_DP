package Chapter7;

/**
 * 地铁价格计算策略
 */
public class SubwayStrategy implements CalculateStrategy {

    /**
     * @param km 公里
     * @return
     */
    @Override
    public int calculatePrice(int km) {
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
}
