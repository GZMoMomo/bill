# 记账软件
功能1：消费预览
统计本月的消费总数，今日消费，日均消费，本月剩余，日均可用，距离月末有多少天。

同时使用一个环形进度条，这个环形进度条不是JDK自带的，需要自己设计，并且随着消费用度，颜色从绿色渐变为红色。
![image](https://user-images.githubusercontent.com/91240419/140088992-6c7dbe22-b2ba-4fbe-b6c6-8201e42f1c07.png)

功能2：记一笔
记录本日的消费额度， 分类下拉框从 消费分类数据中读取，并且把经常消费的分类放在前面。

日期默认选中今天，也可以手动指定日期。
![image](https://user-images.githubusercontent.com/91240419/140089237-9c0bd1e8-3f28-43a7-92a9-ad5d8595d302.png)

功能3：消费分类管理
对消费进行经典的CRUD 增删改查管理，同时显示一个分类下的消费次数。
这里涉及到多表关系：

消费记录和消费分类是多对一关系
![image](https://user-images.githubusercontent.com/91240419/140089306-3484b949-5118-4b91-aece-8d4c9cac5989.png)

功能4：月消费报表
使用第三方chart类生成柱状报表，显示本月的消费趋势
![image](https://user-images.githubusercontent.com/91240419/140089445-305c8642-885b-47f4-bfb5-c54a9d6f4b7c.png)

功能5：设置预算和数据库路径
在消费一览中需要显示本月可用多少金额，都是建立在预算的基础上的。

在设置页面，设置本月的预算金额。

后续的还原和备份，都需要用到数据库的命令mysql和mysqldump，需要在这里配置mysql的安装目录
![image](https://user-images.githubusercontent.com/91240419/140089533-91e6c703-5a55-402e-a4e1-92817c4b768b.png)

功能6：备份数据
把数据库中的所有数据，备份到.sql文件中
![image](https://user-images.githubusercontent.com/91240419/140089587-506693e7-27f9-4f72-8b41-9517a83753f9.png)

功能7：恢复数据
根据.sql文件还原数据库
![image](https://user-images.githubusercontent.com/91240419/140089661-76641dae-179b-4ab1-a42f-8f34a333a925.png)

