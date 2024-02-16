package arrays;

import java.util.Scanner;

public class Mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int num = sc.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // calling for the mergesort function
        mergesort(arr, 0, num - 1);

        // printing the array after mergesorting
        System.out.println("The elements after sorting are:");
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void mergesort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            sorting(arr, low, mid, high);
        }
    }

    public static void sorting(int[] arr, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;
        int[] temp = new int[high - low + 1];
        int i = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[i] = arr[left];
                left++;
            } else {
                temp[i] = arr[right];
                right++;
            }
            i++;
        }

        while (left <= mid) {
            temp[i] = arr[left];
            left++;
            i++;
        }
        while (right <= high) {
            temp[i] = arr[right];
            right++;
            i++;
        }

        for (int j = 0; j < temp.length; j++) {
            arr[low + j] = temp[j];
        }

    }
}
