package com.demo2;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author hyj98
 * @Date 2022-09-22 10:01
 * @Version 1.0
 */

public class Test1 {
    public static void main(String[] args) {
        User u1 = User.createInstance();
        User u2 = User.createInstance();
        User u3 = User.createInstance();

        System.out.println(u1+"---"+u2+"---"+u3);

        Teacher t1 = Teacher.createInstance();
        Teacher t2 = Teacher.createInstance();
        Teacher t3 = Teacher.createInstance();

        System.out.println(t1+"---"+t2+"---"+t3);

    }

}

//懒汉式
class User{
    private User(){
        System.out.println("user对象实例化.....");
    }

    static User u1;

    //内部懒汉式封装
    public static User createInstance(){
        //备注: 如果多线程,这个实例代码,还需要同步安全控制.
        if (u1 == null){
            u1 = new User();
        }
        return u1;
    }
}

//饿汉式
class Teacher{

    //私有构造
    private Teacher(){
        System.out.println("teacher实例化");
    }

    //提前初始化实例方法
    private static final Teacher t1 = new Teacher();


    public static Teacher createInstance(){

        return t1;
    }

}
