/**
 * @Author: zhouaqiang
 * @Date: 2019/2/25 0025 下午 3:35
 * @Desc:
 */
package cn.lcp.fcct;

/**
 * @Author: zhouaqiang
 * @Date: 2019/2/25 0025 下午 3:35
 * @Desc:
 */
public class OtherTest {

    public static void main(String[] args) {
        String str = "qrscene_FOCUS_SALES_118954";

        int index = str.indexOf("FOCUS_SALES_");
        int prex = index + "FOCUS_SALES_".length();
        System.out.println(index+"+"+"FOCUS_SALES_".length());

        System.out.println(str.substring(prex));
    }
}
