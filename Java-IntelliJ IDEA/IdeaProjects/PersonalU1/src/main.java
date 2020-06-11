import java.io.*;
public class main {
    public static void main( String args[] ) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String s;
        while( (s = br.readLine()) != null ) {
            long n = Long.parseLong(s);
            sb.append(n-1);
            sb.append("\n");
        }
        System.out.print(sb.toString());

    }
}