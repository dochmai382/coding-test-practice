import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            String S = br.readLine();
            for (int i = 0; i < S.length(); i++) {
                if (i < S.length() - 1 && S.charAt(i) == 'P' && S.charAt(i + 1) == 'O') {
                    sb.append("PHO");
                    i++;
                } else {
                    sb.append(S.charAt(i));
                }
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}