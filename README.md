廖雪峰java基础课程随堂代码

# java面向对象编程

## 数据封装

### 构造方法
- 实例创建时调用构造方法
- 构造方法用于初始化实例
- 没有定义构造方法时，编译器会自动创建默认构造方法
- 可以定义多个构造方法，编译器自动根据参数判断


### 方法重载
- 重载方法应该完成相同的功能，参考String的indexOf()
- 重载方法主要依靠参数类型和树龄区分
- 不要去交换参数顺序
- 重载方法返回值类型应该相同

## 继承和多态

### 继承
- 继承是面向对象变成的一种代码复用方式
- java只允许单继承
- protected允许子类访问弗雷的字段和方法
- 子类构造方法可以通过super()调用父类的构造方法
- 可以安全地向上转型为更抽象的类型
- 可以强制向下转型，最好借助instanceof判断
- 子类和父类的关系时is， has关系不能用继承


### 多态
- 子类可以覆写父类的方法（override）
- 覆写在子类中改变了父类方法的行为
- 多态：java的方法调用总是作用于对象的世纪类型
- final修饰的方法可以阻止被覆写
- final修饰的class可以阻止被继承
- final修饰的field必须在创建对象时初始化

## 抽象类和接口

### 抽象方法
- 抽象方法定义了子类必须实现的接口规范
- 定义了抽象方法的类就是抽象类
- 从抽象类继承的子类必须实现抽象方法
- 如果不实现抽象方法，则该子类仍是一个抽象类
- 抽象方法不能实例化(My add)

### 接口
- 如果一个抽象类没有字段，所有方法都是抽象方法，就可以吧该抽象类改为接口(interface)
- 接口定义的方法默认是public abstract(不需要写)
- 一个类可以实现多个interface

| interface | abstra class | interface
:---------: | :----------: | :-------: |
继承   | 只能extends一个clas | 可以implements多个interface
字段 | 可以定义实例字段 |  不能定义实例字段
抽象方法 | 可以定义抽象方法 | 可以定义抽象方法
非抽象方法 | 可以定义非抽象方法 | 可以定义default方法
- 一个interface可以继承自另一个interface
- interface继承自interface使用extends
- 接口继承接口相当于扩展了接口的方法

- 接口类定义了纯抽象方法
- 类可以实现多个接口
- 接口也是数据类型，适用于向上转型和向下转型
- 接口不能定义实例字段
- 接口可以定义default方法(JDK >= 1.8)

## 包和classpath

### 静态字段和方法
用static修饰的字段为静态字段
- 普通字段在每个实例中都有自己的一个独立空间
- 静态字段只有一个共享空间，所有实例都共享该字段

用static修饰的方法成为静态方法
- 调用实例方法必须通过实例变量
- 调用静态方法不需要实例变量
- 静态方法不能访问this变量（this变量是实例化后实例的别名，静态方法存在于实例化之前，所以不能使用this）
- 静态方法不能访问实例字段（同样的道理）
- 静态方法可以访问静态字段

静态方法通常用于工具类
- Arrays.sort()
- Math.random()

静态方法通常用于辅助方法

Java程序入口函数main()也是静态方法

- 静态字段属于所有实例"共享"的字段，实际上是属于class的字段
- 调用静态方法不需要实例，因此无法访问this（可能是相反的原因）
- 静态方法可以访问静态字段和其他静态方法
- 静态方法常用语工具类和辅助工具

### 作用域
- 如果不确定是否需要public，就不声明public，即尽可能少地暴露对外方法，从private改为public很容易，但是从public改为private很容易出错。
- 尽可能把局部变量的作用域缩小
- 尽可能延后声明局部变量
- final与访问权限不冲突
- final修饰class可以阻止被继承
- final修饰方法阻止被覆写
- final修饰field可以阻止被重新赋值
- final修饰局部变量可以阻止被重新赋值


----
- java内建访问权限有public、protected、private和package
- java在方法内部定义的变量是局部变量
- 局部变量作用域从声明开始到块结束
- final修饰符不是访问权限，可以同访问权限一起使用
- 一个java文件只能包含一个public class， 但是可以包含多个非public class


### classpath & jar
- classpath是一个环境变量
- classpath指示JVM如何搜索class
- classpath设置的搜索路径与操作系统相关

classpath设定方法：
- 直接在系统环境中设置classpath环境变量（不推荐）
- 在启动JVM时设置classpath变量（推荐）
    1. java -classpath /usr/share com.feiyangedu.Hello
    2. java -cp /usr/share com.feiyangedu.Hello
- 没有设置环境变量也没有指定-cp参数时，默认classpath为.，即当前目录
- eclipse中运行java程序默认传入的cp参数是当前工程的bin目录和引入的jar

jar包
- jar包相当于目录
- 包含若干class文件
- 使用jar包可以避免大量的目录和class文件
- META-INF/MANIFEST.MF可以提供jar包信息，如Main-Class
- 不需要在classpath中引入包含java核心类的rt.jar

## java核心类

### 字符串和编码

String特点：
- 内容不可变
- 可以直接使用"……"
- equals(Object)
- boolean contains(CharSequence)
- trim()，移除首位空字符（空格、\t、\r、\n），trim不改变字符串的内容，而是返回新的字符串
- subString()
-------
- 字符串操作不改变原来字符串内容，而是返回新的字符串
- 常用字符串操作：提取字串、查找、替换、大小写转换等
- 字符串和byte[]转换时需要注意编码，建议使用UTF-8编码

### StringBuilder
- StringBuilder可以高效拼接字符串
- StringBuilder是可变对象，会预先分配缓冲区。
- 可以进行链式操作，实现链式操作的关键是返回实例本身。

StringBuffer
- StringBuffer是StringBuilder的线程安全版本，接口与StringBuilder完全相同
- 没有必要使用StringBuffer

### 包装类型
java数据类型：
- 基本类型：int，boolean, float……
- 引用类型：所有class类型

基本类型不可以当作一个对象，要想以对象访问，就需要包装类型
JDK为每种类型都创建类对应的包装类型

| 基本类型 | 对应的引用类型 |
| :------:| :-----------:|
| boolean | Boolean |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |

例如：
```java
Integer n = new Integer(99);
int i = n.intValue();
```
```java
int i = 100;

Integer n1 = new Integer(i);
Integer n2 = Integer.valueOf(i);
Integer n3 = Integer.valueOf("100");

int x1 = n1.intValue();
int x2 = Integer.parseInt("100");
String s = n1.toString();

//注意这个getInteger，并不是从字符串中获取整数，而是从系统环境变量中获取相应的值
Integer prop = Integer.getInteger("cpus");

```

- 编译器可以自动在int和Integer之间转型：
    - 自动装箱(auto boxing)：int -> Integer
    - 自动拆箱(auto unboxing)：Integer -> int
- 自动装箱和自动拆箱只发生在编译阶段
- 装箱和拆箱会影响执行效率
- 编译后的class代码是严格区分基本类型和引用类型的
- Integer -> int 执行时可能会报错（如果实例对象为null，则拆箱失败：NullPointException）
- java包装类型定义了一些有用的静态变量
- java包装类型全部继承自Number这个类

![Number][1]

------

- JDK的包装类型可以把基本类型包装成class
- 自动装箱和拆箱是编译器完成的（JDK >= 1.5）
- 装箱和拆箱会影响执行效率
- 注意拆箱可能发生NullPointException

### JavaBean
- JavaBean是一种符合命名规范的class
- JavaBean通过getter/setter来定义属性
- 属性是一种通用的叫法，并非Java语法规定
- 可以利用IDE快速生成getter和setter
- 使用Introspector.getBeanInfo获取属性列表

### 枚举类
- enum可以定义常亮类型，它被编译器编译为：final class Xxx extends Enum {...}
- name()获取常量定义的字符串，注意不要使用toString()（toString方法可能被覆写）
- ordinal()返回常量定义的顺序（无实质意义）
- 可以为enum类编写构造方法、字段和方法
- 构造方法声明为private（不声明也可以JDK10）

### 常用工具类
Math
    
    Math提供了数学计算的静态方法
- abs / min / max
- pow / sqrt / exp / log / log10
- sin / cos / tan / asin / acos ...

- 常量
    - PI = 3.14159...
    - E = 2.71828...
- Math.random()方法生成一个随机数：
    - 0 <= Math.random() < 1
    - 可用于生成某个区间的随机数
```java
long MIN = 1000;
long MAX = 9000;
double x2 = Math.random() * (MAX - MIN) + MIN;
double r = (long) x2;
```

Random
    
    Random用来创建伪随机数
- nextInt / nextLong / nextFloat...
- nextInt(N)生成不大于N的随机数
- 什么是伪随机数？
    - 给定种子后伪随机数算法会生成完全相同的序列
    - 不给定种子时Random使用系统当前时间戳作为种子

SecureRandom

    SecureRandom用于创建安全的随机数，缺点是比较慢
    
BigInteger

    BigInteger用任意多个int[]来表示非常大的整数。

BigDecimnal

    BigDecimal表示任意精度的浮点数。
    BigInteger和BigDecimnal多用于财务计算中。


# Java异常处理

## 错误处理

### Java的异常
- 计算机运行过程中错误是不可避免的

Java异常体系：

![Java异常体系][2]

- Java规定必须捕获的异常是Exception及其子类，但不包括RuntimeException及其子类
- Java使用异常来表示错误，通过try{...} catch {...}捕获异常
- Java的异常是class，并且从Throwable集成
- Error是无需捕获的严重错误
- Exception是应该捕获的可处理的错误
- RuntimeException无需强制捕获，非RuntimeException(CheckedException)需要强制捕获，或者用throws声明。

## 断言和日志
### 断言

- 断言是一种调试方式，断言失败会抛出AssertionError
- 只能在开发和测试阶段启动断言
- 对可恢复的错误不能使用断言，而应该抛出异常
- 断言很好被使用，更好的方法是编写单元测试。

### Logging

- 日志是为了替代System.out.println()，可以定义格式，重定向到文件。
- 日志可以存档，便于问题追踪
- 日志可以按级别分类，便于打开和关闭某些级别
- 可以根据配置文件调整日志，无需修改代码
- JDK提供了Logging：java.util.logging

### Commons Logging

- Commons Logging定义了6个日志级别：
    - FATAL
    - ERROR
    - WARNING
    - INFO <---------------默认级别
    - DEBUG
    - TRACE

- Commons Logging 是使用最广泛的日志模块
- Commons Logging 的API非常简单
- Commons Logging 可以自动使用其他日志模块

## Log4j

- 目前最流行的日志框架：
    - 1.x: Log4j
    - 2.x: Log4j2
- 始终使用Commons Logging接口来写入日志
- 开发阶段无需引入Log4j
- 使用Log4j只需要把正确的配置文件和相关的jar包放入classpath
- 使用配置文件可以灵活修改日志，无需修改代码
- 如果要更换Log4j，只需要移除log4j.xml和相关jar包
- 只有扩展log4j时，才需要引入Log4j的接口


# Java反射与泛型

## 反射

### Class类
- JVM为每个class创建对应的Class实例来保存class的所有信息
- 获取一个class对应的Class实例后，就可以获取该class的所有信息
- 通过class实例获取class信息的方法称为反射Reflection
- JVM总是动态加载class，可以在运行期根据条件控制加载class

### 访问字段
- Field字段封装了字段的所有信息
- 通过Class实例的方法可以获取Filed实例：getField / getFields / getDeclaredField / getDeclaredFields
- 通过Field实例可以获取字段信息：getName / getType / getModifiers
- 通过Field实例可以读取或设置某个对象的字段： get(Object name) / set(Object instance, Object fieldValue)
- 通过设置setAccessible(true)来访问非public字段，但是注意：setAccessible(true)可能会失败，如果jvm定义来SecurityManager，并且SecurityManager的规则阻止对该Field设置accessible，就会导致失败

### 调用方法
- Method对象封装了方法的所有信息
- 通过class实例的方法可以获取Method实例：getMethod / getMethods / getDeclaredMethod / getDeclaredMehtods
- 通过Method实例可以获取方法信息：getName / getReturnType / getParameterTypes / getModifiers
- 通过Method实例可以调用某个对象的方法：Object invoke(Object instance, Object... parameters)
- 通过设置setAccessible(true)来访问非public方法

### 调用构造方法
- Constructor对象封装来构造函数的所有信息
- 通过Class实例的方法可以获取Constructor实例： getConstructor / getConstructors / getDeclaredConstructor / getDeclaredConstructors
- 通过Constructor实例可以创建一个实例对象：newInstance(Object... parameters)
- 通过设置setAccessible(true)来访问非public构造方法

### 获取继承关系
- 通过Class对象获取继承关系：
    - getSuperclass()
    - getInterfaces()
- 通过Class对象的isAssignableFrom()方法可以判断一个向上转型是否正确。

## 泛型

### 什么是泛型
- 泛型就是编写模板代码来适应任意类型
- 不必对类型进行强制转换
- 编译器将对类型进行检查
- 注意泛型的继承关系：
    - 可以把ArrayList<Integer>向上转型为list<Integer>（T不能变）
    - 不能把ArrayList<Integer>向上转型为ArrayList<Number>

### 使用泛型
- 使用泛型时，把泛型参数<T>替换为需要的class类型：List<String> list = new ArrayList<String>()
- 可以省略编译器能自动推断出的类型：List<String> list = new ArrayList<>()
- 不指定泛型参数类型时，编译器会给出警告，且只能将<T>视为Object类型

### 编写泛型
- 编写泛型事，需要定义泛型类型<T>
```java
public class Pair<T> {...}
```
- 静态方法不能引用泛型类型<T>，必须定义其他类型<K>来实现“泛型”
```java
public static <K> Pair<K> create(K first, K last) {...}
```
- 泛型可以同事定义多种类型<T, K>
```java
public class Pair<T, K> {...}
```

### 擦拭法
- Java的范型采用擦拭法实现
- 擦拭法决定来范型<T>:
    - 不能是基本类型，例如int
    - 不能获取带范型类型的Class，如：Pair<String>.class
    - 不能判断带范型类型的类型， 如：x instanceof Pair<String>
    - 不能实例化T类型，如：new T()
    - 范型方法要防止重复定义方法，例如：public boolean equals(T obj)
- 子类可以获取父类的范型类型<T>

### Java类型与反射
- 部分反射API是范型：
    - Class<T>
    - Constructor<T>
- 可以声明带泛型的数组，但是不能直接创建带泛型的数组，必须潜质转型
- 可以通过Array.newInstance(Class<T>, int)创建T[]数组，需要强制转型


# Java集合

## Java集合简介

### Java集合简介
- java集合定义在java.util包中
- 常用的集合类包括List、Set、Map等
- Java集合使用统一的Iterator遍历集合
- 尽量不要使用遗留接口

## List

### 使用List
- ArrayList VS LinkedList:

|       | ArrayList | LinkedList |
| :---: | :-------: | :--------: |
|获取指定元素| 速度很快| 需要从头开始查找元素
|添加删除元素| 速度很快| 速度很快
|在指定位置添加/删除| 需要移动元素| 不需要移动元素
|内存占用| 少 | 较大

list的特点
- 按照索引顺序访问的长度可变的链表
- 优先使用ArrayList而不是LinkedList
- 可以直接使用for……each遍历
- 可以和Array相互转换

### 编写equals方法
如果在List中查找元素：
- List的实现类通过元素的equals方法比较两个元素
- 放入的元素必须正确覆写equlals方法， JDK提供类的String，Integer等已经覆写类eauqls方法
- 编写equals方法可借助Object.equals()判断

如果不在List中查找元素：
- 不必覆写equals方法

## Map
### 使用Map集合
- Map<K, V>是一种映射表，可以通过Key快速查找Value
- 可以通过for……each遍历KeySet()
- 可以通过for……each遍历entryset()
- 需要对Key排序时使用TreeMap
- 通常使用HashMap

### 编写eauals和hashCode方法
- 作为Key的对象必须正确覆写equals和hashCode
- 一个类如果覆写类equals，就必须覆写hashCode
- hashCode可以通过Objects.hashCode()辅助实现

## Set集合
### 使用Set
- Set用于存储不重复的元素集合
- 放入set的元素与作为Map的Key的要求相同，正确实现equals方法和hashCode方法。
- 利用set可以取出重复元素
- 遍历SortedSet按照元素的排序顺序遍历，也可以自定义排序算法。

## Queue
### 使用Queue
- Queue是一个先进先出的队列
- LinkedList实现了Queue<E>接口
- 获取队列长度：size()
- 添加元素到队列：boolean add(E e) / boolean offer(E e)
- 获取队列头部元素病删除： E remove() / E poll()
- 获取队列头部元素但不删除：E element() / E peek()
操作队列时都提供了两种方法的原因是，获取失败时：

|       | throw Exception | 返回false或null |
| :----:| :-------------: | :------------: |
| 添加元素到队列 | add(E e) | boolean offer(E e) |
|取队首元素并删除| E remove() | E poll() |
|取队首元素但不删除| E element() | E peek() |

-避免把null添加到队列

### 使用PriorityQueue

- PriorityQueue<E>的出队顺序与元素的优先级相关：remove()/poll()总是取优先级最高的元素
- PriorityQueue<E>具有Queue<E>的接口：操作与Queue相同（参考上面的**使用Queue**）
- PriorityQueue<E>实现一个优先队列
- 从队首后去元素时，总是获取优先级最高的元素
- 默认按元素比较的顺序排序（必须实现Comparable接口）
- 可以通过Comparator自定义排序算法（不必实现Comparable接口）

### 使用Deque
- Deque<E>实现了一个双端队列（Double Ended Queue）:既可以添加到队尾，也可以添加到队首；既可以从队首获取，又可以从队尾获取

|               |   Queue   |   Deque   |
| :-----------: | :-------: | :-------: |
|  添加元素到队尾 | add(E e)/offer(E e) | addLast(E e)/offerLast(E e) |
| 取队首元素并删除 | E remove()/E poll() | E removeFirst()/E pollFirst() |
| 取队首元素但不删除 | E element()/E peek() | E getFirst()/E peekFirst() |

Deque特有方法：

|               |   Queue   |
| :-----------: | :-------: | 
|  添加元素到队首 | addFirst(E e)/offerFirst(E e) | 
| 取队尾元素并删除 | E removeLast()/E pollLast() | 
| 取队尾元素但不删除 | E getLast()/E peekLast() | 

## Stack
### 使用Stack
- 栈是一种后进先出的数据结构。
- 使用Deque实现Stack的功能
- 操作栈的元素的方法:
    - push(E e):压栈
    - pop():出栈
    - peek():取出栈顶元素但不出栈
- Java使用Deque实现栈的功能，注意只调用push/pop/peek，避免使用Deque的其他方法
- 不要使用遗留类Stack    

## 最佳实践
### Iterator迭代模式
- Java的集合类可以实现for……each循环：List、Set、Queue、Deque。
- 如何让自己编写的集合类使用for……each循环：
    - 实现Iterable接口
    - 返回Iterator对象
    - 用Iterator对象迭代
- 使用Iterator的好处：
    - 对任何集合都采用同一种访问模型
    - 调用者对集合内部结构一无所知
    - 集合返回的Iterator对象知道如何迭代
    - Iterator是一种抽象的数据访问模型
    
### 使用Collections
- Collections是JDK提供的工具类：
    - 创建空集合
        - List<T> emptyList()
        - Map(K, V) emptyMap()
        - Set<T> emptySet()
        
    - 对List排序（必须传入可变List）
        - void sort(List<T> list)
        - void sort(List<T> list, Comparator<? super T> c)
    - 随机重置List元素
        - void shuffle(List<?> list)
    - 创建单元素集合
        - Set<T> singleton(T o)
        - List<T> singletonList(T o)
        - Map<K, V> singletonMap(K key, V value)
    - 创建不可变集合
        - List<T> unmodifiableList(List<? extends T> list)
        - Set<T> unmodifiableSet(Set<? extends T> set)
        - Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> m)
    - 排序/洗牌
    - ……

# Java IO编程
## IO基础
### IO简介
- IO指输入输出：
    - 输入是指从外部读数据到内存，例如，读文件，从网络读取数据等。
    - 输出是把数据从内存输出到外部，比如写文件，输出到网络
- IO流是一种顺序读写数据的模式
    - 单向流动
    - 以byte为最小单位（字节流）
- 如果字符不是单字节表示的ASCII：
    - Java提供了Reader/Writer表示字符流
    - 字符流传输的最小数据单位是char
    - 字符流输出的byte取决于编码方式
    - Reader/Writer本质上是一个能自动编解码的InputStream/OutputStream
- 同步IO
    - 读写IO时代码等待数据返回后才继续执行后续的代码
    - 代码编写简单，CPU执行效率地
- 异步IO
    - 读写IO时仅发出请求，然后立刻执行后续代码
    - 代码编写复杂，CPU执行效率高
- JDK提供的java.io是同步IO
- JDK提供的java.nio是异步IO
 
 |抽象类|InputStream|OutputStream|Reader|Writer|
 |:---:|:---------:|:----------:|:----:|:----:|
 |实现类|FileInputStream|FileOutputStream|FileReader|FileWriter|

- Java的IO流的接口和实现是分离的：
    - 字节流接口：InputStream / OutputStream
    - 字符流接口：Reader/ Writer

### File对象
- java.io.File表示文件系统一个文件或者目录
- 创建File对象本身不涉及IO操作
- 获取路径/绝对路径/规范路径：getPath() / getAbsolutePath() / getCanonicalPath()
- 可以获取目录的文件和子目录
- 通过File对象可以创建或删除文件和目录

### InputStream
- java.io.InputStream是所有输入流的超类
    - abstract int read():读取下一个字节，并返回字节（0-255），如果读到末尾，返回-1
    - int read(byte[] b):读取若干字节病填充到byte[]数组，返回读取的字节数
    - int read(byte[] , int off, int len):指定byte[]数组的偏移量和最大填充数
    - void close():关闭输入流
- InputStream定义了所有输入流的超类
- FileInputStream实现了文件流输入
- ByteArrayInputStream在内存中模拟一个字节流输入
- 使用try(resource)保证InputStream正确关闭

### OutputStream
- java.io.OutputStream是所有输出流的超类
    - abstract write(int b):吸入一个字节
    - void write(byte[] b):写入byte[]数组的所有字节
    - void write(byte[] b, int off, int len):写入byte[]数组指定范围的字节
    - void close():关闭输出流
    - void flush():将缓冲区内容输出(像磁盘网络设备并不是输出一个字节就立即写入，而是先把输出的字节放到内存的缓冲区中，等待缓冲区满后再一次性写入设备)
- OutputStream定义了所有输出流的超类
- FileOutputStream实现了文件流输出
- ByteArrayOutputStream在内存中模拟一个字节流输出
- 使用try(resource)保证OutputStream正确关闭    

### Filter模式
- JDK提供的InputStream包括：
    - FileOutputStream：从文件中读取数据
    - ServletInputStream：从HTTP请求读取数据
    - Socket.getInputStream：从TCP连接读取数据
    - ……
- Java IO使用Filter模式为InputStream和OutputStream增加功能
- 可以把一个InputStream和任意FilterInputStream组合
- 可以把一个OutputStream和任意的FilterOutputStream组合
- Filter模式可以在运行期间动态增加功能（又称Decorator模式）

### 操作Zip
- ZipInputStream是一种FilterInputStream：
    - JarInputStream --> ZipInputStream --> InflaterInputStream --> FilterInputStream --> InputStream
    - 可以直接读取Zip的内容
- ZipOutputStream是一种OutputStream：可以直接写入Zip文件内容
- ZipInputStream和ZipOutputStream都是FilterInputStream和FilterOutputStream
- 配合FileInputStream和FileOutputStream就可以读写Zip文件

### classpath资源
- Java存放.class或jar包的目录也可以包含任意其他类型的文件
- 从classpath读取文件可以避免不同环境下文件路径不一致的问题
- 把资源存储在classpath中可以避免文件路径依赖
- Class对象的GetResourceAsStream()可以从classpath读取资源
- 需要检查返回的InputStream是否为null

### 序列化
- 序列化是指把一个java对象边城二进制内容（byte[]）
    - 序列化后可以把byte[]保存到文件中
    - 序列化后可以把byte[]通过网络传输
- 一个Java要能序列化，必须实现Serializable接口：
    - Serializable接口没有定义任何方法
    - 空接口被称为“标记接口”（Marker Interface）
- 反序列化是指一个二进制内容（byte[]）变成Java对象
    - 反序列化后可以从文件读取byte[]并变为Java对象
    - 反序列化后可以从网络读取byte[]并变为Java对象
    - 反序列化时不调用构造方法
- 可设置serialVersionUID作为版本号（非必须）
- Java序列化机制仅适用于Java，如果需要与其他语言交换数据，必须使用通用的序列化方法，比如JSON    
    
### Reader
java.io.Reader和java.io.InputStream的区别：

|  InputStream  |  Reader  |
|:-------------:|:--------:|
|字节流，以byte为单位|字符流，以char为单位|
|读取字节（-1，0-255）：int read()|读取字符(-1, 0-65535):int read()|
|读到字节数组:int read(byte[] b)|读到字符数组:int read(char[] c)|
|int read(byte[] b, int offset, int len)|int read(char[] c, int offset, int len)|

- java.io.Reader是所有字符输入流的超类：
    - int read():读取一个字符，并返回字符（0-65535），如果已读到末尾，返回-1
    - int read(char[] c):读取若干字符并填充到char[]数组，返回读取的字符数
    - int read(char[] c, int off, int len):指定char[]数组的偏移量和最大填充数
    - void close():关闭Reader
- Reader定义了所有字符输入流的超类
- FileReader实现了文件字符流输入
- CharArrayReader在内存中模拟一个字符流输入
- Reader是给予InputStream构造的
- FileReader使用系统默认编码，无法指定编码
- 可以通过InputStreamReader指定编码
- 使用try(resource)保证Reader正确关闭

### Writer
java.io.Writer和java.io.OutputStream的区别：

|  OutputStream  |  Writer  |
|:--------------:|:--------:|
|字节流，以byte为单位|字符流，以char为单位|
|写入字节（0-255）：void write(int b)|写入字符(0-65535):int write()|
|写入字节数组:int write(byte[] b)|写入字符数组:int write(char[] c)|
|int write(byte[] b, int offset, int len)|int write(char[] c, int offset, int len)|
| |void write(String s)|


- java.io.Writer是所有字符输入流的超类：
    - int write(int c):写入一个字符（0-65535）
    - int write(char[] c):写入若干字符数组的所有字符
    - int write(char[] c, int off, int len):写入数组指定范围的字符
    - void write(String s):写入String表示的所有字符
- FileWriter实现了文件字符流输出
- CharArrayWriter在内存模拟一个字符流输出
- Writer基于OutputStream构造
- FileWriter使用系统默认编码，无法指定编码，可以通过OutputStreamWriter指定编码
- 使用try(resource)保证Writer正确关闭


# Java处理日期和时间
## 概念
### 概念
- 理解日期、时间和时刻
- 理解时区的概念
- 理解夏令时，同一地区使用GMT/UTC和城市表示的时区可能导致时间不同
    - GTM-05:00
    - America/New_York
- 理解locale用来针对当地用户习惯格式化日期、时间、数字、货币等。

### java.util.Date
java.util.date的问题：
- 不能转换时区
- 日志和时间的加减不方便
- 两个日期相差多少天不好计算
- 计算某个月第一个星期一不方便
- ……

总结
- 理解epoch time
- Java有两套日期和时间的API
    - java.util.Date/Calendar
    - java.time
- 正确使用java.util.Date
    - Date和long的转换
    - Date和String的转换：SimpleDateFormat

### Calendar
- Calendar和Date、long可以相互转换
- Calendar可以用set/get设置和获取指定字段
- Calendar可以实现：
    - 设置特定的日期和时间
    - 设置时区并获得转换后的时间
    - 加减日期和时间
- TimeZone表示时区，getAvailableDs()可以美剧所有有效的时区ID

## java.time的API
### LocalDateTime
- LocalDateTime无法与long进行转换
    - 因为LocalDateTime没有时区，无法确定某一时刻
    - ZonedDateTime有时区，可以与Long进行转换
LocalDate、LocalTime、LocalDateTime
- 不变类
- 默认按照ISO 8601标准格式化和解析
- 使用DateTimeFormatter自定义格式化和解析
- 使用plusDays()/minusHours()等方法对日期和时间进行加减，返回新对象
- 使用withDayOfMonth()/with()等方法调整日期和时间，返回新对象
- 使用isBefore()/isAfter()/equals()判断日期和时间的先后

### ZonedDateTime

ZonedDateTime = LocalDateTime + Zoneld
- ZonedDateTime:带时区的日期和时间
- Zoneld：新的时区对象（取代旧的java.util.TimeZone）
- Instant:时刻对象（epoch seconds）


[1]: https://www.tutorialspoint.com/java/images/number_classes.jpg
[2]: http://7xs7kk.com1.z0.glb.clouddn.com/exception-structure.jpg