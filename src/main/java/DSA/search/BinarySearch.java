package DSA.search;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,10,11,12,13,14,15};
        int element = -1;
        int i = search(arr,element,0,arr.length-1);
        System.out.println(i);
    }

    private static int search(int[] arr, int element,int l, int h) {
        if(l>h){
            return -1;
        }
        int mid = (l+h)/2;
        if(arr[mid] == element){
            return mid;
        }
        else if (element < arr[mid]) {
            return search(arr,element,l,mid-1);
        }
        else if(element > arr[mid]){
            return search(arr,element,mid+1,h);
        }
        return -1;
    }
}
