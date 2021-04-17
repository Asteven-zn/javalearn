# java流程控制

## 一. Scanner 对象

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210407162056404.png" alt="image-20210407162056404" style="zoom:50%;" />

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210407164212176.png" alt="image-20210407164212176" style="zoom:50%;" />

### 1. next()案例

```java
package com.zn.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描对象，用于接受键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收：");

        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            //使用next方式接收
            String str = scanner.next();
            System.out.println("输出的内容为:"+str);

        //凡是属于IO流的类如果不关闭会一直占用资源，用完要及时关闭
        scanner.close();
        }
    }
}

//输出内容
使用next方式接收：
hello wold
输出的内容为:hello
```

### 2. nextline()案例

```java
package com.zn.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextline方式接收：");

        if (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输出的内容为:"+str);
            scanner.close();
        }
    }
}

//输出内容
使用next方式接收：
hello wold
输出的内容为:hellowold
```

### 3.获取用户输入内容

```java
package com.zn.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入需要打印的内容：");

        String str = scanner.nextLine();

        System.out.println("您打印的内容为:"+str);
    }
}

//输出内容
请输入需要打印的内容：
hello join
您打印的内容为:hello join
```