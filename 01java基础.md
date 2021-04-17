# java基础

## 一. 新建一个空的工作空间

## 1. 在项目中选择空项目

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210403102636173.png" alt="image-20210403102636173" style="zoom: 67%;" />

## 2. 新建模块

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210403102845223.png" alt="image-20210403102845223" style="zoom:67%;" />

## 3. 填写模块信息

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210403102956804.png" alt="image-20210403102956804" style="zoom:67%;" />

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210403103058923.png" alt="image-20210403103058923" style="zoom:67%;" />

## 二. 输出helloworld

1. 创建java class

   ![image-20210403103224844](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210403103224844.png)

2. 输入“psvm”输出一个main方法

3. 输入“sout”输出一个标准合适输出

```java
public class hello {
    public static void main(String[] args) {
        System.out.println("hello,world!");
    }
}
```

![image-20210403103529284](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210403103529284.png)

## 三. 注释

## 1. 注释配置

![image-20210403104225424](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210403104225424.png)

## 2. 注释类型

1. 单行：//
2. 多行：/*   内容   */
3. 文档（JavaDoc）：/**   内容   */ 

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210403105623743.png" alt="image-20210403105623743" style="zoom: 67%;" />

## 四. 标识符

类名,变量名,方法及java关键字都被称为标识符

## 1. 关键字

![image-20210403110005778](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210403110005778.png)

## 2. 标识符注意事项

![image-20210403110324065](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210403110324065.png)

## 五. 数据类型

## 1. 数据类型分类：

![image-20210403201236790](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210403201236790.png)

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210403203158154.png" alt="image-20210403203158154" style="zoom:67%;" />

## 2. 字节

![image-20210403203627775](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210403203627775.png)

## 六. 类型转化

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210406153152453.png" alt="image-20210406153152453" style="zoom:50%;" />

### 1. 内除溢出

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210406153955371.png" alt="image-20210406153955371" style="zoom:50%;" />

### 2. 转化注意

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210406154859356.png" alt="image-20210406154859356" style="zoom: 80%;" />

### 3. 转化案例

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210406160121565.png" alt="image-20210406160121565" style="zoom:67%;" />

## 七. 变量及常量

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210406160648124.png" alt="image-20210406160648124" style="zoom: 67%;" />

### 1. 变作用域

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210406160951167.png" alt="image-20210406160951167" style="zoom:67%;" />

## 八. 运算符

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210406162118335.png" alt="image-20210406162118335" style="zoom:50%;" />

### 1. 赋值算术运算符

```java
package operator;

public class Demo01 {
    public static void main(String[] args) {
        // 二元运算符
        // Ctrl + D ： 复制当前行到下一行
        int a = 10;
        int b = 20;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((double) a/b);
    }

}

//输出
30
-10
200
0.5
```

类型不同的运算，输出结果会转化为最高级别的类型

```java
package operator;

public class Demo02 {
    public static void main(String[] args) {
        long a = 12334545635676L;
        int b = 123;
        short c = 10;
        byte d = 8;
        float e = 16.0f;
        double f = 0.8;
        System.out.println(a+b+c+d); //结果long
        System.out.println(b+c+d); //结果int
        System.out.println(c+d); //结果int
        System.out.println(e/f); //结果double
    }
}

//输出
12334545635817
141
18
20.0
```

### 2. 自增自减运算符

```java
package operator;

public class Demo03 {
    public static void main(String[] args) {
        //++ --   自增，自减号   一元运算符就是只需要一个变量
        int a = 3;

        int b = a ++;  //执行完这行代码后，先给b赋值，再自增
        //a = a + 1;
        System.out.println(a);
        System.out.println(b);

        int c = ++ a;  //执行完这行代码前，先自增，再给c赋值，
        //a = a + 1;
        System.out.println(a);
        System.out.println(c);
    }
}

//输出
4
3
5
5
```

### 3. 逻辑/位运算符

```java
package operator;

public class Demo04 {
    public static void main(String[] args) {
        // 与（and） 或（or） 非（取返）
        boolean a = true;
        boolean b = false;

        System.out.println("a && b:"+(a&&b)); //逻辑与，两个都为真，结构为真
        System.out.println("a || b:"+(a&&b)); //逻辑或，两个有一个为真，结构为真
        System.out.println("! (a && b):"+!(a&&b)); //如果是真，则为假，如果为假则为真

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4);  //第一个条件为假了，后面的也就不用执行了
        System.out.println(d);
        System.out.println(c);
    }
}

//输出
a && b:false
a || b:false
! (a && b):true
false
5
```

## 九. 包机制

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210407155527762.png" alt="image-20210407155527762" style="zoom:50%;" />

## 十. java Doc

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210407160045455.png" alt="image-20210407160045455" style="zoom: 50%;" />


在代码中添加java doc如下：

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210407160643928.png" alt="image-20210407160643928" style="zoom: 67%;" />

在cmd命令行中生成文档：

![image-20210407161214872](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210407161214872.png)

会在代码所在目录生成很多文件：
<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210407161253503.png" alt="image-20210407161253503" style="zoom: 100%;" />

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210407161444027.png" alt="image-20210407161444027" style="zoom:67%;" />