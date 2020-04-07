# java-design-patterns
Java 设计模式

## 01-proxy 代理模式
> 关注过程

1. staticProxy 静态代理
例子： 游戏代理

2. dynamicProxy 动态代理
- jdk动态代理
- cglib动态代理

例子： 通过媒人找对象


## 02-singleton 单例模式
Spring中，通过@Autowired注入的依赖，默认是单例模式的

## 03-factory 工厂模式
> 关注结果

1. simple 简单工厂模式
例子：生产汽车  
问题：实际生活中不可能有一个工厂可以生产所有种类的汽车。。。  

于是有了下面的工厂方法模式，需要什么车，就向什么工厂要

2. func 工厂方法模式
问题：客户端需要知道所有的工厂，这也不符合实际。。。  

3. abstractfactory 抽象工厂模式  
看起来代码变多来，实际是解藕，代码方便维护
结合策略模式修改 AbstractFactory 类，代码更优雅

