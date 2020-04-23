/**

We have a collection of stones, each stone has a positive integer weight.

Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
*/

class Solution {
    public int lastStoneWeight(int[] stones) {
        // 1. iterate over the array
        // 2. find out max and maxIndex
        // 3. find out 2nd max and 2nd max Index
        // 4. perform max - max2
        // 5. set values into the indices
        // 6. repeat step 1 to 5 untill array exhausts
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(stones.length, Collections.reverseOrder());
        for (Integer each: stones) {
            maxHeap.offer(each);
        }
        while(maxHeap.size() != 1) {
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            int smashResult = y - x;
            maxHeap.add(smashResult);
        }
        return maxHeap.remove();
    }
}