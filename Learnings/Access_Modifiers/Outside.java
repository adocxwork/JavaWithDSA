import subFolder.subSubFolder.Inside;

public class Outside {
    public static void main(String[] args) {
        Inside obj = new Inside();
        System.out.println("Outside Package (non child class): "+obj.val);

        Outside2 obj2 = new Outside2();
        obj2.printValueOfInside();
    }
}


class Outside2 extends Inside{ //inheritance
    void printValueOfInside()
    {
        Inside obj = new Inside();
        System.out.println("Outside Package (child class): "+obj.val);
    }
}