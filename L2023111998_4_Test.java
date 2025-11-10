import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 测试类：L2023111998_4_Test
 * 测试目标：Solution4.maximumGap(int[] nums)
 * 
 * 测试用例设计原则：等价类划分法
 * 根据题目要求和算法特性，划分以下等价类：
 * 1. 边界情况等价类：数组长度小于2（空数组、单元素数组）
 * 2. 正常情况等价类：已排序数组、未排序数组
 * 3. 特殊情况等价类：所有元素相同、包含大数值、负数情况
 * 4. 典型示例等价类：题目给出的标准示例
 */

public class L2023111998_4_Test {

    /**
     * 测试目的：验证数组长度小于2时返回0
     * 测试用例：单元素数组 [10]
     * 等价类：边界情况等价类
     */
    @Test
    public void testSingleElement() {
        Solution4 solution = new Solution4();
        int[] nums = {10};
        assertEquals("单元素数组应返回0", 0, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证空数组返回0
     * 测试用例：空数组 []
     * 等价类：边界情况等价类
     */
    @Test
    public void testEmptyArray() {
        Solution4 solution = new Solution4();
        int[] nums = {};
        assertEquals("空数组应返回0", 0, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证已排序数组能正确计算最大间隙
     * 测试用例：已排序数组 [1, 3, 6, 9]
     * 等价类：正常情况等价类（已排序）
     */
    @Test
    public void testSortedArray() {
        int[] nums = {1, 3, 6, 9};
        Solution4 solution = new Solution4();
        assertEquals("已排序数组应正确计算最大间隙", 3, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证未排序数组排序后能正确计算最大间隙
     * 测试用例：未排序数组 [3, 6, 9, 1]
     * 等价类：正常情况等价类（未排序）
     */
    @Test
    public void testUnsortedArray() {
        int[] nums = {3, 6, 9, 1};
        Solution4 solution = new Solution4();
        assertEquals("未排序数组排序后应正确计算最大间隙", 3, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证所有元素相同时最大间隙为0
     * 测试用例：相同元素数组 [5, 5, 5, 5]
     * 等价类：特殊情况等价类
     */
    @Test
    public void testAllSameElements() {
        int[] nums = {5, 5, 5, 5};
        Solution4 solution = new Solution4();
        assertEquals("所有元素相同时最大间隙应为0", 0, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证算法处理大数值的能力
     * 测试用例：大数值数组 [1000000, 1, 10000000, 100]
     * 等价类：特殊情况等价类（大数值）
     */
    @Test
    public void testLargeNumbers() {
        int[] nums = {1000000, 1, 10000000, 100};
        Solution4 solution = new Solution4();
        assertEquals("应正确处理大数值数组", 9000000, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证题目示例1的正确性
     * 测试用例：示例数组 [3, 6, 9, 1]
     * 等价类：典型示例等价类
     */
    @Test
    public void testExample1() {
        int[] nums = {3, 6, 9, 1};
        Solution4 solution = new Solution4();
        assertEquals("示例1应返回3", 3, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证题目示例2的正确性
     * 测试用例：单元素数组 [10]
     * 等价类：典型示例等价类
     */
    @Test
    public void testExample2() {
        int[] nums = {10};
        Solution4 solution = new Solution4();
        assertEquals("示例2应返回0", 0, solution.maximumGap(nums));
    }
}
