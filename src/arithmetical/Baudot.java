package arithmetical;

/**
 * @author: 探索科技：建龙
 * @date 2021.9.22
 * @Version 1.0
 * 选择排序
 */
public class Baudot {
    public static void swap(int[] arr, int i, int j) {
        int tem = arr[j];
        arr[j] = arr[i];
        arr[i] = tem;
    }


    public static void select(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length; // 数组下标
        for (int i = 0; i < N; i++) {
            int manVule = i; // 最小值
            for (int j = i + 1; j < N; j++) {
                manVule = arr[j] < arr[manVule] ? j : manVule;
            }
            swap(arr, i, manVule);
        }

    }

    // 冒泡排序
    public static void doubo(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int i = N - 1; i >= 0; i--) {
            for (int scond = 1; scond <= i; scond++) {
                if (arr[scond - 1] > arr[scond]) {
                    swap(arr, scond - 1, scond);
                }
            }
        }
    }

    // 优化插入排序
    public static void inste(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int i = 1; i < N; i++) {
            // pre i -1 i 越界-
            for (int pre = i - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
                swap(arr, pre, pre + 1);
            }
        }
    }


    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 6, 8, 7, 9, 5, 12, 11, 22, 32, 5};
        print(arr);
//        select(arr);
//        doubo(arr);
        inste(arr);
        print(arr);

    }
}
