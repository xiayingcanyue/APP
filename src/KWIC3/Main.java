package KWIC3;

public class Main {
    public static void main(String[] args) {

        KWICSubject kwicSubject = new KWICSubject();

        Input input = new Input("D:\\Desktop\\SoftwareTask\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        Output output = new Output(alphabetizer.getKwicList(), "D:\\Desktop\\SoftwareTask\\output.txt");


        kwicSubject.addObserver(input);
        kwicSubject.addObserver(shift);
        kwicSubject.addObserver(alphabetizer);
        kwicSubject.addObserver(output);

        kwicSubject.startKWIC();
    }
}
