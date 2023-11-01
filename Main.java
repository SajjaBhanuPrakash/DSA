class Main {
  public static void findNemo(String[] array) {
    for(int i=0;i < array.length; i++) {
      if(array[i].equals("nemo") ) {
        System.out.println("FoundNemo");
      }
    }
  }
  
  public static void main(String[] args) {
    final String[] nemo = {"nemo"};
    findNemo(nemo);
    
  }
}
