import java.util.ArrayList;

public class File {

  public File(String name) {
    this.name = name;
    this.files = new ArrayList<>();
  }

  public String name;
  public ArrayList<File> files;

}
