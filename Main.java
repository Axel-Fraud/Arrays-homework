class Main {
  public static void main(String[] args) {
    int[] a = new int[]{1, 2, 3, 2, 1};
    int[] b = new int[]{1, 2, 3, 4, 5};
    System.out.println(aRray(a));
    System.out.println(aRray(b));
    System.out.println('c' < 'd');

arrayTest();

}



static boolean aRray(int[] arr) {
  if(arr[0] == arr[arr.length-1]){
    return true;
  }
  else{
  return false;
  }
}

static void arrayTest(){
while(true){
  int[] arr = new int[10];
  for(int i=0; i<arr.length; i++){
    arr[i] = (int)(Math.random()*20);
  }
  System.out.println(aRray(arr));
  if(aRray(arr) == true){
    System.out.println();
    for( int num: arr){
      System.out.println(num + " ");   
    }
       break;
  }

}

}


}

   // return arr[0] == arr[arr.length - 1];

   

   /*Write a method that takes in an array of integers and returns the sum of the integers in the array. 

   Write a method that takes in an array of strings and returns the total number of letters of all the strings.
   
    5. Write a method that takes in an array of integers and returns true if the integer 0 is contained within the array.
   
    6. Write a method that takes in an integer N and returns an array with N random doubles between 0 and 
   10 In your main method, call this method and print out the resulting array. 
   */
   