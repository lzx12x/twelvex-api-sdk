###  快速开始 🚀

**要开始使用 TwelveX-API-SDK，您需要按照以下简单进行操作:**

#### 1. 引入依赖坐标

```xml
<dependency>
   <groupId>icu.twelvex</groupId>
   <artifactId>twelvex-api-sdk</artifactId>
   <version>0.0.4</version>
</dependency>   
```
#### 2. 前往[TwelveX-API 接口开放平台](http://localhost:8000/) 获取开发者密钥对

#### 3. 初始化客户端TwelveXApiClient对象

- 方法 1 ：主动实例化客户端

  ```java
  String accessKey = "你的 accessKey";
  String secretKey = "你的 secretKey";
  TwelveXApiClient client = new TwelveXApiClient(accessKey, secretKey);
  ```

- 方法 2 ：通过配置文件注入对象

  - yml

    ```yml
    # TwelveX-API 配置
    twelvex:
      api:
        client:
          access-key: 你的 accessKey
          secret-key: 你的 secretKey
          # 本地网关地址，可修改为自己的网关，用于本地测试，线上网关地址等，不配置默认平台的网关
         # host: http://localhost:8090/api
    ```

  - properties

    ```properties
    twelvex.api.client.access-key=你的 accessKey
    twelvex.api.client.secret-key=你的 secretKey
    ```

#### 4. 使用API服务

   ```java
 @Resource
 private ApiService apiService;
   ```

#### 5. 发起请求示例

示例：随机毒鸡汤

- 示例一 ：**通过配置文件 推荐👍**

```java
try {
    PoisonousChickenSoupResponse poisonousChickenSoup = apiService.getPoisonousChickenSoup();
    System.out.println("poisonousChickenSoup = " + poisonousChickenSoup);
} catch (ApiException e) {
  log.error(e.getMessage());
}
```

- 示例二 ：主动注入

```java
try {
    TwelveXApiClient twelvexApiClient = new TwelveXApiClient("你的 accessKey", "你的 secretKey");
    PoisonousChickenSoupResponse poisonousChickenSoup = apiService.getPoisonousChickenSoup(twelvexApiClient);
    System.out.println("poisonousChickenSoup = " + poisonousChickenSoup);
} catch (ApiException e) {
    log.error(e.getMessage());
}
```

响应：

```json
{
  "text": "不知道你混什么圈，反正我的是混黑眼圈。"
}
``` 
