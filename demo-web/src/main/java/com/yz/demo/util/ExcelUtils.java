package com.yz.demo.util;

import net.sf.jxls.transformer.XLSTransformer;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/3/14.
 */
public class ExcelUtils {
    private static final Logger logger = LoggerFactory.getLogger(ExcelUtils.class);

    public static void write2excel(String templateName, String fileName, Object dataList, HttpServletResponse response) {
        if (null == dataList)
            return;
        InputStream is = null;
        OutputStream os = null;
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-disposition", "attachment;filename=" + fileName);
            is = ExcelUtils.class.getClassLoader().getResourceAsStream(templateName);
            os = response.getOutputStream();
            XLSTransformer transformer = new XLSTransformer();
            Map<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("model", dataList);
            Workbook wb = transformer.transformXLS(is, dataMap);
            wb.write(os);
            os.flush();
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } catch (InvalidFormatException e) {
            logger.error(e.getMessage(), e);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                if (null != os)
                    os.close();
                if (null != is)
                    is.close();
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }


    }
}
