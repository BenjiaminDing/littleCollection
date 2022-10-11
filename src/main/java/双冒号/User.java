//package 双冒号;
//
//import lombok.Data;
//
//import java.util.function.Supplier;
//
///**
// * created at 2021/9/15 16:37  littleCollection
// */
//    @Data
//    public class User {
//
//        private String name;
//        private Integer age;
//
//        public User() {
//        }
//
//        public User(String name, Integer age) {
//            this.name = name;
//            this.age = age;
//        }
//
//        public static User create(Supplier<User> supplier) {
//            return supplier.get();
//        }
//
//        public static void updateUserName(User user) {
//            user.setName(user.getName() + " update");
//        }
//
//        public void updateAge() {
//            this.setAge(this.getAge() + 10);
//        }
//
//        public void changeAge(User user) {
//            user.setAge(user.getAge() + 10);
//        }
//    }
//
//
