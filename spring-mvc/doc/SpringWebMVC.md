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

![](DispatcherServlet-workflow.png)

DispatcherServlet代理了一系列的HandlerExceptionResolver, 用于处理请求分发和处理时发生的异常.

如果异常没有被HandlerExceptionResolver处理, 则最后会被抛给Servlet Container处理, 最后会分发给error page.

Spring MVC通过ViewResolver和View来渲染model到页面, 可以配置一些列的ViewResolver来处理不同的显示.

ContentNegotiatingViewResolver用于代理其他第三方的ViewResolver, 根据请求的Content-Type来选择合适的ViewResolver.

通过LocaleResolver来处理国际化.

---
[Web on Servlet Stack]: https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/web.html
[front controller pattern]: https://en.wikipedia.org/wiki/Front_controller
[Special Bean Types]: https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/web.html#mvc-servlet-special-bean-types