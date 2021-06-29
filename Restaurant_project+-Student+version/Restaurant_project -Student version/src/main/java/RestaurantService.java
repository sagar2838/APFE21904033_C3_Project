import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    List<Restaurant> restaurants = new ArrayList<Restaurant>();

    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException {

        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
        for (Restaurant restaurant : restaurants){
            if(restaurant.getName().equals(restaurantName)){
                return restaurant;
            }
            else{
                throw new restaurantNotFoundException("No Restaurant Found");
            }
        }
        return null;

    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
