import java.io. * ;
import java.util.Scanner;

public class Import {

    public class CsvParser {
        public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(new File());

            scan.useDelimiter(",");
            while (scan.hasNext()) {
                System.out.print(scan.next());
            }
            scan.close();
        }
    }
}

