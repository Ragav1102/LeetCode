class MedianFinder {
    PriorityQueue<Integer> max;
    PriorityQueue<Integer> min;

    public MedianFinder() {
        max = new PriorityQueue<>(Collections.reverseOrder());
        min = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        max.add(num);
        min.add(max.poll());
        if (min.size() > max.size()) {
            max.add(min.poll());
        }
    }
    
    public double findMedian() {
        if (max.size() > min.size()) {
            return max.peek();
        }
        return (max.peek() + min.peek())/2.0;
    }
}

