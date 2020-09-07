package com.yize.test;

import com.yize.douban.base.DoubanWebRequest;
import org.junit.Test;

import java.util.HashMap;

public class TestDoubanWebRequest {
    @Test
    public void testWebRequest(){
        HashMap<String,String> paramsMap=new HashMap<>();
        paramsMap.put("count","100");
        String response=DoubanWebRequest.downloadWebSiteUseGet("https://frodo.douban.com/api/v2/elessar/subject/27260217/photos",paramsMap);
        System.out.println(response);
    }
}
