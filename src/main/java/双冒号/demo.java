//package 双冒号;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * created at 2021/9/15 16:37  littleCollection
// */
//public class demo {
//    public static void main(String[] args) {
//        List<User> list = new ArrayList<>();
//        list.add(new User("xw",18));
//        list.add(new User("xz",34));
//        list.add(new User("xl",19));
//        list.add(new User("lh",24));
//        list.add(new User("lp",31));
//
//        //构造器方法引用
//        User newUser = User.create(User::new);
//        newUser.setAge(1);
//        newUser.setName("new");
//        System.out.println(newUser);
//
//        //类静态方法引用
//        list.forEach(User::updateUserName);
//        //类普通方法引用
//        list.forEach(User::updateAge);
//        //实例方法引用
//        User user = new User();
//        list.forEach(user::changeAge);
//        list.forEach(System.out::println);
//
//    }
//}
