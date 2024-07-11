

public class MergeSort{
    public static void mergeRun(int arry[]) {
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }
        System.out.println();
    };
    public static void mergeSort(int arr[], int si, int ed) {
        if (si >= ed) {
            return;
        }
        int mid = si + (ed - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ed);
        merge(arr, si, mid, ed);
    }

    public static void merge(int arr[], int si, int mid, int ed) {
        int loop[] = new int[ed - si + 1];
        int i = si;
        int k = 0;
        int j = mid + 1;
        while (i <= mid && j <= ed) {
            if (arr[i] < arr[j]) {
                loop[k] = arr[i];
                i++;
            } else {
                loop[k] = arr[j];
                j++;
            };
            k++;
        };

        while (i <= mid) {
            loop[k++] = arr[i++];
        }
        while (j <= ed) {
            loop[k++] = arr[j++];
        }

        for (k = 0, i = si; k < loop.length; k++, i++) {
            arr[i] = loop[k];
        }
    }

    public static void main(String[] args) {
        int arry[] = {2, 4, 5, 6, 7, 3};
        mergeSort(arry, 0, arry.length - 1);
        mergeRun(arry);
    }
}