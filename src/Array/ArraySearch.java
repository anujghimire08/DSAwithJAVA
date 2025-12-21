package Array;
// search element availability on arr
public class ArraySearch {
    public static void main(String[] args){
        int [] arr ={1,2,3,4,5};
        int needEl = 2;
        boolean found = false;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] == needEl){
                found =true;
            }

        }
        if(found){
            System.out.println(("Element " + needEl + " Matched"));
        }
        else{
            System.out.println(("Element " + needEl + " Not Matched"));

        }
    }

}

