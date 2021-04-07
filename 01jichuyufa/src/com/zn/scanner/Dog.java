package com.zn.scanner;

public class Dog {
    int dogAge;
    public Dog(String name){
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name );
    }

    public void setAge( int age ){
        dogAge = age;
    }

    public int getAge( ){
        System.out.println("小狗的年龄为 : " + dogAge );
        return dogAge;
    }

    public static void main(String[] args){
        /* 创建对象 */
        Dog myDog = new Dog( "tommy" );
        /* 通过方法来设定age */
        myDog.setAge( 2 );
        /* 调用另一个方法获取age */
        myDog.getAge( );
        /*你也可以像下面这样访问成员变量 */
        System.out.println("变量值 : " + myDog.dogAge );
    }
}
