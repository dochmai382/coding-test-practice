import java.util.*;
import java.io.*;

class Main {
    static class Student {
        String name;
        int fee;

        Student(String name, int fee) {
            this.name = name;
            this.fee = fee;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> timeMap = new HashMap<>(); 
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int time = convert(st.nextToken());
            String name = st.nextToken();

            timeMap.put(name, timeMap.getOrDefault(name, 0) + time);
        }

        List<Student> result = new ArrayList<>();
        for (String name : timeMap.keySet()) {
            int total = timeMap.get(name);
            int fee = 10;
            if (total > 100) {
                // fee += Math.ceil((double)(total - 100) / 50) * 3;
                fee += ((total - 100 + 49) / 50) * 3;
            }

            result.add(new Student(name, fee));
        }

        result.sort((s1, s2) -> {
            if (s1.fee == s2.fee) return s1.name.compareTo(s2.name);
            return s2.fee - s1.fee;
        });

        StringBuilder sb = new StringBuilder();
        for (Student s : result) {
            sb.append(s.name).append(" ").append(s.fee).append("\n");
        }
        
        System.out.print(sb);
    }

    private static int convert(String input) {
        StringTokenizer st = new StringTokenizer(input, ":");
        int hour = Integer.parseInt(st.nextToken()) * 60;
        int min = Integer.parseInt(st.nextToken());
        return hour + min;
    }
}