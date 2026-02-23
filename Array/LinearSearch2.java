public class LinearSearch2 {
    public static int StringLinear(String[] food, String key) {
        for(int i = 0; i<food.length; i++){
            if(food[i] == "Idli"){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String food[] = {"Dosa", "Chowmien", "Idli", "Burger", "Pizza"};
        String key = "Idli";

        int index= StringLinear(food, key);
        if(index == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key Found");
        }
    }
}
