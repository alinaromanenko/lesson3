package lesson3;

class ProductNotValid extends Exception{
    ProductNotValid(String message){
        System.out.println(message);
    }
}
