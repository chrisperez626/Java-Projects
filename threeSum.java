public class threeSum {

    static void threeSum(Integer[] array){

        int sum = 0;
        for(int i = 0; i < array.length - 2; i++) {

            // Fix the second element as A[j]
            for(int j = i + 1; j < array.length - 1; j++) {

                // Now look for the third number
                for(int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == sum) {
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
                        return true;
                    }
                }
            }
        }

        return false;
    }




    public static void main(String[] args){

        threeSum triplet = new threeSum();
        Integer[] A = { 1, 4, 45, 6, 10, 8 };


        triplet.threeSum(A);

    }
}