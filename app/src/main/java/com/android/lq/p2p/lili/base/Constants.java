package com.android.lq.p2p.lili.base;import java.util.Properties;import android.content.Context;import com.android.lq.p2p.lili.util.PropertiesUtil;/** * 常量类 * * @author 吕强 */public class Constants {    /**     * 易用汇日志输出默认TAG     */    public static final String LOG_TAG = "Aili";    private static Properties properties;    public static void init(Context context) {        if (properties == null) {            properties = PropertiesUtil.initProperties(context);        }    }    public static String getProperty(String key) {        return properties.getProperty(key, "");    }}