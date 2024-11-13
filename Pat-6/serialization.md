### 1. How to Perform Serialization and get and recieve data from the user
-Always use `public class (Any Name) extends Serializable` and then make functions in it and add a constructor in it.

Now to Read the Values we use the the line

`try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("savings.ser"))) {
SavingsData loadedData = (SavingsData) ois.readObject();
System.out.println(loadedData.category);} 

catch (IOException | ClassNotFoundException e) {
e.printStackTrace();
}`
        
