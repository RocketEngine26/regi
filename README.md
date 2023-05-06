# regi
## 整体架构

基于spring-boot、mybatis-plus，前端发送请求，后端响应一个泛型类

## 实现功能

### 基本

注：菜品、套餐的代码没有自己编写，因为相似，所以直接cv了

1. 增删改查，RESTful风格
   1. 登录，
   2. 退出
   3. 新增员工
   4. 员工信息分页查询
   5. 启用禁用员工账号
   6. 编辑员工信息
2. 公共字段填充
3. 全局异常处理函数
4. 图片的上传下载
5. 短信的下发（只是实现熟悉流程了，没有办理短信业务）,通过控制台获取验证码然后登陆

### 优化

1. token认证，防止了前后端分离造成session无法共享的问题，但是前端vue不是很熟，不知道前端从哪里把token接受并把token放到消息体里
2. Redis缓存
   1. 注意了缓存一致性问题
   2. 了解了SpringCache，未实现
3. 基于shardingJDBC实现简单的读写分离，报错如下

```bash
Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

Reason: Failed to determine a suitable driver class
```

4. 三台机器部署项目，熟悉了流程
