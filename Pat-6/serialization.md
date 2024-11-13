### 1. How to Perform Serialization and get and recieve data from the user
-Always use `public class (Any Name) extends Serializable` and then make functions in it and add a constructor in it.

Now to Read the Values we use the the line

`ObjectInputStream ois = new ObjectInputStream(new FileInputStream("savings.ser"))` Include in the try and catch function
`SavingsData loadedData = (SavingsData) ois.readObject();` It is used to get the data from the Object 
`System.out.println(loadedData.category);` Then Print it using the values You want
Same for Output just use `ois.writeObject("Any Object");`
        
