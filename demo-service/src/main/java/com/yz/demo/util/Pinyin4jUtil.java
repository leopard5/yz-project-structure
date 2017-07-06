package com.yz.demo.util;

import net.sourceforge.pinyin4j.PinyinHelper;

public class Pinyin4jUtil {
    public static String getFirstCharOfPinyin(char str){
        String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(str);
        String reString = null;
        if (pinyinArray == null) {
            if (Character.isDigit(str)) {
                return "#";
            }else if (Character.isUpperCase(str)) {
                return String.valueOf(str);
            }else if (Character.isLowerCase(str)) {
                return String.valueOf(str).toUpperCase();
            }else {
                return "#";
            }
        }else {
            for(int i = 0; i < pinyinArray.length; ++i){
                reString = String.valueOf((pinyinArray[i]).charAt(0));
                break;
            }
        }
        return reString == null ? null : reString.toUpperCase();
    }
}
