# Health Insurance Backend Server (Tech Stack Aligned with U.S. Industry)  
Hands-on Practice: Spring Boot + Spring Security + JPA + PostgreSQL + Redis + Docker + GitHub Actions

---

## ✅ Task Checklist (Aligned with 2025 U.S. Software Engineering Practices)

### 1. Spring Boot Project Initialization
- [x] Initialize project using Spring Initializr  
- [x] Set up basic dependencies like `spring-boot-starter-web`, `spring-boot-starter-data-jpa`  

### 2. Multi-Type Data Source Integration (with AWS Services)
- [ ] Configure multiple types of data sources to support complex insurance business needs  
  - **Relational DB**: Integrate AWS RDS (PostgreSQL / MySQL) using Spring Data JPA  
  - **Cache DB**: Use AWS ElastiCache (Redis) for caching and cache penetration protection  
  - **NoSQL DB**: Optionally integrate AWS DynamoDB for unstructured, high-throughput data  
  - **Object Storage**: Integrate AWS S3 for storing policy documents, invoices, and static files  
  - **Message Queues**: Use AWS SQS / SNS or Apache Kafka for asynchronous processing  
- [ ] Manage environment-specific configs via `application.yml` + Spring Profiles  
- [ ] Build a modular repository layer to support multi-source data handling  
- [ ] Implement integration tests using JUnit, Mockito, and Testcontainers  

### 3. User Authentication and Authorization
- [ ] Build registration and login APIs with Spring Security  
- [ ] Use `auth0/java-jwt` to issue and validate JWTs  
- [ ] Implement role-based access control (RBAC)  

### 4. Centralized Configuration
- [ ] Use Spring Cloud Config for centralized config management (or AWS Parameter Store)  
- [ ] Support dynamic config refresh via Spring Cloud Bus  

### 5. Caching and Messaging
- [ ] Integrate Redis for caching strategies and failover protection  
- [ ] Use Kafka or RabbitMQ for decoupled, asynchronous business flows  

### 6. Project Architecture and Code Quality
- [ ] Apply layered architecture with DTO/Entity separation  
- [ ] Use MapStruct for object mapping  
- [ ] Implement global exception handling with `@ControllerAdvice`  
- [ ] Auto-generate API docs using Swagger  

### 7. DevOps Practices
- [ ] Write multi-stage Dockerfile for optimized image builds  
- [ ] Use GitHub Actions for CI/CD pipelines (build/test/deploy)  
- [ ] Deliver deployment checklist and health check strategy  

### 8. Business Scenario Implementation
- [ ] Simulate and implement real-world insurance flows such as policy purchase, issuance, claims, and state transitions  
- [ ] Each scenario should include API design, DB modeling, business rules, and exception handling  

### 9. Middleware Selection and Usage
- [ ] Evaluate and integrate MySQL, Redis, Kafka/RabbitMQ based on business requirements  
- [ ] Compare pros and cons of different middleware and justify selection  
- [ ] Document integration issues, optimization tips, and configuration best practices  

---

📘 以下为 **中文版本**，适合中文读者或技术笔记归档使用：

---

# Health Insurance Backend Server (美企技术栈实战项目)  
实战演练：Spring Boot + Spring Security + JPA + PostgreSQL + Redis + Docker + GitHub Actions

---

## ✅ 实践任务清单（对齐美国软件行业主流栈）

### 1. Spring Boot 项目初始化
- [x] 使用 Spring Initializr 初始化项目结构  
- [x] 配置 `spring-boot-starter-web`、`spring-boot-starter-data-jpa` 等基础依赖  

### 2. 多类型数据源配置（结合 AWS 服务）
- [ ] 配置多种数据源类型以支持复杂保险业务系统，包括关系型数据库、NoSQL、缓存、对象存储与消息队列  
  - **关系型数据库**：使用 Spring Data JPA 配置 AWS RDS（PostgreSQL / MySQL）  
  - **缓存数据库**：集成 AWS ElastiCache（Redis）进行热点数据缓存和缓存穿透防护  
  - **NoSQL 数据库**：扩展支持 AWS DynamoDB，适用于非结构化或高吞吐场景  
  - **对象存储**：集成 AWS S3 进行保单附件、发票等静态资源存储与访问控制  
  - **消息队列**：集成 AWS SQS / SNS 或 Apache Kafka，实现异步化投保处理与通知系统  
- [ ] 使用 `application.yml` 管理多数据源配置，配合 Spring Profile 支持多环境部署  
- [ ] 建立模块化的 Repository 层结构，支持多源数据并发调用与统一封装  
- [ ] 实现核心接口的集成测试，使用 JUnit + Mockito + Testcontainers 进行端到端验证  

### 3. 用户认证与授权
- [ ] 使用 Spring Security 实现注册 / 登录 API  
- [ ] 集成 `auth0/java-jwt` 实现 JWT 签发与解析  
- [ ] 实现基于角色的访问控制（RBAC）  

### 4. 配置管理
- [ ] 使用 Spring Cloud Config 统一管理应用配置（或支持迁移到 AWS Parameter Store）  
- [ ] 支持配置热更新（使用 Spring Cloud Bus）  

### 5. 缓存与消息中间件
- [ ] 集成 Redis 实现缓存与防护机制（如穿透/雪崩）  
- [ ] 使用 Kafka 或 RabbitMQ 实现异步任务处理  

### 6. 项目结构与质量优化
- [ ] 采用 DTO/Entity 分层设计，使用 MapStruct 简化对象转换  
- [ ] 使用 `@ControllerAdvice` + 自定义异常类统一错误处理  
- [ ] 使用 Swagger 自动生成 API 文档  

### 7. DevOps 实践
- [ ] 编写多阶段 Dockerfile 构建镜像  
- [ ] 使用 GitHub Actions 实现自动化构建 / 测试 / 部署流程  
- [ ] 输出部署说明文档和健康检查策略  

### 8. 保险业务场景练习
- [ ] 尝试构建和实现我们可以想象到的保险业务流程，如投保、出单、理赔、状态流转等，训练对业务逻辑的建模能力  
- [ ] 每个场景需配合对应 API 设计、数据库模型、业务规则等进行完整实现  

### 9. 中间件选型实践
- [ ] 针对 MySQL / Redis / 消息队列（如 Kafka、RabbitMQ）的使用场景进行分析与落地  
- [ ] 比较各类中间件的优缺点，并结合实际需求做出合理选型  
- [ ] 记录使用过程中的注意事项与配置优化经验  
