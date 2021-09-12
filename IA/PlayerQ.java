import greenfoot.*;
public class PlayerQ extends Player
{
    public static int start = 0;
    public static int end = 0;
    public static int length = 0;
    public static int[] arr = new int[10];
    public static void q(int i){
        arr[end] = i;
        end++;
        length++;
    }
    public static void dq(){
        arr[start] = 0;
        length--;
        start++;
    }
    public static boolean isEmpty() {
        if(start == end && length == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isFull() {
        if(start == end && length != 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
