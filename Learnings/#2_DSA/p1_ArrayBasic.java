class Algebra{
    void multiArray(){
        // int intArr[][] = new int[3][2];
        // intArr[0][0] = 49;
        // intArr[0][1] = 79;
        // intArr[1][0] = 7;
        // intArr[1][1] = 9;
        // intArr[2][0] = 2;
        // intArr[2][1] = 4;
        // System.out.println(intArr[0][0]);
        // System.out.println(intArr[0][1]);
        // System.out.println(intArr[1][0]);
        // System.out.println(intArr[1][1]);
        // System.out.println(intArr[2][0]);
        // System.out.println(intArr[2][1]);
        
        int intArr2[][] = {{43,2},
        {7,8},
        {2,3}};
        System.out.println(intArr2[0][0]);
        System.out.println(intArr2[0][1]);
        System.out.println(intArr2[1][0]);
        System.out.println(intArr2[1][1]);
        System.out.println(intArr2[2][0]);
        System.out.println(intArr2[2][1]);
        System.out.println();
        System.out.println(intArr2.length); //3
    }


    void oneDArray(){
        int ages[] = new int[3];
        ages[0] = 2;
        ages[1] = 7;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }
}

public class p1_ArrayBasic{
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        obj.multiArray();
        // obj.oneDArray();
    }
}