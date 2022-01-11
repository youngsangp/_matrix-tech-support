package Sort;

public class Quick {
    public static void main(String[] args) {

        int[] testArr = {6,3,2,7,1,4,5,10,9,8};
        int arrSize = testArr.length;
        printArr(testArr);
        QuickSort(testArr, 0, arrSize-1);
    }

    static void swap(int[] a, int idx1, int idx2){
        System.out.println(idx1+"과 "+idx2+" swap");
        int t   =   a[idx1];
        a[idx1] =   a[idx2];
        a[idx2] =   t;
        printArr(a);
    }

    static void QuickSort(int[] a, int left, int right){
        int pl  = left;   //pl: 현재 왼쪽값, left: 초기 왼쪽 값
        int pr  = right;  //pr: 현재 오른쪽값, right: 초기 오른쪽 값
        int x   = a[(pl+pr)/2];  //pivot
        System.out.println("## Pivot : "+x);
        do{
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;

            if(pl <= pr) {
                swap(a, pl++, pr--);
            }

        }while(pl <= pr);

        if(left < pr)   QuickSort(a, left, pr);
        if(pl < right)  QuickSort(a, pl, right);
    }

    static void printArr(int[] a){
        for(int i=0;i<a.length;i++){
            if(i<a.length-1){
                System.out.print(a[i]+", ");
            }else{
                System.out.println(a[i]);
            }
        }
    }
}
