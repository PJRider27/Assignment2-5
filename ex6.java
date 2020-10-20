
public class ex6
{
public static void main(String[] args){
    displayBox(6,3);
}
public static void displayBox(int l, int h){
    for(int i=0;i<h;i++){
        for(int j=0;j<l;j++){
            System.out.print("$");
        }
        System.out.println();
    }
}
}
