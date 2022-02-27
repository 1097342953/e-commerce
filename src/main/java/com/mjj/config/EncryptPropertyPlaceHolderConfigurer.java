package com.mjj.config;

import com.mjj.utils.DESUtils;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.io.IOException;
import java.util.Properties;

/**
 * 自定义PropertyPlaceHolder组件
 * @author h
 */
//public class EncryptPropertyPlaceHolderConfigurer extends PropertyPlaceholderConfigurer {
public class EncryptPropertyPlaceHolderConfigurer extends PropertySourcesPlaceholderConfigurer {

    /**
     * 加了密的参数名
     */
    private String[] encryptPropertyNames={"jdbc_username","jdbc_password"};

    /**
     * 新版本
     * @param props
     * @throws IOException
     */
    @Override
    protected void loadProperties(Properties props) throws IOException {
        //获取props
        super.loadProperties(props);
        for (String propertyName : props.stringPropertyNames()) {
            if (isEncrypty(propertyName)) {
               //解密
                String decryptString = DESUtils.getDecryptString(props.getProperty(propertyName));
                props.setProperty(propertyName,decryptString);
            }
        }
    }



    /**
     * (PropertyPlaceholderConfigurer循环调用)读取自定义配置文件中的键值对，交给SpringIOC容器
     * @param propertyName
//     * @param propertyValue
     * @return
     */

    //    @Override
//    protected String convertProperty(String propertyName, String propertyValue) {
//        /**
//         * 1.判断propertyValue是否被加密
//         * 2.如果被加密就解密后返回；否则就原文返回
//         */
//        if (isEncrypty(propertyName)){
//            //解密
//            return DESUtils.getDecryptString(propertyValue);
//        }
//        return propertyValue;
//
//    }
    private boolean isEncrypty(String propertyName ){
        for (String encryptPropertyName : encryptPropertyNames) {
            if (encryptPropertyName.equals(propertyName)){
                return true;
            }
        }
        return false;
    }


}
