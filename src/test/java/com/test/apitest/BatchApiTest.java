package com.test.apitest;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Map;

import com.github.kevinsawicki.http.HttpRequest;

public class BatchApiTest {
    @DataProvider
    public Object[][] data() {
        Object[][] diffApis = new Object[][]{
                {
                        "https://easy-mock.com/mock/5b6b06f9a40bfb27425bbb6a/jsondiff/v1/demo",
                        "https://easy-mock.com/mock/5b6b06f9a40bfb27425bbb6a/jsondiff/v2/demo"
                },
                {
                        "https://easy-mock.com/mock/5b6b06f9a40bfb27425bbb6a/jsondiff/v1/hello",
                        "https://easy-mock.com/mock/5b6b06f9a40bfb27425bbb6a/jsondiff/v2/hello"
                },
                {
                        "https://easy-mock.com/mock/5b6b06f9a40bfb27425bbb6a/jsondiff/v1/user",
                        "https://easy-mock.com/mock/5b6b06f9a40bfb27425bbb6a/jsondiff/v2/user"
                },
                {
                        "https://easy-mock.com/mock/5b6b06f9a40bfb27425bbb6a/jsondiff/v1/1/list",
                        "https://easy-mock.com/mock/5b6b06f9a40bfb27425bbb6a/jsondiff/v2/1/list"
                },
                {
                        "https://easy-mock.com/mock/5b6b06f9a40bfb27425bbb6a/jsondiff/v1/2/list",
                        "https://easy-mock.com/mock/5b6b06f9a40bfb27425bbb6a/jsondiff/v2/2/list"
                },
                {
                        "https://easy-mock.com/mock/5b6b06f9a40bfb27425bbb6a/jsondiff/v1/3/list",
                        "https://easy-mock.com/mock/5b6b06f9a40bfb27425bbb6a/jsondiff/v2/3/list"
                },
        };
        return diffApis;
    }

    @Test(dataProvider = "data")
    public void test_apiDiff(String oldApiUrl, String newApiUrl) {
        String oldJsonString = HttpRequest.get(oldApiUrl)
                .accept("application/json")
                .body();
        String newJsonString = HttpRequest.get(newApiUrl)
                .accept("application/json")
                .body();
        Object oldJsonVo = JSON.parseObject(oldJsonString);
        Object newJsonVo = JSON.parseObject(newJsonString);
        Assert.assertEquals(oldJsonVo, newJsonVo);
    }
}
