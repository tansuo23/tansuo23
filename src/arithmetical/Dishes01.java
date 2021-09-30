package arithmetical;

/**
 * @author: 探索科技：建龙
 * @date 2021.9.25
 * @Version 1.0
 */
public class Dishes01 {
    public static void selelct(int[] arr) {
        if (arr == null || arr.length < 2) {
            return ;
        }
        int N = arr.length;
        for (int i = 1; i < N; i++) {
            for (int end = i - 1; end >= 0 && arr[end] > arr[end + 1]; end--) {
                pritn(arr, end, end + 1);
            }
        }

    }

    public static void pritn(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    public static void fu(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 7, 0, 2, 5, 6, 1, 8};
        selelct(arr);
        fu(arr);
        selelct(arr);
    }
}
