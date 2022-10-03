package DSA.recursion;

public class MoveXToEnd {

    public static void main(String args[]){
        String str = "raxshxmxi";
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        moveToEnd(str,str1,str2,0);
    }

    private static void moveToEnd(String str, StringBuilder str1, StringBuilder str2, int ind) {
        if(ind == str.length()){
            System.out.println(str1.append(str2));
            return;
        }

        if(str.charAt(ind) =='x'){
            str2.append("x");
        }
        else if(str.charAt(ind) != 'x'){
            str1.append(str.charAt(ind));
        }
        moveToEnd(str,str1,str2,ind+1);
    }
}
