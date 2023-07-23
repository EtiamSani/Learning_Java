package basics;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book(100);
        Book effectiveJava = new Book(878);
        Book cleanCode = new Book(99);

        artOfComputerProgramming.pages(583);
        effectiveJava.pages(5813);
        cleanCode.pages(588);

    }


}
