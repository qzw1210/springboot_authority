1、系统管理后台基本框架SPPanAdmin，包括用户管理，角色管理，资源链接管理模块，可以动态分配权限和角色。
2、使用springboot、springdata jpa、shiro等服务端技术，使用freemarker模版渲染页面。
3、系统中对springdata的查询条件Specification做了简单的封装，更加方便查询条件的灵活使用。
4、前端技术：使用Hadmin系统模版，数据表格使用bootstrap table插件，弹窗使用layer插件，日期选择使用laydate插件。表单验证使用jQuery validate插件等等。
5、系统部署：
    1）使用mysql数据库，先建立一个空数据库base，最好编码使用utf-8字符集，不然会乱码。
    2）把application.properties中的数据库连接信息修改成自己数据库的连接信息。
    3）修改spring.jpa.hibernate.ddl-auto为create，目的是让系统自动建表同时初始化相关集成数据。如果不需要自动初始化数据，可以删除resource目录下的import.sql文件。
6、系统启动后，访问：127.0.0.1/admin/会自动跳转到后台登录页面。
7、初始用户名和密码为：admin/111111。
    
8、演示图片：
![输入图片说明](http://git.oschina.net/uploads/images/2017/0120/101747_21c1bc11_559378.jpeg "在这里输入图片标题")
![输入图片说明](http://git.oschina.net/uploads/images/2017/0120/101756_5ab80e6b_559378.jpeg "在这里输入图片标题")
![输入图片说明](http://git.oschina.net/uploads/images/2017/0120/101805_f87bd7b4_559378.jpeg "在这里输入图片标题")
![输入图片说明](http://git.oschina.net/uploads/images/2017/0120/101813_39158674_559378.jpeg "在这里输入图片标题")
![输入图片说明](http://git.oschina.net/uploads/images/2017/0120/101823_106d2eb9_559378.jpeg "在这里输入图片标题")
![输入图片说明](http://git.oschina.net/uploads/images/2017/0120/101830_5767b7c1_559378.jpeg "在这里输入图片标题")
![输入图片说明](http://git.oschina.net/uploads/images/2017/0120/101839_c5700e09_559378.jpeg "在这里输入图片标题")