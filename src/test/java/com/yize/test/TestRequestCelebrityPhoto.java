package com.yize.test;

import com.yize.douban.module.CelebrityPhoto;
import org.junit.Test;

public class TestRequestCelebrityPhoto {
    @Test
    public void test(){
        CelebrityPhoto celebrityPhoto=new CelebrityPhoto();
        String response=celebrityPhoto.requestCelebrityPhoto("27260217","0","50");
        System.out.println(response);
    }
}
