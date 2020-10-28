

class Main {
  public static void main(String[] args) {
    int[] numbers={12,67,56,2,3,4,5,6,7,856,9,78,67,54,34,56,66,78,98,76,54};
    int big=numbers[0];
    int i=0;
   for (i=1;i<numbers.length;i=i+1){
      if(numbers[i]>big){
        big=numbers[i];
      }
   }
   System.out.println(big);
  }
}

