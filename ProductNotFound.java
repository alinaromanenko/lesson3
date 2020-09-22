package lesson3;

class ProductNotFound extends RuntimeException{
    ProductNotFound(String message){
        System.out.println(message);
    }
}
