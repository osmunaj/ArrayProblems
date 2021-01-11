public class ArrayProblems {
    public static void main(String[] args){
        int[] numbers = {94, 1, 4, 7, 8, 17, 9, 2, 91, 3, 18, 14};
        //SwapEnds(numbers);
        //System.out.println(hasSeven(numbers));
        //System.out.println(mean(numbers));
        //reverse(numbers);
        //System.out.println(search(numbers, 3));
        System.out.println(PrintArray(numbers));
        sort(numbers);
        System.out.println(PrintArray(numbers));
    }

    public static String PrintArray(int[] array){
        String printArray = "";

        for (int i = 0; i < array.length; i++){
            printArray += array[i] + ", ";
        }

        return printArray;
    }

    public static void SwapEnds(int[] data){
        int[] array1 = data;
    
            int first = array1[0];
            int last = array1[array1.length - 1];
    
            array1[0] = last;
            array1[array1.length - 1] = first;
    
            for (int i = 0; i < array1.length; i ++){
                System.out.print(array1[i] + ", ");
            }
    }

    public static boolean hasSeven(int[] data){
        int array1[] = data;
        boolean hasSeven = false;
        for(int i = 0; i < array1.length; i++){
            if(array1[i] == 7){
                hasSeven = true;
            }
        } 
        return hasSeven;
    }

    public static double mean(int[] data){
        int[] array1 = data;

        double mean = 0;
        int total = 0;
        for (int i = 0; i < array1.length; i++){
            total += array1[i];
            mean = total/array1.length;
        }
        return mean;
    }

    public static void reverse(int[] data){
        int[] array1 = data;
        int[] array2 = data;

        for (int i = 0; i < array1.length; i++){
            array1[i] = array2[array1.length - i - 1];
        }

        for (int i = 0; i < array1.length; i++){
            System.out.print(array2[i] + ", ");
        }
    }

    public static int search(int[] haystack, int needle){
        int location = -1;
        for (int i = 0; i < haystack.length; i++){
            if(haystack[i] == needle){
                location = i;
            }
        }
        return location;
    }

    public static void sort(int[] data){
        for (int i = 0; i < data.length - 1; i++){
            if (data[i] > data[i + 1]){
                int temp = data[i];
                data[i] = data[i + 1];
                data[i + 1] = temp;
                i = 0;
            }
        }
    }
}


