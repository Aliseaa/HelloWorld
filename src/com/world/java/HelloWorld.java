package com.world.java;

import com.isme.bean.Smart;

import java.util.ArrayList;

public class HelloWorld {
    private static final Smart SAR= new Smart();//prsf
    public static final int NUM = 1;//psf
    public static final int NUM1= 2;//psfi
    public static final String NATION = "English";

    private static final int INITIAL_SIZE = 10;
    private int index;
    private int size;

    public static void main(String[] args) {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
//       Date date = new Date();
        //list多态方法，集合对象
//        ArrayList <String> list1 = new ArrayList<>();

        //添加元素add
//        list1.add("1");
//        list1.add("2");
//        list1.add("3");
//        list1.add("4");
//        System.out.println("这是:"+list);
//        System.out.println("HelloWorld.main"); //soutm
//        System.out.println("list1 = " + list1);//soutv
//        System.out.println("args = " + Arrays.deepToString(args));//soutp
        //删除
//        String removeA=list.remove(2);
//        System.out.println("被移除的数字:"+removeA);
//        System.out.println(list);
        //替换
//        String setA=list.set(1,"A");
        //System.out.println("被替换的元素:"+ setA);
        //System.out.println(list);
        //list长度
        //System.out.println(list.size());

        //集合 list.for
        ArrayList list = new ArrayList();
        list.add(0, 123);
        list.add("w");
        list.add(456);
        list.add(159);
        //list.for
        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //定义数组
        String[] str = new String[]{"My", "birthday", "will", "be", "in", "a", "few", "days"};
        //fori
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
            System.out.println("--------------------------------------------");
        }

        //iter
        for (String s : str) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            System.out.println(s);
        }
    }
    public void GTR(){
        //If
        ArrayList list = new ArrayList();
        list.add("my");
        list.add(1);
        list.add(2);
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        //xxx.nn  /  xxx.null
        if (list != null) {

        }

        if (list == null) {

        }
    }
}
