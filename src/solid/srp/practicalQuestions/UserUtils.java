package solid.srp.practicalQuestions;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserUtils {

    // 1. Validation responsibility
    public static boolean isValidUser(User user) {
        return user.getEmail() != null && user.getEmail().contains("@");
    }

    // 2. Formatting responsibility
    public static String formatForDisplay(User user) {
        return user.getName().toUpperCase() + " <" + user.getEmail() + ">";
    }

    // 3. Persistence responsibility
//    public static void save(User user) {
//        Connection con = Db.getConnection();
//        String sql = "INSERT INTO users(name,email) VALUES (?,?)";
//        // execute insert...
//    }


    /* TODO :- This time find out the two and find all the possible outcomes */

    public static List<List<Integer>> twoSumWithDuplicate(int[] arr,int target){
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        int left = 0;
        int right = n-1;

        int resSum =0;
        while(left < right  ){
        int sum =  arr[left] +arr[right];
        if(sum == target){
            result.add(Arrays.asList(arr[left],arr[right]));
            left++;
            right--;
            while(arr[left] == arr[left-1]){
                left++;
            }while(arr[right] == arr[right +1]){
                right--;
            }
        }else if(sum <target){
            int diff = Math.abs(sum -target);


        }else{
            right--;
        }

        }
        return result;
    }
}
