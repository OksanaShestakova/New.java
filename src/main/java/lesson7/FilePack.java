package lesson7;
    import java.io.File;
    import java.io.FileWriter;
    import java.io.IOException;
public class FilePack {
    public static void main (String[] args){
        String file= "GameNewFile.txt";
        FilePack filePack = new FilePack();
        filePack.createFile(file);
        filePack.writeToFile(file,"tryu");
    }
    public void createFile(String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }}
// more actions -surround try-catch
        public void writeToFile(String fileName, String text){
            try {
                FileWriter fileWriter= new FileWriter(fileName);
                fileWriter.write(text);
                fileWriter.close();
            } catch (IOException e){
                System.out.println("error");
                e.printStackTrace();
            }}

}
/*
public class FilePack {
    public static void main (String[] args){
        String file= "GameNewFile.txt";
        FilePack filePack = new FilePack();
        filePack.createFile(file);
        filePack.writeToFile(file,"tryu");
    }
    public void createFile(String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }}
    // more actions -surround try-catch
    public void writeToFile(String fileName, String text){
        try {
            FileWriter fileWriter= new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e){
            System.out.println("error");
            e.printStackTrace();
        }}

}*/
