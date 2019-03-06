# Spring Web MVC

用于构建Servlet-stack的web应用, 例如tomcat, jetty, ...

同很多web框架的设计一样, 基于[front controller pattern][]设计,
通过**DispatcherServlet**来对request进行处理.

WebApplicationContext会被绑定到**ServletContext**和**Servlet**中,
可以通过**RequestContextUtils**来获取它.

![](DispatcherServlet_ApplicationContext.png)

DispatcherServlet会使用WebApplicationContext来对应用进行配置,
尤其是请求处理相关的[Special Bean Types][].
如果没有在应用中进行配置, 则会使用**DispatcherServlet.properties**中的设置作为默认值.

在Servlet 3.0+环境中, 可以通过**WebApplicationInitializer**在应用中对Servlet进行配置.

## DispatcherServlet 工作流



---
[Web on Servlet Stack]: https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/web.html
[front controller pattern]: https://en.wikipedia.org/wiki/Front_controller
[Special Bean Types]: https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/web.html#mvc-servlet-special-bean-types