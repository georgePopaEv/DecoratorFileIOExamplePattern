import java.io.*;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        int c;

        StringBuffer stringBuffer = new StringBuffer("Jason Fedin aBBBcccDDD");
        byte[] bytes = stringBuffer.toString().getBytes();

        try {
            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while (( c = in.read()) >= 0){
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
