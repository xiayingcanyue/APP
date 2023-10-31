package KWIC1;

import java.io.*;
import java.util.*;

public class KWIC1 {
    private ArrayList<String> kwicList = new ArrayList<String>();
    private ArrayList<String> lineTxt = new ArrayList<String>();
    private BufferedReader inputFile;
    private BufferedWriter outputFile;

    public static void main(String[] args) {

        KWIC1 kwic = new KWIC1();

        kwic.input(".\\src\\input.txt");
        kwic.shift();
        kwic.alphabetizer();
        kwic.output(".\\src\\output.txt");
    }


    public void input(String fileName) {
        try {
            inputFile = new BufferedReader(new FileReader(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String line;
        try {
            while ((line = inputFile.readLine()) != null) {
                lineTxt.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void output(String filename){
        Iterator<String> it = kwicList.iterator();
        try {
            outputFile = new BufferedWriter(new FileWriter(filename));
            while (it.hasNext()) {
                outputFile.write(it.next()+"\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (outputFile!=null) {
                    outputFile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void shift() {
        Iterator<String> it = lineTxt.iterator();
        while (it.hasNext()) {
            StringTokenizer token = new StringTokenizer(it.next());
            ArrayList<String> tokens = new ArrayList<String>();
            int i = 0;
            int count = token.countTokens();
            while (i < count) {
                tokens.add(token.nextToken());
                i++;
            }


            for (i = 0; i < count; i++) {
                StringBuffer lineBuffer = new StringBuffer();
                int index = i;
                for (int f = 0; f < count; f++) {

                    if (index >= count)
                        index = 0;

                    lineBuffer.append(tokens.get(index));
                    lineBuffer.append(" ");
                    index++;
                }
                String tmp = lineBuffer.toString();
                kwicList.add(tmp);
            }
        }

    }


    public void alphabetizer() {
        Collections.sort(this.kwicList, new AlphabetizerComparator());
    }

    private class AlphabetizerComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1 == null && o2 == null) {
                throw new NullPointerException();
            }
            int compareValue = 0;
            char o1c = o1.toLowerCase().charAt(0);
            char o2c = o2.toLowerCase().charAt(0);
            compareValue = o1c - o2c;
            return compareValue;

        }

    }
}
