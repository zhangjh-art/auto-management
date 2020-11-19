package com.automanage.base.common.util;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.converters.*;

import java.math.BigDecimal;

public class BeanUtil {

    public static void copyProperties(Object bean, Object form) throws Exception {
        IntegerConverter integerConverter = new IntegerConverter(null);
        LongConverter longConverter = new LongConverter(null);
        FloatConverter floatConverter = new FloatConverter(null);
        DoubleConverter doubleConverter = new DoubleConverter(null);
        BigDecimalConverter bigDecimalConverter = new BigDecimalConverter(null);
        BeanUtilsBean beanUtilsBean = new BeanUtilsBean();

        beanUtilsBean.getConvertUtils().register(integerConverter, Integer.class);
        beanUtilsBean.getConvertUtils().register(longConverter, Long.class);
        beanUtilsBean.getConvertUtils().register(floatConverter, Float.class);
        beanUtilsBean.getConvertUtils().register(doubleConverter, Double.class);
        beanUtilsBean.getConvertUtils().register(bigDecimalConverter, BigDecimal.class);

        beanUtilsBean.copyProperties(bean, form);
    }
}
