public class p2_StartsWith {
    static class Node {
        Node[] children;
        boolean eow;
        public Node(){
            children = new Node[26];
            for(int i=0; i<26; i++){ //important to avoid errors..
                children[i] = null;
            }
            eow = false;
        }
    }
    static Node root = new Node();
    public static void insert(String word) { // O(L)
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx =  word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                // add new node
                curr.children[idx] = new Node();
            }
            if(i==word.length()-1){
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];
            if(node == null){
                return false;
            }
            if(i==key.length()-1 && node.eow==false){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static boolean startsWith(String prefix){
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix ="app";
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(startsWith(prefix));

    }
}
