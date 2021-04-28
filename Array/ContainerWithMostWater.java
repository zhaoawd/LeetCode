package Array;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while(i!=j) {
            int area = (j-i) * Math.min(height[i],height[j]);
            if (max < area) {
                max = area;
            }
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }
}
