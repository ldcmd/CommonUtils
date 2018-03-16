package com.liudan.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created with IDEA
 * author:liudan
 * Date:2018/3/16
 * Time:9:47
 * @author  null
 * @description   时间工具类
 */
public class DateUtils {


    /***
     *
     * @return
     *    1.根据当前时间推前一年
     *
     */
    public  static Date toDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.YEAR,-1);
        calendar.set(Calendar.MONTH,-1);
        calendar.set(Calendar.DATE,-1);
        return calendar.getTime();
    }


}
