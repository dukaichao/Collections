package Collections.Set;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-05-11
 * Time:14:17
 */
public class TestSet {
    public static void main(String[] args) {
        //一种比较可以这样写，第二种让Person类实现Comparable接口
        Set<Person> set = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                /*int t = o1.getAge() - o2.getAge();
                if(t>0){
                    return 1;
                }else if(t == 0){
                    return o1.getName().compareTo(o2.getName());
                }else{
                    return -1;
                }*/
                return o1.getAge() - o2.getAge();
            }
        });

        set.add(new Person(21,"dz"));
        set.add(new Person(21,"dz"));
        set.add(new Person(0,"dzt"));
        set.add(new Person(20,"zy"));
        set.add(new Person(21,"ccc"));
        System.out.println(set);
     }

     public static void code(){
         Set<Person1> set = new TreeSet<Person1>(new Comparator<Person1>() {
             @Override
             public int compare(Person1 o1, Person1 o2) {
                /*int t = o1.getAge()-o2.getAge();
                if(t>0) return 1;
                else if(t == 0) return o1.getName().compareTo(o2.getName());
                return -1;*/
                 return o1.getAge()-o2.getAge();
             }
         });
         set.add(new Person1(21,"dz",10));
         set.add(new Person1(21,"ccc",20));
         set.add(new Person1(0,"dzt",30));
         set.add(new Person1(20,"zy",40));
         set.add(new Person1(21,"ccc",50));
         System.out.println(set);
     }
}
