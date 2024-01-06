package MergeSortedArray;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[m+n];
        int i=0, j=0, k=0;
        while (i<m && j<n)
        {
            if(nums1[i] < nums2[j])
                tmp[k++] = nums1[i++];
            else
                tmp[k++] = nums2[j++];
        }
        while (i<m)
            tmp[k++] = nums1[i++];
        while (j<n)
            tmp[k++] = nums2[j++];
        for(int ii=0; ii<nums1.length; ii++) {
            nums1[ii] = tmp[ii];
        }
    }
}
