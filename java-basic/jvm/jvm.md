## 对 Java 的理解

- 平台无关性

- GC

- 语言特性

    泛型，反射，lambda

- 面向对象

    封装，继承，多态

- 类库

    集合，并发库，网络库，IO/NIO等

- 异常

## 平台无关性

Write once, run anywhere

编译器将 Java 源码编译成 Java 字节码，然后运行时 JVM 虚拟机再将 Java 字节码解释成机器码执行。

- 为什么 JVM 不直接将源码解析成机器码去执行？

    如果这样，每次执行都需要各种检查，重新编译，耗时。

    兼容性，也可以将别的语言解析成字节码。

## JVM 如何加载 .class 文件

class loader 依据特定格式，加载 class 文件到内存。

Execution Engine 对命令进行解析。

Native interface 融合不同开发语音的原生库为 Java 所用。

Runtime Data Area Jvm 内存空间结构模型。

```
                         +------------------+
Class Files +----------> |   Class Loader   |
                         +------+--+--------+
                                |  ^
                                |  |
                                |  |
                                v  |
 +------------------------------+--+--------+
 |                                          |
 |  +-------+  +------+  +-------------+    |
 |  | Stack |  | Heap |  | Method Area |    |
 |  +-------+  +------+  +-------------+    |
 |                                          |
 |  +-----------+   +---------------------+ |
 |  | PC Register   | Native Method Stack | |
 |  +-----------+   +---------------------+ |
 |                                          |
 +----+--+------------------+---+-----------+
      ^  |                  ^   |
      |  |                  |   |
      |  v                  |   |
 +----+--+----------+   +---+---v----------+
 | Execution Engine +-->+ Native Interface +---->Native Libraies
 +------------------+   +------------------+
```

## 反射

Java 反射机制是在运行状态中，对任意一个类，都能够知道这个类的所有属性和方法；

对于任意一个对象，都能够调用它的任意方法和属性；

这种动态获取信息以及动态调用对象的功能称为 Java 语言的反射机制。

- 写个反射例子

    ```java
    package tests.reflect;

    public class Robot {
        private String name;
        public void sayHi(String helloSentence) {
            System.out.println(helloSentence + " " + name);
        }

        private String throwHello(String tag) {
            return  "hello " + tag;
        }
    }
    ```

    ```java
    package tests.reflect;

    import java.lang.reflect.Field;
    import java.lang.reflect.InvocationTargetException;
    import java.lang.reflect.Method;

    public class ReflectSample {
        public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
            Class rc = Class.forName("tests.reflect.Robot");
            Robot robot = (Robot) rc.newInstance();
            System.out.println("Class name is: " + rc.getName());

            //获取私有函数
            Method getHello = rc.getDeclaredMethod("throwHello", String.class);
            getHello.setAccessible(true);
            Object str = getHello.invoke(robot, "Bob");
            System.out.println(str);

            //获取public函数
            Method sayHi = rc.getMethod("sayHi", String.class);
            sayHi.invoke(robot, "Welcome");

            //获取private字段
            Field name = rc.getDeclaredField("name");
            name.setAccessible(true);
            name.set(robot, "Alice");
            sayHi.invoke(robot, "I love you,");
        }
    }
    ```

## ClassLoader

上面的例子中加载 Robot 类时 ClassLoader 将字节码转换为 JVM 中的 Class<Robot> 对象。JVM 利用 Class<Robot> 对象实例化为 Robot 对象。

ClassLoader 主要工作在 Class 加载的阶段，其主要作用是从系统外部获得 Class 二进制数据流，然后交给 JVM 虚拟机进行连接、初始化等操作。是 Java 的核心组件，所有的 Class 都是由 ClassLoader 加载的。

## ClassLoader 的种类
        