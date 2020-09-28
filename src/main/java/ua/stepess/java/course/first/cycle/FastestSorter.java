package ua.stepess.java.course.first.cycle;

/**
 * Implement whatever Sort algorithm you want.
 * You should sort array in ascending order.
 */
public class FastestSorter {

    public int[] sort(int[] array)
    {
        int size = array.length;
        int s = 0; //обычный пузырек. s тут потому-что с каждым проходом самый большой справа.
        int temp; //потому с каждым проходом нужно будет меньше работы делать.
        int r = 1; //это проверка на наличие перемен в массиве
        while (r != 0) {
            r = 0;
            for (int i = 0; i < size - 1-s; i++)
            {
                if (array[i] > array[i+1])
                {
                    temp = array[i];  //свапаю местами
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    r = 1;
                }
            }
            s++;
        }
        return array;
    }

}
