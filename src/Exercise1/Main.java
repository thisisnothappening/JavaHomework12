package Exercise1;

import java.util.HashMap;
import java.util.Map;

/*
1) create a map with key student(string) and value the grade. Print all students and their grades.

        Find the student with the highest grade
*/
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Cipri", 10);
        map.put("Marcelus", 8);
        map.put("Mircea", 6);

        System.out.println(map);

        int highestGrade = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (highestGrade < entry.getValue()) {
                highestGrade = entry.getValue();
            }
        }
        System.out.println(highestGrade);
    }
}
