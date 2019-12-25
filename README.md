# 人事管理系统(electron)

![](./back/1.jpg)



本项目是我在数据库课程设计时完成的， 当时课程指导书说要用java+swing, 而我并不想用swing， 就使用前端技术写了一份。
本项目技术栈：

**前端**

* html/css/js
* vue/vuecli/vuex/router
* electron
* v-charts

**后端**

* java
* springboot
* mybatis/mybatis-plus
* mysql



本项目分为前端和后端部分， 所以你需要分别安装其依赖。

前端依赖需要使用 npm 来安装， 后端需要maven, 后端部分也可以直接导入 `idea` 中。

前端链接： [electron-employee-manager](https://github.com/zFitness/electron-employee-manager)

> 本项目里面back 目录是存放 README.md里面的图片的，可以删除。

## 开始此项目
* clone 此项目
```
git clone https://github.com/zFitness/springboot-employeemanager.git
cd springboot-employeemanager
```
* 安装maven依赖

```
mvn install
```

* 打包

```
mvn clean package
```

* 运行

进入编译后的 `target/` 目录

```
java -jar xxxxx.jar
```
