import java.util.Set;
import java.util.HashSet;

public class PropertyCollection {
  private Set<Property> collection;

  public PropertyCollection() {
    this.collection = new HashSet<>();
  }

  // Add a property to the collection
  public void addProperty(Property p) {
    collection.add(p);
  }

  // Return the set of all houses in the collection
  public Set<House> getHouses() {
    return collection.stream().filter(instanceof House).toSet;
  }

  // Return the set of all bungalows in the collection
  public Set<Bungalow> getBungalows();

  // Return the set of all flats in the collection
  public Set<Flat> getFlats();

  // Return the set of all maisonettes in the collection
  public Set<Maisonette> getMaisonettes();

  // Return the set of all terraced houses in the collection
  public Set<TeracedHouse> getTerracedHouses();
}
