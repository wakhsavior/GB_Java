package tasks.Seminar_03_HW;


public class Task01 {
    public static int[] sortMerge(int[] array) {
        int length = array.length;
        int middleElem = length / 2;
        if (length < 2) {
//            System.out.println(Arrays.toString(array));
            return array;
        }
        else {
            int[] leftArray = new int[middleElem];
            int[] rightArray = new int[length - middleElem];
            System.arraycopy(array, 0, leftArray, 0,middleElem);
            System.arraycopy(array, middleElem, rightArray,0, length - middleElem);
//            System.out.println(Arrays.toString(leftArray));
//            System.out.println(Arrays.toString(rightArray));
            int[] leftSorted = sortMerge(leftArray);
            int[] rightSorted = sortMerge(rightArray);
            int leftSortedLength = leftSorted.length;
            int rightSortedLength = rightSorted.length;
            int resultArrayLength = leftSortedLength+rightSortedLength;
            int[] resultArray = new int[resultArrayLength];
            int leftElemCount = 0;
            int rightElemCount = 0;
            int i =0;
            while(leftElemCount < leftSortedLength && rightElemCount < rightSortedLength){
                if (leftSorted[leftElemCount] < rightSorted[rightElemCount]) {
                    resultArray[i] = leftSorted[leftElemCount];
                    leftElemCount ++;
                }
                else {
                    resultArray[i] = rightSorted[rightElemCount];
                    rightElemCount++;
                }
                i++;
            }
            for (int j = leftElemCount; j < leftSortedLength; j++) {
                resultArray[i] = leftSorted[j];
                i++;
            }
            for (int k = rightElemCount; k < rightSortedLength; k++) {
                resultArray[i] = rightSorted[k];
                i++;
            }

            return resultArray;
        }

    }
}
