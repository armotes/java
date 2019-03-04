
package com.lsx.code.other;

import java.io.File;
import java.io.IOException;

/**
 * @author: zhouaqiang
 * Date: 2019/2/28 0028 上午 11:40
 * Desc:
 */
public class LsxTest {
    public static void main(String[] args) {

        System.out.println("路径:"+System.getProperty("user.dir"));

        //设定为当前文件夹
        File directory = new File("");

        try {
            //获取标准的路径
            System.out.println(directory.getCanonicalPath());
            //获取绝对路径
            System.out.println(directory.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
