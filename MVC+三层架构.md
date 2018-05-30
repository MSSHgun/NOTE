##开发模式（模型）
	模式一
			JSP + JavaBean
				JSP			获取数据，封装数据，显示数据，控制流程跳转，处理业务逻辑
				JavaBean	增删改查
	模式二（MVC）
			JSP + Servlet + JavaBean
			v	JSP			显示数据
			C	Servlet		获取数据，封装数据，传输数据（域对象），控制流程跳转，处理业务逻辑
			M	JavaBean	增删改查
	MVC + 三层架构
			表示层
			业务逻辑层
			数据访问层
		案例
			展示所有的学生信息
					搭建环境
						创建新的项目
						导入相关的jar包
						导入相关的工具类
						导入相关的配置文件
						准备数据库，表结构
						模拟数据
					开发
						domain    //JavaBean
						servlet	 
						service	//业务逻辑层,即servlet调用service中的方法,service的方法调用dao中的方法.
						dao		//数据库的增删该查
						jsp
					测试


##MVC + 三层架构

![](C:\Users\Asus\Desktop\图片\图片\mvc+三层架构.png)