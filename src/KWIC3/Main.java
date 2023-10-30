package KWIC3;

public class Main {
    public static void main(String[] args) {

        KWICSubject kwicSubject = new KWICSubject();

        Input input = new Input(".\\src\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        Output output = new Output(alphabetizer.getKwicList(), ".\\src\\output.txt");


        kwicSubject.addObserver(input);
        kwicSubject.addObserver(shift);
        kwicSubject.addObserver(alphabetizer);
        kwicSubject.addObserver(output);

        kwicSubject.startKWIC();
    }
}
