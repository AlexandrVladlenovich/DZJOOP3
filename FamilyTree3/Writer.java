package FamilyTree3;

import java.io.IOException;
import java.util.ArrayList;

public interface Writer {
    void writeInFile(ArrayList<String> inData) throws IOException;
    
}