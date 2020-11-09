package com.xu.classloader;

public class ClassLoaderTest1 {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@1b6d3586

        //获取引导类加载器：无法获取到
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);//null

        ClassLoader classLoader1 = ClassLoaderTest1.class.getClassLoader();
        System.out.println(classLoader1);

        ClassLoader classLoader2 = String.class.getClassLoader();
        System.out.println(classLoader2);
    }
}
