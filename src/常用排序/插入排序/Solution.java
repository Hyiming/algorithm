package 常用排序.插入排序;public class Solution {    public static void insert_sort(int array[], int lenth) {        int temp;        for (int i = 0; i < lenth - 1; i++) {            for (int j = i + 1; j > 0; j--) {                if (array[j] < array[j - 1]) {                    temp = array[j - 1];                    array[j - 1] = array[j];                    array[j] = temp;                } else {         //不需要交换                    break;                }            }        }    }}