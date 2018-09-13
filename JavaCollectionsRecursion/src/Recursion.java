public class Recursion {
  public static void main(String[] args) {

    File diskC = new File("Disk C");

    File windows = new File("Windows");
    diskC.files.add(windows);

    File system32 = new File("System 32");
    windows.files.add(system32);

    File system40 = new File("Sysytem 40");
    windows.files.add(system40);

    File temp = new File("Temp");
    system32.files.add(temp);

    File text = new File("This is text");
    diskC.files.add(text);

    printDirectory(diskC, "");
  }

  private static void printDirectory(File file, String ident) {
    System.out.print(ident + " " + file.name);

    if (file.files.size() > 0) {
      System.out.println(" [Directory]");
    } else {
      System.out.println(" [File]");
    }

    for (File child : file.files
    ) {
      printDirectory(child, ident + "--");
    }
  }
}
