import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Record {
    private int[] records = new int[3];

    public Record(){
        records[0] = 100;
        records[1] = 14;
        records[2] = 21;
    }

    public int getRecord1(){
        return records[0];
    }

    public int getRecord2(){
        return records[1];
    }

    public int getRecord3(){
        return records[2];
    }

    public void setRecord1(int record) {
        records[0] = record;
    }

    public void setRecord2(int record) {
        records[1] = record;
    }

    public void setRecord3(int record) {
        records[2] = record;
    }

    public void saveData() {
        try {
            File f = new File("src/record.data");
            f.createNewFile();
            FileWriter fw = new FileWriter("src/record.data");
            String data = "Level 1 Record: " + getRecord1() + "\nLevel 2 Record: " + getRecord2() + "\nLevel 3 Record: "
                    + getRecord3();
            fw.write(data + "\n");
            fw.close();
        }
        catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
    }
}
