package Week1.Day5.Assignemnts;
import java.util.Arrays;
import java.util.List;

//Concepts Covered: How actually JVM stores and during compiling and running and How delete through Garbage collector
public class MemoryManagement {

    public static class BookReader {

        public BookReader(String name, int numOfPages, String path) {
            this.name = name;
            this.numOfPages = numOfPages;
            this.path = path;
        }

        private static final int READING_SPEED_MINUTES_PER_PAGE = 30;
        private String name;
        private int numOfPages;
        private String path;


        public void readTheBook() {

            System.out.printf("Reading the book %s.\n", name);
            System.out.printf("Number of pages in the book %d.\n", numOfPages);

            int timeInMinutesForReading = READING_SPEED_MINUTES_PER_PAGE * numOfPages;

            List lines = readAllLines(path);

            for(Object line: lines) {
                System.out.println(line);
            }

            System.out.printf("Time taken to read the entire book is %d min(s).\n", timeInMinutesForReading);
        }


        private List readAllLines(String path) {
            List lines = Arrays.asList(new String[] {
                    "Hello this is sample line 1",
                    "Hello this is sample line 2",
                    "Hello this is sample line 3"
            });
            return lines;
        }

        public static void main(String[] args) {
            // Reader
            BookReader bookReader = new BookReader("Harry Potter and the Sorcerer’s Stone", 288, "harryPotter.pdf");

            // Read the book
            bookReader.readTheBook();
        }
    }
}
