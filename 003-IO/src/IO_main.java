import java.io.*;

public class IO_main {

    public static void main(String[] args) throws IOException {
        testFileOutputStream();
    }

    private static void testFileOutputStream() throws IOException {
        File file = new File("test.txt");
        FileOutputStream fos = new FileOutputStream(file);
        OutputStreamWriter write = new OutputStreamWriter(fos, "utf-8");

        write.append("中文");
        write.append("\r\n");
        write.append("consistent");
        write.close();
        fos.close();

    }
}
