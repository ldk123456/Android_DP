package Chapter7;

/**
 * 计算接口
 */
public interface CalculateStrategy {
    /**
     * 根据距离计算价格
     * @param km 公里
     * @return 返回价格
     */
    int calculatePrice(int km);
}
