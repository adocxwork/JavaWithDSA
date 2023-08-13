package subFolder.subSubFolder;

public class Inside {
    public String val = "Hi Aditya!";
    public static void main(String[] args) {
        Inside obj = new Inside();
        System.out.println("Within class: "+obj.val);

        Inside2 obj2 = new Inside2();
        obj2.printVal();
    }
}

class Inside2{
    void printVal()
    {
        Inside obj = new Inside();
        System.out.println("Outside class: "+obj.val);
    }
}