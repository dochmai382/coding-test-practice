import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < notes.length; i++) {
            map.put(notes[i], i);
        }
        map.put("Bb", 1);
        map.put("Cb", 2); 
        map.put("B#", 3);
        map.put("Db", 4);
        map.put("Eb", 6);
        map.put("Fb", 7); 
        map.put("E#", 8);
        map.put("Gb", 9);
        map.put("Ab", 11);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String line = br.readLine();
            if (line.equals("***")) break;

            String[] input = line.split(" ");
            int move = Integer.parseInt(br.readLine());

            for (String s: input) {
                int currIdx = map.get(s);

                int nextIdx = (currIdx + move) % 12;
                if (nextIdx < 0) nextIdx += 12;

                sb.append(notes[nextIdx]).append(" ");
            }    
            sb.append("\n");
        }

        System.out.print(sb);
    }
}