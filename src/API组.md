# API组

- 数据格式：一个list[],里面是一个一个的期权（我们不太懂这些概念）
  - ![img](https://spring-security.oss-cn-beijing.aliyuncs.com/img/~TZP@4LXGJ~83VYBM%60PRCCP.png)
- 接口
  - ![image-20200916203007484](https://spring-security.oss-cn-beijing.aliyuncs.com/img/image-20200916203007484.png)
- java调用python的代码在里面了，返回json字符串。python的代码也在里面了。



## Mock部分

因为测试的时候不能一直登录wind，所以先用了9.16日的数据作为一个json传出。

```
testMock.py
# 返回一个json字符串。
# 是一个mock。
# 因为实际情况大概需要五秒钟来爬取数据，所以这里等待5秒钟之后返回这个串。
```

这样的话java部分是这样的，我们帮java组写了一个调用python脚本的方法，不确定对不对，如下图。其中TODO部分就是需要后续处理的，line就是json字符串。

![image-20200916202529327](https://spring-security.oss-cn-beijing.aliyuncs.com/img/image-20200916202529327.png)





- 另外，附上json文件。res.json。这是一天的期权，作为参照。

