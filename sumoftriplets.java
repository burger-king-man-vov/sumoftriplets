
class SumTriplets {
     
    static void PrintArray(int arr[]){
      for (int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
      }
      System.out.println("Before");
    }

    static void Sumoftriplets(int arr[],int specificsum){
       int length = arr.length;

       for (int i = 0;i<length;i++){
           if(i+1<length && i-1 != -1){
            int firstnum = arr[i];
            int secondnum = arr[i-1];
            int thirdnum = arr[i+1];

           if (firstnum+secondnum+thirdnum != specificsum) {
                System.out.println("SUM DOESNT EXIST");

            }
            if (firstnum+secondnum+thirdnum==specificsum){
               System.out.println("THE THREE NUMBERS: "+firstnum+","+secondnum+","+thirdnum+" TOGETHER: "+specificsum);
            }
             
           }
       }
    }
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
       
        PrintArray(numbers);

        Sumoftriplets(numbers, 44);

    }
}
