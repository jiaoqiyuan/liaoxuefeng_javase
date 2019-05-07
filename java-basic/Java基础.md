## 数组初始化

直接静态初始化为数组:
```java
int[] numbers = new int[]{1, 2, 3, 4};
int[] numbers = {1, 2, 3, 4};
```


动态初始化数组：
```
int[] numbers = new int[4];
```

## 列表初始化

笨方法：

```java
List<String> name = new ArrayList();
name.add("xxx");
name.add("yyy");
name.add("zzz");
```

使用 ArrayList 初始化：

```java
//不过这样的话这个list的size就固定了，不能再add了，要注意。
List<String> name = Arrays.asList("xxx","yyy","zzz");


List<String> name = new ArrayList<>(Arrays.asList("xxx","yyy","zzz"));
ArrayList<String> list = new ArrayList<String>(){{add("test1"); add("test2");}};  
```

