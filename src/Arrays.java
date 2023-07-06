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

//        int[] nums = new int[4];
//        // устанавливаем значения элементов массива
//        nums[0] = 1;
//        nums[1] = 2;
//        nums[2] = 4;
//        nums[3] = 100;
//
//        // получаем значение третьего элемента массива
//        System.out.println(nums[2]);    // 4

//        int[] nums = {1, 2, 3, 4, 5};
//        int length = nums.length;   // 5
//
//        int last = nums[nums.length-1];

//        int[] nums1 = new int[] { 0, 1, 2, 3, 4, 5 };
//
//        int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };
//
//        // установим элемент первого столбца второй строки
//        nums2[1][0]=44;
//        System.out.println(nums2[1][0]);
//
//        int[][][] nums3 = new int[2][3][4];

//        int[][] nums = new int[3][];
//        nums[0] = new int[2];
//        nums[1] = new int[3];
//        nums[2] = new int[5];

//        for (тип_данных название_переменной : контейнер){
//            // действия
//        }

//        int[] array = new int[] { 1, 2, 3, 4, 5 };
//        for (int i : array){
//
//            System.out.println(i);
//        }

        int[] array = new int[] { 1, 2, 3, 4, 5 };
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
