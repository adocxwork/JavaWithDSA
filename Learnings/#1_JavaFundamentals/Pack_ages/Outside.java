import Algebra.Inside;
// import Algebra.*; >> this is also right

class Outside
{
    public static void main(String[] args) {
        
        Inside obj = new Inside();
        System.out.println(obj.add(7,4));
        System.out.println(obj.sub(7,4));
    }
}