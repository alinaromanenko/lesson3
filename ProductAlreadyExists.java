package lesson3;

class ProductAlreadyExists extends Exception{
    ProductAlreadyExists(String message){
        System.out.println(message);
    }
}
