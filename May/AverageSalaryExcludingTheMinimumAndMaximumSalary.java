class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        long sum = 0;
        int n = salary.length;
        for(int i=0;i<n;i++){
            if(salary[i]<=min){
                min = salary[i];
            }
            if(salary[i]>=max){
                max = salary[i];
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(salary[i]!=max && salary[i]!=min){
                sum += salary[i];
                count++;
            }
        }
        return ((double)sum/count);
    }
}

/*
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */