public class Arrays {
    public static void main(String args[]) {
//        тип_данных название_массива[];
//        ибо
//        тип_данных[] название_массива;

//        int nums[];
//        int[] nums2;
//
//        nums = new int[4];  // массив из 4 чисел

//        int nums[] = new int[4];    // массив из 4 чисел
//        int[] nums2 = new int[5];   // массив из 5 чисел

//        // эти два способа равноценны
//        int[] nums = new int[] { 1, 2, 3, 5 };
//
//        int[] nums2 = { 1, 2, 3, 5 };

        int[] nums = new int[4];
        // устанавливаем значения элементов массива
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;

        // получаем значение третьего элемента массива
        System.out.println(nums[2]);    // 4
    }
}
