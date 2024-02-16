//
//import java.util.List;
//
//public class DA {
//    // Нарушение DRY: Дублирование кода
//    public void processData(List<Integer> data) {
//        int sum = 0;
//        for (int num : data) {
//            sum += num;
//        }
//        System.out.println("Sum: " + sum);
//
//        double average = (double) sum / data.size();
//        System.out.println("Average: " + average);
//    }
//
//    public void processUserData(List<User> users) {
//        int totalAge = 0;
//        for (User user : users) {
//            //totalAge += user.getAge();
//        }
//        System.out.println("Total Age: " + totalAge);
//
//        double averageAge = (double) totalAge / users.size();
//        System.out.println("Average Age: " + averageAge);
//    }
//}
//
// public class DA {
//     public int calculateSum(List<Integer> list){
//         int sum = 0;
//        for (int num : list) {
//            sum += num;
//        }
//        return sum;
//    }
//
//    public int calSum(List<User> list){
//        int sum = 0;
//        for (User user: list) {
//            sum += user.getAge();
//        }
//        return sum;
//    }
//
//     public void processData(List list){
//         System.out.println("Sum: "+ calculateSum(list));
//
//         double avarage = (double) calculateSum(list) / list.size();
//     }
//    public void processUserData(List<User> users){
//        System.out.println(calSum(users));
//
//        double average = (double) calSum(users) / users.size();
//    }
//}
