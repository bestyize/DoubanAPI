# 1、简介

目前的主要能力是计算豆瓣API的请求签名

# 2、注意事项

API示例

```java
https://frodo.douban.com/api/v2/elessar/subject/27260217/photos?count=100&apikey=0dad551ec0f84ed02907ff5c42e8ec70&_sig=gfTX2YbSiADYaG%2FzXJ%2BpNo5IhbI%3D&_ts=1599316450
```

UA

```java
api-client/1 com.douban.frodo/6.42.2(194) Android/22 product/shamu vendor/OPPO model/OPPO R11 Plus  rom/android  network/wifi  platform/mobile nd/1

```

必须要保证签名和UA正确，才能得到预期响应

# 3、原理

有关如何获取签名的过程已在下面两篇文章作了介绍

[安卓逆向-豆瓣app签名算法分析与解密（上）](https://blog.csdn.net/qq_23594799/article/details/108445726)

[安卓逆向-豆瓣app签名算法分析与解密（下）](https://blog.csdn.net/qq_23594799/article/details/108446352)

# 4、工程导入

完整工程是一个使用maven构建的servlet程序，用idea导入即可
