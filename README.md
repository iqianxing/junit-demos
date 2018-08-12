
junit 接口测试demo

# 运行测试用例命令
1. 执行测试用例
```shell
mvn test
```

2. 生产html报告
```shell
mvn surefire-report:report
```
生成的测试报告位于target/site目录下面

# html报告插件
[maven-surefire-plugin](http://maven.apache.org/surefire/maven-surefire-report-plugin/index.html)
```xml
    <dependency>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-surefire-report-plugin</artifactId>
      <version>2.22.0</version>
    </dependency>
```