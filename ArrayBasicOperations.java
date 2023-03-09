
public class ArrayBasicOperations {

    public static int[] addAtFirst(int[] array, int value) {
        int[] newarr = array;
        array = new int[array.length + 1];
        array[0] = value;
        for (int i = 0; i < newarr.length; i++) {
            array[i + 1] = newarr[i];
        }
        return array;
    };

    public static int[] addAtlast(int[] array, int value) {
        int[] newarr = array;
        array = new int[array.length + 1];
        for (int i = 0; i < newarr.length; i++) {
            array[i] = newarr[i];
        }
        array[newarr.length] = value;
        return array;
    };

    public static int[] addAtIndex(int[] array, int index, int value) {

        if (index > array.length) {
            System.out.println("Index out of bound of length " + array.length);
        } else {

            int count = 0;
            int[] newarr = array;
            array = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                if (index == i) {
                    array[index] = value;
                    continue;
                } else
                    array[i] = newarr[count];
                count++;

            }
        }
        return array;
    };

    public static int[] addAtMiddle(int[] array, int value) {
        int middle = array.length / 2;
        int[] newarr = array;
        int count = 0;
        array = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (middle == i) {
                array[i] = value;
                continue;
            }

            else {
                array[i] = newarr[count];
                count++;
            }

        }
        return array;
    };

    public static int[] deleteAtFirst(int[] array) {
        if (array.length <= 0) {
            System.out.println("The Array is empty deletion is not possible ");
        } else {
            int[] newarr = array;
            array = new int[array.length - 1];
            for (int i = 1; i < newarr.length; i++) {
                array[i - 1] = newarr[i];
            }
        }
        return array;
    };

    public static int[] deleteAtlast(int[] array) {
        if (array.length <= 0) {
            System.out.println("The Array is empty deletion is not possible ");
        } else {
            int[] newarr = array;
            array = new int[array.length - 1];
            for (int i = 0; i < array.length; i++) {
                array[i] = newarr[i];
            }
        }
        return array;
    };

    public static int[] deleteAtIndex(int[] array, int index) {
        if (array.length <= 0) {
            System.out.println("The Array is empty deletion is not possible ");
        }

        else {
            int count = 0;
            int[] newarr = array;
            array = new int[array.length - 1];
            for (int i = 0; i < array.length + 1; i++) {
                if (i == index)
                    continue;
                else {
                    array[count] = newarr[i];
                    count++;
                }

            }

        }
        return array;
    };

    public static int[] deleteAtMiddle(int[] array) {
        if (array.length <= 0) {
            System.out.println("The Array is empty deletion is not possible ");
        }

        else {
            int middle = array.length / 2;
            int count = 0;
            int[] newarr = array;
            array = new int[array.length - 1];
            for (int i = 0; i < newarr.length; i++) {
                if (i == middle)
                    continue;
                else
                    array[count] = newarr[i];
                count++;

            }

        }
        return array;
    };

    public static void traverseArray(int[] arr) {
        for (int f : arr)
            System.out.print(" " + f);
        System.out.println();
    }

    public static int MaxInArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static int MinInArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static int sumofElementInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static float averageOfElementInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        float average = sum / array.length;
        return average;
    }

    public static int[] reverseArray(int[] array) {
        int[] newarr = array;
        array = new int[newarr.length];
        int count = 0;
        for (int i = newarr.length - 1; i >= 0; i--) {
            array[count] = newarr[i];
            count++;
        }
        return array;
    }

    // linear search:
    public static int seaarchAtIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (target == array[i])
                return array[i];
        }
        return -1;
    }

    public int binarySearchArray(int[] array, int target) {
        int startposition = 0;
        int lastposition = array.length - 1;
        while (startposition <= lastposition) {
            int middle = (startposition + lastposition) / 2;

            if (array[middle] == target)
                return middle;
            else if (target > array[middle])
                startposition = middle + 1;
            else
                lastposition = middle - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 89, 19, 6, 54, 32, 23, 45, 65, 87, 343 };
        System.out.println("The original array is given below ");
        traverseArray(arr);
//        System.out.println("After implementing some method of array the new array is  given below ");
        // // ---> add methods:
        arr = addAtFirst(arr, 1000);
        // arr = addAtlast(arr, 2000);
        // arr = addAtMiddle(arr, 1500);
        // arr=addAtIndex(arr, 8, 1300);
        traverseArray(arr);

        // ---> Delete methods:
        // arr = deleteAtFirst(arr);f
        // arr = deleteAtlast(arr);
//        arr = deleteAtIndex(arr, 4);
        // arr = deleteAtMiddle(arr);
        traverseArray(arr);
        // arr = reverseArray(arr);
        // traverseArray(arr);
        // System.out.println(MaxInArray(arr));
        // System.out.println(MinInArray(arr));
        // System.out.println(sumofElementInArray(arr));
        // System.out.println(averageOfElementInArray(arr));
        // System.out.println(seaarchAtIndex(arr, 87));
    }
}