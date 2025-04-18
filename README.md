# health_insurance_backend_server
health_insurance_backend_server for practice (internship)

# SpringBoot全栈开发实战：从框架搭建到保险业务系统部署

## 任务清单

### 1. SpringBoot基础框架搭建
- [y] 初始化SpringBoot项目结构  
- [ ] 配置基础依赖和父POM  

### 2. 单数据源配置
- [ ] 集成JDBC/MyBatis-Plus  
- [ ] 配置application.yml数据源参数  
- [ ] 测试基础CRUD功能  

### 3. 多数据源动态配置
- [ ] 基于AbstractRoutingDataSource实现  
- [ ] 说明分库分表/读写分离等业务场景需求  
- [ ] 注意事项：事务管理方案  

### 4. Cloud Config统一配置中心
- [ ] 搭建配置服务端（Git/Nacos后端存储）  
- [ ] 客户端配置读取最佳实践  
- [ ] 动态刷新机制验证  

### 5. 用户认证模块开发
- [ ] 实现注册/登录RESTful接口  
- [ ] 集成JWT Token签发/验证逻辑  
- [ ] 设计权限拦截器（HandlerInterceptor）  

### 6. 代码结构优化
- [ ] 参照GitHub高星项目重构分层架构  
- [ ] 规范DTO/VO/BO对象转换  
- [ ] 统一异常处理机制  

### 7. 前端联调环境准备
- [ ] 提供Vue3/React基础模板工程  
- [ ] 集成Axios请求库和Mock方案  
- [ ] 编写接口文档（Swagger/YAPI）  

### 8. 核心业务模块开发
- [ ] 按迭代周期推进功能开发  
- [ ] 每日代码Review机制  

### 9. 保险业务场景实现
- [ ] 投保单生成（策略模式应用）  
- [ ] 保费计算引擎（规则引擎集成）  
- [ ] 保单状态机设计  

### 10. 中间件技术选型
- [ ] MySQL：分库分表方案设计  
- [ ] Redis：缓存雪崩/穿透防护  
- [ ] RabbitMQ：投保异步化处理  

### 11. 容器化部署
- [ ] 编写Dockerfile分层构建  
- [ ] 配置CI/CD流水线（Jenkins/GitHub Actions）  
- [ ] 输出部署checklist文档  
