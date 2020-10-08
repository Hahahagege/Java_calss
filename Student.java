package JavaCode;

import java.util.ArrayList;

public class Student {
    String name;
    String snum;
    int age;
    ArrayList course=new ArrayList();

    public void getInfo(){
        System.out.print("name:"+name+"\n"+"snum:"+snum+"\n"+"age:"+age+"\n"+"course:");
        for (Object object:course) {
            System.out.print(object);
            System.out.println();
        }
    }

    public void xuanKe(String s){
        course.add(s);
    }

    public void tuiKe(String s){
        course.remove(s);
    }
}
