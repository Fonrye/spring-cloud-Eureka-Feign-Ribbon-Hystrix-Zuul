# spring-cloud-Eureka-Feign-Ribbon-Hystrix-Zuul

#### 介绍
一个简单的微服务商城项目

#### 软件架构
软件架构说明


#### 安装教程

1.  数据库名称默认root-123456
2.  导入数据库文件 shop.sql
3.  引入spring boot项目


课程题目
一、	基本要求
   认真阅读下面选题给出的需求分析，完成系统的设计与实现。
1.	独立完成，不允许组队；
2.	数据库必须涉及3个以上的数据表；（数据库不限类型）；
3.	实现管理员登陆功能；
4.	能独立完成选题业务功能的设计与编码实现；
5.	使用Eureka, Ribbon, Feign, Hystrix, Zuul；
6.	开发技术必须采用Spring Cloud。
二、	题目（根据下面需求分析结果，进行系统设计。）
（一） 功能开发：某跨国企业拟开发一套跨境电商系统，实现跨境购物等业务过程的管理。（总分：50分）
需求分析结果如下：
(1) 用户管理。管理包括用户的增删改查。用户信息包括：手机号、姓名、国籍和用户类别（1-管理员；2-普通用户）。（10分）
(2) 商品管理。管理包括商品的增删改查，以及商品的展示详情。商品信息包括商品编号、商品名称、商品描述、价钱。（10分）
(3) 购物车。 购物车页面显示了当前登录用户的购物车详情，用户可以选择购买数量或者将商品从购物车中删除等（10分）
(4) 订单管理。订单页面显示了当前用户的历史购买订单，以及当前订单的进展情况。（10分）
(5) 活动管理。对商品打折活动进行增删查改管理，用户购买活动商品的时候，对活动商品进行折扣计算金额。（10分）
（二）微服务构建.（总分：50分）
(1) 搭建eureka服务中心；（10分）
(2) 使用Feign和Ribbon实现轮询负载均衡策略；（20分）
(3) 添加Hystrix服务容错保护和Zuul服务网关；（20分）



Course title
1. Basic requirements
   Carefully read the demand analysis given in the following topics to complete the design and implementation of the system.
1. Completed independently, no team is allowed;
2. The database must involve more than 3 data tables; (databases are not limited to types);
3. Realize the administrator login function;
4. Able to independently complete the design and coding realization of the topic selection business function;
5. Use Eureka, Ribbon, Feign, Hystrix, Zuul;
6. The development technology must use Spring Cloud.
Second, the subject (based on the following demand analysis results, system design.)
(1) Function development: A multinational company plans to develop a cross-border e-commerce system to realize the management of business processes such as cross-border shopping. (Total score: 50 points)
The results of the demand analysis are as follows:
(1) User management. Management includes adding, deleting, modifying and checking users. User information includes: mobile phone number, name, nationality and user category (1-administrator; 2-normal user). (10 points)
(2) Commodity management. The management includes the addition, deletion, modification, and checking of products, as well as the display details of the products. Product information includes product number, product name, product description, and price. (10 points)
(3) Shopping cart. The shopping cart page displays the shopping cart details of the currently logged-in user, and the user can select the quantity to purchase or delete the product from the shopping cart, etc. (10 points)
(4) Order management. The order page displays the current user’s historical purchase orders and the progress of the current order. (10 points)
(5) Event management. Add, delete, check, modify, and manage product discount activities. When users purchase event products, calculate the amount of discounts on event products. (10 points)
(2) Microservice construction. (Total score: 50 points)
(1) Set up eureka service center; (10 points)
(2) Use Feign and Ribbon to implement a polling load balancing strategy; (20 points)
(3) Add Hystrix service fault-tolerant protection and Zuul service gateway; (20 points)

部分实现效果
![代码实现段](https://images.gitee.com/uploads/images/2021/0622/173359_76e7f13e_5479964.png "屏幕截图.png")
![商城首页](https://images.gitee.com/uploads/images/2021/0622/173434_dc0b3106_5479964.png "屏幕截图.png")
![商城首页](https://images.gitee.com/uploads/images/2021/0622/173446_a39c7fa7_5479964.png "屏幕截图.png")


![后台商品](https://images.gitee.com/uploads/images/2021/0622/173501_e08e6762_5479964.png "屏幕截图.png")
![后台登陆](https://images.gitee.com/uploads/images/2021/0622/173601_750de507_5479964.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2021/0622/173610_96499aed_5479964.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2021/0622/173613_06a22670_5479964.png "屏幕截图.png")
